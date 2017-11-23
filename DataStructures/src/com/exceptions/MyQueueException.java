package com.exceptions;

public class MyQueueException extends Exception{
	
	@Override
	public String getMessage() {
		return "Invalide date for Queue";
	}
}
