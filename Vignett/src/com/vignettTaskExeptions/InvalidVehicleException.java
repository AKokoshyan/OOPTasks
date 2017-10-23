package com.vignettTaskExeptions;

public class InvalidVehicleException extends Exception {

	@Override
	public String getMessage() {
		String text = "Invalid date for vehicle!";
		return text;
	}
}
