package com.test.persistence.entity.system;

import java.io.Serializable;
import java.sql.Timestamp;

public class Operation implements Cloneable, Serializable {

	private static final long serialVersionUID = -3823133456168080756L;

	// 导出记录
	public static final String OPER_EXCCEL = "E";
	// 查询记录
	public static final String OPER_QUERYS = "Q";
	// 插入记录
	public static final String OPER_CREATE = "I";
	// 删除记录
	public static final String OPER_DELETE = "D";
	// 修改记录
	public static final String OPER_UPDATE = "U";

	// 操作ID
	private String operateId;
	// 用户ID
	private String userId;
	// 操作时间
	private Timestamp operateTime;
	// 操作类型
	private String operateType;
	// 操作说明
	private String operateRemark;

	public String getOperateId() {
		return operateId;
	}

	public Operation setOperateId(String operateId) {
		this.operateId = operateId;
		return this;
	}

	public String getUserId() {
		return userId;
	}

	public Operation setUserId(String userId) {
		this.userId = userId;
		return this;
	}

	public Timestamp getOperateTime() {
		return operateTime;
	}

	public Operation setOperateTime(Timestamp operateTime) {
		this.operateTime = operateTime;
		return this;
	}

	public String getOperateType() {
		return operateType;
	}

	public Operation setOperateType(String operateType) {
		this.operateType = operateType;
		return this;
	}

	public String getOperateRemark() {
		return operateRemark;
	}

	public Operation setOperateRemark(String operateRemark) {
		this.operateRemark = operateRemark;
		return this;
	}

}
