package com.test.persistence.service.business.userbook;

import java.util.List;

import com.test.persistence.entity.business.ub.UserBook;
import com.test.persistence.entity.business.ub.UserBookDetail;
import com.test.system.exception.SystemServiceException;

public interface UserBookService {

	public abstract Integer[] createUserBooks(UserBook ub, List<UserBookDetail> ubd) throws SystemServiceException;

	public abstract Integer[] modifyUserBooks(UserBook ub, List<UserBookDetail> ubd) throws SystemServiceException;

	public abstract Integer[] deleteUserBooks(UserBook ub, List<UserBookDetail> ubd) throws SystemServiceException;

	public abstract List<UserBook> queryUserBooks(UserBook ub) throws SystemServiceException;

	public abstract List<UserBookDetail> queryUserBookDetails(UserBookDetail ubd) throws SystemServiceException;

}
