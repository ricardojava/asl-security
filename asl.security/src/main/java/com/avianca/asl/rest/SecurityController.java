package com.avianca.asl.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * 
 * @author CBYK - Ricardo Almeida
 * @since 16/06/2016
 * @version 1.0.0
 */

@Path("/test")
public class SecurityController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	 	@GET
	    @Produces(MediaType.APPLICATION_JSON)
	    @Path("/test")
	    public String message() {
	        return "teste okay";
	    }

}
