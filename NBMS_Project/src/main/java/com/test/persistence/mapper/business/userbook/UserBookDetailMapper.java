package com.test.persistence.mapper.business.userbook;

import com.test.persistence.AbstractMapper;
import com.test.persistence.entity.business.ub.UserBookDetail;

import java.util.List;

public interface UserBookDetailMapper extends AbstractMapper<UserBookDetail> {

	public abstract List<UserBookDetail> queryUserBookDetails(UserBookDetail userBookDetail) throws Exception;
	
}
