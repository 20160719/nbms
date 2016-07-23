package com.test.business;

import com.test.business.object.dto.AbstractObjDto;
import com.test.business.object.result.ReturnResult;
import com.test.system.exception.SystemBusinessException;

public interface ModifyAcceptor<T> {

	/**
	 * 业务修改
	 * @param objDto
	 * @return
	 * @throws SystemBusinessException
	 * @return ReturnResult<T>
	 * TODO
	 */
	public abstract ReturnResult<T> modifyAcceptor(AbstractObjDto<T> objDto) throws SystemBusinessException;
	
}
