package com.test.business;

import com.test.business.object.dto.AbstractObjDto;
import com.test.business.object.result.ReturnResult;
import com.test.system.exception.SystemBusinessException;

public interface QueryAcceptor<T> {

	/**
	 * 业务查询
	 * @param objDto
	 * @return
	 * @throws SystemBusinessException
	 * @return ReturnResult<T>
	 * TODO
	 */
	public abstract ReturnResult<T> queryAcceptor(AbstractObjDto<T> objDto) throws SystemBusinessException;
	
}
