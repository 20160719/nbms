package com.test.business.object.result;

public class Result {
	
	private String retCode;
	
	private String retMesg;
	
	private String retRemark;

	public String getRetCode() {
		return retCode;
	}

	public Result setRetCode(String retCode) {
		this.retCode = retCode;
		return this;
	}

	public String getRetMesg() {
		return retMesg;
	}

	public Result setRetMesg(String retMesg) {
		this.retMesg = retMesg;
		return this;
	}

	public String getRetRemark() {
		return retRemark;
	}

	public Result setRetRemark(String retRemark) {
		this.retRemark = retRemark;
		return this;
	}

}
