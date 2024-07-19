package com.exception;

public class Custom_Excep extends RuntimeException {
	@override
	public String getMessage() {
		return "Custom Exception";
	}
	
}
