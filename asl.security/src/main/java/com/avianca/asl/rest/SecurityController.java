package com.avianca.asl.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;



/**
 * 
 * @author CBYK - Ricardo Almeida
 * @since 16/06/2016
 * @version 1.0.0
 */

@Path("/")
@Component
public class SecurityController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/*
	@GET
    @Produces(MediaType.APPLICATION_ATOM_XML)
    @Path("/hello")
    public String hello() {
        return "Hello World";
    }*/

}
