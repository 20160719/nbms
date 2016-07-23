package com.test.persistence.service.business;

import java.util.List;
import javax.annotation.Resource;
import com.test.persistence.AbstractService;
import com.test.persistence.entity.business.book.Book;
import com.test.persistence.entity.business.book.BookHis;
import com.test.persistence.entity.business.book.BookType;
import com.test.persistence.entity.business.book.BookTypeHis;
import com.test.persistence.entity.system.Operation;
import com.test.persistence.mapper.business.book.BookHisMapper;
import com.test.persistence.mapper.business.book.BookTypeHisMapper;
import com.test.persistence.mapper.business.userbook.UserBookDetailMapper;
import com.test.system.exception.SystemServiceException;
import com.test.system.util.BeanUtil;

public abstract class AbstractBusinessService extends AbstractService {

	@Resource(name = "bookHisMapper")
	private BookHisMapper bookHisMapper;

	@Resource(name = "bookTypeHisMapper")
	private BookTypeHisMapper bookTypeHisMapper;

	@Resource(name = "userBookDetailMapper")
	protected UserBookDetailMapper userBookDetailMapper;

	/**
	 * 将List<BookHis>集和对象保存到数据库
	 * 
	 * @param list
	 * @return
	 * @throws SystemServiceException
	 * @return int TODO
	 */
	private int createBookHis(List<BookHis> list) throws SystemServiceException {
		try {
			return this.bookHisMapper.creates(list);
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		}
	}

	/**
	 * 将List<Book>集和对象转化为List<BookHis>集和对象 并调用createHis(List<BookHis>)方法
	 * 
	 * @param bookList
	 * @param operation
	 * @return
	 * @throws SystemServiceException
	 * @return int TODO
	 */
	protected int createBookHis(List<Book> bookList, Operation operation)
			throws SystemServiceException {
		List<BookHis> bookHis = null;
		try {
			bookHis = BeanUtil.copyList(bookList, BookHis.class);
			bookHis = BeanUtil.copyOperation2His(operation, bookHis);
			return createBookHis(bookHis);
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		} finally {
			clear(bookList);
			clear(bookHis);
		}
	}

	/**
	 * 将List<BookTypeHis>集和对象保存到数据库
	 * 
	 * @param list
	 * @return
	 * @throws SystemServiceException
	 * @return int TODO
	 */
	private int createBookTypeHis(List<BookTypeHis> list)
			throws SystemServiceException {
		try {
			return this.bookTypeHisMapper.creates(list);
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		}
	}

	/**
	 * 将List<BookType>集合的对象转化为List<BookTypeHis>集和对象，并调用createHis(List<
	 * BookTypeHis>)方法
	 * 
	 * @param bookTypeList
	 * @param operation
	 * @return
	 * @throws SystemServiceException
	 * @return int TODO
	 */
	protected int createBookTypeHis(List<BookType> bookTypeList,
			Operation operation) throws SystemServiceException {
		List<BookTypeHis> bookTypeHis = null;
		try {
			bookTypeHis = BeanUtil.copyList(bookTypeList, BookTypeHis.class);
			bookTypeHis = BeanUtil.copyOperation2His(operation, bookTypeHis);
			return createBookTypeHis(bookTypeHis);
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		} finally {
			clear(bookTypeList);
			clear(bookTypeHis);
		}
	}

	
}
