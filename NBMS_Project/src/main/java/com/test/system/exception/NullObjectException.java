package com.test.system.exception;

import com.test.system.commons.ExceptionCommons;

public class NullObjectException extends SystemTopException {

	private static final long serialVersionUID = 3725320647876057279L;

	public NullObjectException(String message) {
		super(ExceptionCommons.NULL_OBJECT_EXCEPTION + message);
	}
	
}
