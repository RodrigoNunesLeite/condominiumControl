package com.api.condominiumcontrol.services.exception;

public class RegisterExistException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7577676641826456913L;
	
	public RegisterExistException(String msg) {
		super(msg);
	}
}
