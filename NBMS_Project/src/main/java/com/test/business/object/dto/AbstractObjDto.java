package com.test.business.object.dto;

import java.util.List;
import java.util.Map;

public abstract class AbstractObjDto<T> {
	
	private List<T> list;
	
	private Map<String,Object> map;
	
//	private Operation operation;
	
	private Boolean isExcel;

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

//	public Operation getOperation() {
//		return operation;
//	}
//
//	public void setOperation(Operation operation) {
//		this.operation = operation;
//	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public Boolean getIsExcel() {
		return isExcel;
	}

	public void setIsExcel(Boolean isExcel) {
		this.isExcel = isExcel;
	}
	
}
