package com.java.exceptions;

public class ErrorModel {

	private int errorCode;
	private String errorMessage;
	private String errorLink;

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

	public String getErrorLink() {
		return errorLink;
	}

	public void setErrorLink(String errorLink) {
		this.errorLink = errorLink;
	}

	public ErrorModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ErrorModel(int errorCode, String errorMessage, String errorLink) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.errorLink = errorLink;
	}

	@Override
	public String toString() {
		return "ErrorModel [errorCode=" + errorCode + ", errorMessage=" + errorMessage + ", errorLink=" + errorLink
				+ "]";
	}

}
