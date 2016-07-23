package com.test.system.log;

import com.test.system.util.ToolUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class SystemLogger {

	private static Logger logger = LoggerFactory.getLogger(SystemLogger.class);

	protected String userId;

	/**
	 * 获取userId
	 * 
	 * @return
	 * @return String TODO
	 */
	public String getUserId() {
		return this.userId;
	}

	/**
	 * 将obj对象清空
	 * 
	 * @param obj
	 * @return void TODO
	 */
	protected void clear(Object obj) {
		if (ToolUtil.objIsNotNull(obj))
			obj = null;
	}

	protected void error(String message) {
		logger.error(message);
	}

	protected void error(String code, String message) {
		logger.error(code, message);
	}

	protected void info(String message) {
		logger.info(message);
	}

}
