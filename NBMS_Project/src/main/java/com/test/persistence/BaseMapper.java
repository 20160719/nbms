package com.test.persistence;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;


public interface BaseMapper<T> extends AbstractMapper<T> {

	/**
	 * 查询信息
	 * @param record
	 * @return
	 * @throws Exception
	 * @return List<T>
	 * TODO
	 */
	public abstract List<T> querys(@Param("record") T record) throws Exception;

	/**
	 * 查询信息 以Map对象返回
	 * @param map
	 * @return
	 * @throws Exception
	 * @return List<T>
	 * TODO
	 */
	public abstract List<T> querysByMap(@Param("map") Map<String, Object> map) throws Exception;

	/**
	 * 根据 objId查询信息
	 * @param objId
	 * @return
	 * @throws Exception
	 * @return T
	 * TODO
	 */
	public abstract T loadById(@Param("objId") String objId) throws Exception;
	

}
