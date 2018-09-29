package com.pp.exception;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.pp.controller.LoginController;

@ControllerAdvice
public class GlobleExceptionHandler {

	private static Logger log = Logger.getLogger(LoginController.class);

	@ExceptionHandler(RuntimeException.class)
	@ResponseStatus(value = HttpStatus.BAD_GATEWAY, reason = "IOException occured")
	public void handleIOException() {
		log.error("IOException handler executed");
		System.out.println("exception");
		// returning 404 error code
	}

}
