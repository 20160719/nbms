package com.test.persistence.mapper.system.user;

import java.util.List;
import java.util.Map;

import com.test.persistence.BaseMapper;
import com.test.persistence.entity.business.book.Book;
import com.test.persistence.entity.system.User;

import org.apache.ibatis.annotations.Param;


public interface UserMapper extends BaseMapper<User> {
	
	/**
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 * @return List<Map<String,Object>>
	 * TODO
	 */
	public abstract List<Map<String,Object>> queryBookMap(@Param("map") Map<String, Object> map) throws Exception;

	/**
	 * 根据 account 获取用户信息
	 * @param account
	 * @return
	 * @throws Exception
	 * @return User
	 * TODO
	 */
	public abstract User loadByAccount(@Param("account") String account) throws Exception;
	
	/**
	 * 根据userId获取图书信息
	 * @param userId
	 * @return
	 * @throws Exception
	 * @return List<Book>
	 * TODO
	 */
	public abstract List<Book> queryBooksByUserId(@Param("userId") String userId) throws Exception;
	
}
