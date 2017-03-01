package com.java.exceptions;

/**
 * @author dkeshav PaySlip class
 */
public class PaySlipNotFoundException extends RuntimeException implements IAppUserDefinedExceptionHandler {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1462366870248343922L;
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

	public PaySlipNotFoundException(int errorCode, String errorMessage) {
		super(errorCode + ":" + errorMessage);
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

}
