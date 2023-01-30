package com.api.condominiumcontrol.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.api.condominiumcontrol.services.exception.RegisterExistException;
import com.api.condominiumcontrol.services.exception.StandardError;

@ControllerAdvice
public class ValidObjectException {
	
	@ExceptionHandler(RegisterExistException.class)
	public ResponseEntity<StandardError> registerExistException(RegisterExistException e, HttpServletRequest request){
		HttpStatus status = HttpStatus.CONFLICT;
		StandardError err = new StandardError(System.currentTimeMillis(),status.value(),"Registro já existe",
				e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}

}
