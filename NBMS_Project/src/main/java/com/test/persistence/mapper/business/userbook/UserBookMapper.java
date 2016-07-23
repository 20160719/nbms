package com.test.persistence.mapper.business.userbook;

import com.test.persistence.AbstractMapper;
import com.test.persistence.entity.business.ub.UserBook;

import java.util.List;

public interface UserBookMapper extends AbstractMapper<UserBook> {

	public abstract List<UserBook> queryUserBookRelations(UserBook userBookRelation) throws Exception;

	
}
