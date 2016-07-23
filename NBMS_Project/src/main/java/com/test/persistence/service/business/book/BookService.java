package com.test.persistence.service.business.book;

import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import com.test.persistence.entity.business.book.Book;
import com.test.persistence.entity.system.Operation;
import com.test.system.exception.SystemServiceException;
import com.test.system.page.ExtendedPageInfo;


public interface BookService {
	
	
	public abstract Integer createBooks(@Required List<Book> list) throws SystemServiceException;
	
	
	public abstract Integer[] modifyBooks(@Required List<Book> list, @Required Operation operation) throws SystemServiceException;
	
	
	public abstract Integer[] deleteBooks(@Required List<Book> list, @Required Operation operation) throws SystemServiceException;

	
	public abstract ExtendedPageInfo<Book> queryBooks(@Required Map<String, Object> map, boolean isPage) throws SystemServiceException;
	
	
	public abstract ExtendedPageInfo<Book> queryBooks(@Required Book book) throws SystemServiceException;
	
	
	public abstract Book loadByBookId(@Required String bookId) throws SystemServiceException;
	
	
	public abstract List<Book> queryByBookIds(@Required List<Book> list) throws SystemServiceException;
	
}
