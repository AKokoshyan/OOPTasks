package com.vignettTaskExeptions;

public class InvalidVignettException extends Exception {

	public InvalidVignettException() {

	}

	public String getMessage() {
		String text = "The data which you entered is invalid!";
		return text;
	}
}
