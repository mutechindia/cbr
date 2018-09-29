package com.pp.exception;

public class CustomizedException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String message;

	public CustomizedException(String message) {
		super(message);
		this.message = message;
	}

	@Override
	public String toString() {
		return message;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
