package com.vignettTaskExeptions;

public class InvalidDriverDataException extends Exception {

	@Override
	public String getMessage() {
		String message = "Invalid date for Driver!";
		return message;
	}
}
