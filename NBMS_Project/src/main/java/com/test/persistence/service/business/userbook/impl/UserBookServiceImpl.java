package com.test.persistence.service.business.userbook.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.test.persistence.entity.business.ub.UserBook;
import com.test.persistence.entity.business.ub.UserBookDetail;
import com.test.persistence.mapper.business.userbook.UserBookMapper;
import com.test.persistence.service.business.AbstractBusinessService;
import com.test.persistence.service.business.userbook.UserBookService;
import com.test.system.exception.SystemServiceException;


@Service("userBookServiceImpl")
public class UserBookServiceImpl extends AbstractBusinessService implements UserBookService {

	@Resource(name="userBookMapper")
	private UserBookMapper userBookMapper;

	public Integer[] createUserBooks(UserBook ub, List<UserBookDetail> ubd) throws SystemServiceException {
		Integer[] result = getIntArray(2);
		try {
			result[0] = this.userBookMapper.creates(add(new UserBook[]{ub}));
			result[1] = this.userBookDetailMapper.creates(ubd);
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		}
		return result;
	}

	public Integer[] modifyUserBooks(UserBook ub, List<UserBookDetail> ubd)
			throws SystemServiceException {
		Integer[] result = getIntArray(2);
		try {
			result[0] = this.userBookMapper.modifys(add(new UserBook[] { ub }));
			result[1] = this.userBookDetailMapper.modifys(ubd);
		} catch (Exception e) {
			throw getSystemServiceException(e.getMessage());
		} 
		return result;
	}

	public Integer[] deleteUserBooks(UserBook ub, List<UserBookDetail> ubd)
			throws SystemServiceException {
		Integer[] result = getIntArray(2);
		try {
			result[0] = this.userBookMapper.deletes(add(new UserBook[] { ub }));
			result[1] = this.userBookDetailMapper.deletes(ubd);
		} catch (Exception e) {
			throw getSystemServiceException(e.getMessage());
		} 
		return result;
	}

	public List<UserBook> queryUserBooks(UserBook ub)
			throws SystemServiceException {
		try {
			return this.userBookMapper.queryUserBookRelations(ub);
		} catch (Exception e) {
			throw getSystemServiceException(e.getMessage());
		}
	}

	public List<UserBookDetail> queryUserBookDetails(UserBookDetail ubd)
			throws SystemServiceException {
		try {
			return this.userBookDetailMapper.queryUserBookDetails(ubd);
		} catch (Exception e) {
			throw getSystemServiceException(e.getMessage());
		}
	}




}
