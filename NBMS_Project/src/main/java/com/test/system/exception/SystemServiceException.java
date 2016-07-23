package com.test.system.exception;

import com.test.system.commons.ExceptionCommons;

/**
 * 服务层异常类
 * 
 * @author asus
 *
 */
public class SystemServiceException extends SystemTopException {

	private static final long serialVersionUID = 3154304068671434916L;

	public SystemServiceException(String message) {
		super(ExceptionCommons.SERVICE_EXCEPTION + message);
	}
}
