package com.java.exceptions;

public class DepartmentNotFoundException extends RuntimeException implements IAppUserDefinedExceptionHandler {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6425495184675982576L;
	private int errorCode;
	private String errorMessage;

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public DepartmentNotFoundException(int errorCode, String errorMessage) {
		//super(errorCode+":"+errorMessage);
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	

}
