package com.exceptions;

public class StackException extends Exception {

	@Override
	public String getMessage() {
		String text = "Error with MyStack occured";
		return text;
	}
}
