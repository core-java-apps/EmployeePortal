package com.java.exceptions;

public class EmployeeNotFoundException extends RuntimeException implements IAppUserDefinedExceptionHandler {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int errorCode;
	private String errorMessage;

	public EmployeeNotFoundException(int errorCode, String errorMessage) {
		super(errorCode+":"+errorMessage);
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public EmployeeNotFoundException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
		
	}

}
