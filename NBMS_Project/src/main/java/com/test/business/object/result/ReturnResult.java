package com.test.business.object.result;

import java.util.List;
import java.util.Map;
import com.test.system.page.ExtendedPageInfo;
import org.apache.poi.ss.usermodel.Workbook;

public class ReturnResult<T> extends Result {

	private Integer intResult;

	private String strResult;
	
	private T obj;

	private List<T> listResult;

	private Map<String, Object> mapResult;

	private ExtendedPageInfo<T> pageResult;

	private ExtendedPageInfo<Map<String, Object>> mapPageResult;
	
	private Workbook workBook;

	public Integer getIntResult() {
		return intResult;
	}

	public ReturnResult<T> setIntResult(Integer intResult) {
		this.intResult = intResult;
		return this;
	}

	public String getStrResult() {
		return strResult;
	}

	public ReturnResult<T> setStrResult(String strResult) {
		this.strResult = strResult;
		return this;
	}

	public T getObj() {
		return obj;
	}

	public ReturnResult<T> setObj(T obj) {
		this.obj = obj;
		return this;
	}

	public List<T> getListResult() {
		return listResult;
	}

	public ReturnResult<T> setListResult(List<T> listResult) {
		this.listResult = listResult;
		return this;
	}

	public Map<String, Object> getMapResult() {
		return mapResult;
	}

	public ReturnResult<T> setMapResult(Map<String, Object> mapResult) {
		this.mapResult = mapResult;
		return this;
	}

	public ExtendedPageInfo<T> getPageResult() {
		return pageResult;
	}

	public ReturnResult<T> setPageResult(ExtendedPageInfo<T> pageResult) {
		this.pageResult = pageResult;
		return this;
	}

	public ExtendedPageInfo<Map<String, Object>> getMapPageResult() {
		return mapPageResult;
	}

	public ReturnResult<T> setMapPageResult(ExtendedPageInfo<Map<String, Object>> mapPageResult) {
		this.mapPageResult = mapPageResult;
		return this;
	}

	public Workbook getWorkBook() {
		return workBook;
	}

	public ReturnResult<T> setWorkBook(Workbook workBook) {
		this.workBook = workBook;
		return this;
	}

}
