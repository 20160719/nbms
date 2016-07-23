package com.test.system.exception;

import com.test.system.commons.ExceptionCommons;

/**
 * 业务异常�?
 * 
 * @author asus
 *
 */
public class SystemBusinessException extends SystemTopException {

	private static final long serialVersionUID = -7385409666879883667L;

	public SystemBusinessException(String message) {
		super(message);
	}
	
	public SystemBusinessException(String resultCode, String message) {
		super(resultCode, ExceptionCommons.BUSINESS_EXCEPTION + message);
	}

}
