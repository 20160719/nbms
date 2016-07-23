package com.test.system.util;

import java.sql.Timestamp;
import java.util.Date;

public final class DateUtil {
	
	public static String FORMAT_DATETIME = "yyyy-MM-dd hh:mm:ss";
	public static String FORMAT_DATE = "yyyy-MM-dd";
	
	/**
	 * 获取当前日期时间
	 * @return
	 */
	public static Timestamp getNowTime() {
		return new Timestamp(new Date().getTime());
	}
	
	/**
	 * 获取当前日期
	 * @return
	 */
	public static Date getNowDate() {
		return new Date();
	}


}
