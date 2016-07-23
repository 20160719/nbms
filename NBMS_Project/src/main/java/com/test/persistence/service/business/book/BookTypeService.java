package com.test.persistence.service.business.book;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;

import com.test.persistence.entity.business.book.BookType;
import com.test.persistence.entity.system.Operation;
import com.test.system.exception.SystemServiceException;
import com.test.system.page.ExtendedPageInfo;

public interface BookTypeService {
	
	public abstract Integer createBookTypes(@Required List<BookType> list) throws SystemServiceException;
	
	public abstract Integer[] modifyBookTypes(@Required List<BookType> list, Operation operation) throws SystemServiceException;
	
	public abstract Integer[] deleteBookTypes(@Required List<BookType> list, Operation operation) throws SystemServiceException;

	public abstract ExtendedPageInfo<BookType> queryBookTypes(@Required Map<String, Object> map) throws SystemServiceException;
	
	public abstract ExtendedPageInfo<BookType> queryBookTypes(@Required BookType bookType) throws SystemServiceException;
	
	public abstract List<BookType> queryByBookTypeIds(@Required List<BookType> list) throws SystemServiceException;
	
	public abstract BookType loadByBookTypeId(@Required String bookTypeId) throws SystemServiceException;
	
}
