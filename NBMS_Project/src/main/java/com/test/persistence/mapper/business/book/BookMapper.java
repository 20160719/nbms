package com.test.persistence.mapper.business.book;

import com.test.persistence.BaseMapper;
import com.test.persistence.entity.business.book.Book;

import java.util.List;

public interface BookMapper extends BaseMapper<Book> {
	
	/**
	 * 根据 bookTypeId查询图书信息
	 * @param bookTypeId
	 * @return
	 * @throws Exception
	 * @return List<Book>
	 * TODO
	 */
	public abstract List<Book> queryBooksByBookTypeId(String bookTypeId) throws Exception;

	/**
	 * 根据list集合查询Book信息
	 * @param list
	 * @return
	 * @throws Exception
	 * @return List<Book>
	 * TODO
	 */
	public abstract List<Book> queryByBookIds(List<Book> list) throws Exception;
	
	
}
