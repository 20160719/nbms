package com.test.persistence;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AbstractMapper<T> {
	
	/**
	 * 将 list集合中的对象保存到数据库
	 * @param list
	 * @return
	 * @throws Exception
	 * @return int
	 * TODO
	 */
	public abstract Integer creates(@Param("list") List<T> list) throws Exception;
	
	/**
	 * 将 list集合中的对象从数据库删除
	 * @param list
	 * @return
	 * @throws Exception
	 * @return int
	 * TODO
	 */
	public abstract Integer deletes(@Param("list") List<T> list) throws Exception;
	
	
	/**
	 * 将 list集合中的对象更新到数据库
	 * @param list
	 * @return
	 * @throws Exception
	 * @return Integer
	 * TODO
	 */
	public abstract Integer modifys(@Param("list") List<T> list) throws Exception;

}
