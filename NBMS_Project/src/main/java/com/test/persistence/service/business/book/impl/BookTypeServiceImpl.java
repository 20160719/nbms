package com.test.persistence.service.business.book.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.test.persistence.entity.business.book.BookType;
import com.test.persistence.entity.system.Operation;
import com.test.persistence.mapper.business.book.BookTypeMapper;
import com.test.persistence.service.business.AbstractBusinessService;
import com.test.persistence.service.business.book.BookTypeService;
import com.test.system.exception.SystemServiceException;
import com.test.system.page.ExtendedPageInfo;

@Service(value = "bookTypeServiceImpl")
public class BookTypeServiceImpl extends AbstractBusinessService implements
		BookTypeService {

	@Resource(name = "bookTypeMapper")
	private BookTypeMapper bookTypeMapper;

	public Integer createBookTypes(List<BookType> list)
			throws SystemServiceException {
		try {
			return this.bookTypeMapper.creates(list);
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		}
	}

	public Integer[] modifyBookTypes(List<BookType> list, Operation operation)
			throws SystemServiceException {
		operation.setOperateType(Operation.OPER_UPDATE);
		Integer[] result = getIntArray(2);
		try {
			result[0] = createBookTypeHis(queryByBookTypeIds(list), operation);
			result[1] = this.bookTypeMapper.modifys(list);
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		}
		return result;
	}

	public Integer[] deleteBookTypes(List<BookType> list, Operation operation)
			throws SystemServiceException {
		operation.setOperateType(Operation.OPER_DELETE);
		Integer[] result = getIntArray(2);
		try {
			result[0] = createBookTypeHis(queryByBookTypeIds(list), operation);
			result[1] = this.bookTypeMapper.deletes(list);
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		}
		return result;
	}

	public ExtendedPageInfo<BookType> queryBookTypes(Map<String, Object> map)
			throws SystemServiceException {
		try {
			if ((Boolean) map.get("isPage")) {
				PageHelper.startPage(
						Integer.parseInt(map.get("page").toString()),
						Integer.parseInt(map.get("rows").toString()), true);
			}
			return new ExtendedPageInfo<BookType>(
					this.bookTypeMapper.querysByMap(map));
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		}
	}

	public ExtendedPageInfo<BookType> queryBookTypes(BookType bookType)
			throws SystemServiceException {
		try {
			List<BookType> list = this.bookTypeMapper.querys(bookType);
			return new ExtendedPageInfo<BookType>(list);
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		}
	}

	public BookType loadByBookTypeId(String bookTypeId)
			throws SystemServiceException {
		try {
			return this.bookTypeMapper.loadById(bookTypeId);
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		}
	}

	public List<BookType> queryByBookTypeIds(List<BookType> list)
			throws SystemServiceException {
		try {
			return this.bookTypeMapper.queryByBookTypeIds(list);
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		}
	}

}
