package com.test.system.exception;

public class SystemTopException extends Exception {

	private static final long serialVersionUID = -2543738909076919407L;

	private String resultCode;

	private String resultMessage;

	/**
	 * 初始化SystemTopException对象
	 * @param message
	 */
	public SystemTopException(String message) {
		this(null, message);
	}

	
	/**
	 * 初始化SystemTopException对象
	 * @param resultCode
	 * @param message
	 */
	public SystemTopException(String resultCode, String message) {
		super(message);
		this.resultCode = resultCode;
		this.resultMessage = message;
	}

	public String getResultCode() {
		return resultCode;
	}

	public String getResultMessage() {
		return resultMessage;
	}

}
