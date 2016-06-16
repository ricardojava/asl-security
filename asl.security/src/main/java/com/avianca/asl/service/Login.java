package com.avianca.asl.service;

import com.avianca.asl.domain.Authorization;

/**
 * 
 * @author CBYK - Ricardo Almeida
 * @since 16/06/2016
 * @version 1.0.0
 */
public interface Login {
	
	public Authorization logar(com.avianca.asl.domain.User objLogin) throws Exception;
	public Authorization loginTest(com.avianca.asl.domain.User objLogin)throws Exception;

}
