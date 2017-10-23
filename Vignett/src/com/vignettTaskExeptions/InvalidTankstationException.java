package com.vignettTaskExeptions;

public class InvalidTankstationException extends Exception {
	@Override
	public String getMessage() {
		String text = "Invalid data for tank station!";
		return text;
	}
}
