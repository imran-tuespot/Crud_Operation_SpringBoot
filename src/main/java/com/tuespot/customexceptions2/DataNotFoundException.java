package com.tuespot.customexceptions2;

public class DataNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public DataNotFoundException(String message) {
		super(message);
	}
	
	
}
