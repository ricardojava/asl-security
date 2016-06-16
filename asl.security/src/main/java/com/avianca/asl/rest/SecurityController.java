package com.avianca.asl.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.avianca.asl.domain.Authorization;
import com.avianca.asl.service.LoginServiceImpl;

/**
 * 
 * @author CBYK - Ricardo Almeida
 * @since 16/06/2016
 * @version 1.0.0
 */

@RestController
public class SecurityController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private LoginServiceImpl usuarioService;
	
	@RequestMapping(value = "/login/user/{user}/pwd{pwd}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> retrieve(@PathVariable("user") String user,@PathVariable("pwd") String pwd) {
		//logger.info("SecurityController.retrive");	
		
		Authorization authorization = null;
		try {
			authorization = usuarioService.loginTest(user,pwd);
			
		} catch (Exception e) {
			return new ResponseEntity<String>("{\"error\":[{\"codigo\":\"" +HttpStatus.BAD_REQUEST+ "\"}]}", HttpStatus.OK);
		}		
		
	/*	return new ResponseEntity<Authorization>("{\"authentication\":[{\"sessao\":\"" + authorization.getSession() + "\"}]}", HttpStatus.OK);*/
		return new ResponseEntity<String>("{\"authentication\":[{\"sessao\":\""+authorization.getSession()+"\"}]}", HttpStatus.OK);
		
	}


}
