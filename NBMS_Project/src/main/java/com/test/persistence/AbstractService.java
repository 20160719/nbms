package com.test.persistence;

import java.util.List;
import com.test.system.exception.NullObjectException;
import com.test.system.exception.SystemServiceException;
import com.test.system.log.SystemLogger;
import com.test.system.util.ToolUtil;

public abstract class AbstractService extends SystemLogger {
	
	/**
	 * 获取服务层异常
	 * @param resultMesg
	 * @return
	 * @return SystemServiceException
	 * TODO
	 */
	protected SystemServiceException getSystemServiceException(String resultMesg) {
		return new SystemServiceException(resultMesg);
	}
	
	/**
	 * 获取a、b 的最大值
	 * @param a
	 * @param b
	 * @return
	 * @return int
	 * TODO
	 */
	protected int getMax(int a, int b) {
		return ((a > b) ? a : b);
	}
	
	/**
	 * 返回 Integer 数组
	 * @param size
	 * @return
	 * @return Integer[]
	 * TODO
	 */
	protected Integer[] getIntArray(int size){
		return new Integer[size];
	}
	
	

	/**
	 * 将数组转为list集合 并返回list
	 * @param objs
	 * @return
	 * @throws NullObjectException 
	 */
	protected <T> List<T> add(T[] objs) throws NullObjectException {
		if(ToolUtil.objIsNull(objs)){
			throw new NullObjectException("array objs is null");
		}
		if(ToolUtil.arrayLenthIsZero(objs)){
			throw new NullObjectException("array objs length is zero");
		}
		List<T> list = ToolUtil.getList();
		for (int i = 0; i < objs.length; i++) {
			list.add(objs[i]);
		}
		return list;
	}
	
	protected <T> void add(T obj){
		
	}
	
}
