package com.test.persistence.service.business.book.impl;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.test.persistence.entity.business.book.Book;
import com.test.persistence.entity.system.Operation;
import com.test.persistence.mapper.business.book.BookMapper;
import com.test.persistence.service.business.AbstractBusinessService;
import com.test.persistence.service.business.book.BookService;
import com.test.system.exception.SystemServiceException;
import com.test.system.page.ExtendedPageInfo;

@Service(value = "bookServiceImpl")
public class BookServiceImpl extends AbstractBusinessService implements BookService {

	@Resource(name = "bookMapper")
	private BookMapper bookMapper;
	
	public Integer createBooks(List<Book> list) throws SystemServiceException {
		try {
			return this.bookMapper.creates(list);
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		}
	}

	public Integer[] modifyBooks(List<Book> list, Operation operation) throws SystemServiceException {
		operation.setOperateType(Operation.OPER_UPDATE);
		Integer[] result = this.getIntArray(2);
		try {
			result[0] = createBookHis(queryByBookIds(list), operation);
			result[1] = this.bookMapper.modifys(list);
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		}
		return result;
	}

	public Integer[] deleteBooks(List<Book> list, Operation operation) throws SystemServiceException {
		operation.setOperateType(Operation.OPER_DELETE);
		Integer[] result = new Integer[2];
		try {
			result[0] = createBookHis(queryByBookIds(list), operation);
			result[1] = this.bookMapper.deletes(list);
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		}
		return result;
	}

	public ExtendedPageInfo<Book> queryBooks(Map<String, Object> map,
			boolean isPage) throws SystemServiceException {
		try {
			if (isPage) {
				PageHelper.startPage(
						Integer.parseInt(map.get("page").toString()),
						Integer.parseInt(map.get("rows").toString()), true);
			}
			return new ExtendedPageInfo<Book>(this.bookMapper.querysByMap(map));
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		}
	}

	public ExtendedPageInfo<Book> queryBooks(Book book) throws SystemServiceException {
		try {
			PageHelper.startPage(book.getPage(), book.getRows(), true);
			return new ExtendedPageInfo<Book>(this.bookMapper.querys(book));
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		}
	}

	public Book loadByBookId(String bookId) throws SystemServiceException {
		try {
			return this.bookMapper.loadById(bookId);
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		}
	}

	public List<Book> queryByBookIds(List<Book> list) throws SystemServiceException {
		try {
			return this.bookMapper.queryByBookIds(list);
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		}
	}

}
