package com.test.system.util;

import org.apache.commons.lang.StringUtils;

import com.test.system.exception.NullObjectException;

import java.util.*;

public final class ToolUtil {

	private ToolUtil() {

	}

	/**
	 * 获取 ID
	 * 
	 * @return
	 */
	public static String getId() {
		return UUID.randomUUID().toString().replace("-", "");
	}

	/**
	 * 判断 obj 是否为 NULL
	 * 
	 * @param obj
	 * @return
	 */
	public static boolean objIsNull(Object obj) {
		return null == obj;
	}

	/**
	 * 判断 obj 是否不为 NULL
	 * 
	 * @param obj
	 * @return
	 */
	public static boolean objIsNotNull(Object obj) {
		return null != obj;
	}

	public static boolean arrayLenthIsZero(Object[] obj) {
		return 0 == obj.length;
	}

	/**
	 * 判断字符串是否为""
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNotBlank(String str) {
		return StringUtils.isNotBlank(str);
	}

	/**
	 * 对象为空时抛出异常
	 * 
	 * @param obj
	 * @param msg
	 * @throws NullObjectException
	 */
	public static <T> void objectIsNull(T obj, String msg) throws NullObjectException {
		if (objIsNull(obj)) {
			throw new NullObjectException("Parameter can not be null :" );
		}
	}

	/**
	 *
	 * @param <T>
	 * @return
     */
	public static <T> List<T> getList() {
		return new ArrayList<T>();
	}

	/**
	 * 返回map对象
	 * @return
	 */
	public static Map<String, Object> getMap() {
		return new HashMap<String, Object>();
	}

}
