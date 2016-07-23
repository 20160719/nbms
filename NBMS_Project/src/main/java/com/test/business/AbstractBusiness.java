package com.test.business;

import java.util.List;
import com.test.business.object.result.ReturnResult;
import com.test.system.exception.SystemBusinessException;
import com.test.system.util.ToolUtil;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public abstract class AbstractBusiness<T> {

	protected ReturnResult<T> returnResult = new ReturnResult<T>();

	/**
	 * 将obj对象清空
	 * @param obj
	 * @return void
	 * TODO
	 */
	protected void clear(Object obj) {
		if (obj instanceof ReturnResult) {
			return;
		}
		if (ToolUtil.objIsNotNull(obj))
			obj = null;
	}

	/**
	 * 获取Workbook 对象
	 * @return
	 * @return Workbook
	 * TODO
	 */
	protected Workbook createWorkBook() {
		return new XSSFWorkbook();
	}
	
	/**
	 * 获取业务层异常
	 * @param message
	 * @return SystemBusinessException
	 * TODO
	 */
	protected SystemBusinessException getSystemBusinessException(String message) {
		return getSystemBusinessException(null, message);
	}
	
	/**
	 * 获取业务层异常
	 * @param resultCode
	 * @param message
	 * @return SystemBusinessException
	 * TODO
	 */
	protected SystemBusinessException getSystemBusinessException(String resultCode,String message) {
		return getSystemBusinessException(resultCode, message);
	}
	
	/**
	 * @return List<T>
	 * TODO
	 */
	protected List<T> getList(){
		return ToolUtil.getList();
	}

}
