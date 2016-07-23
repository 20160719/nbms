package com.test.persistence.mapper.business.book;

import com.test.persistence.BaseMapper;
import com.test.persistence.entity.business.book.BookType;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookTypeMapper extends BaseMapper<BookType> {
	
	public abstract List<BookType> queryByBookTypeIds(@Param("list") List<BookType> list) throws Exception;

}
