package com.test.persistence.entity.business.ub;

import com.test.persistence.AbstractModel;

public class UserBook extends AbstractModel {

	private static final long serialVersionUID = 6684898093138582429L;

	// 借阅ID
	private String borrowId;

	// 用户ID
	private String userId;

	// 借阅表述
	private String borrowDesc;

	// 借阅时间
	private String borrowDate;

	// 借阅图书数量
	private Integer borrowNum;

	// 已还图书数量
	private Integer returnNum;

	public UserBook() {
		this(null, null, null, null, null, null);
	}

	public UserBook(String borrowId) {
		this(borrowId, null, null, null, null, null);
	}

	public UserBook(String borrowId, String userId) {
		this(borrowId, userId, null, null, null, null);
	}

	public UserBook(String borrowId, String userId, String borrowDesc) {
		this(borrowId, userId, borrowDesc, null, null, null);
	}

	public UserBook(String borrowId, String userId, String borrowDesc,
			String borrowDate) {
		this(borrowId, userId, borrowDesc, borrowDate, null, null);
	}

	public UserBook(String borrowId, String userId, String borrowDesc,
			String borrowDate, Integer borrowNum) {
		this(borrowId, userId, borrowDesc, borrowDate, borrowNum, null);
	}

	public UserBook(String borrowId, String userId, String borrowDesc,
			String borrowDate, Integer borrowNum, Integer returnNum) {
		this.borrowId = borrowId;
		this.userId = userId;
		this.borrowDesc = borrowDesc;
		this.borrowDate = borrowDate;
		this.borrowNum = borrowNum;
		this.returnNum = returnNum;
	}

	public String getBorrowId() {
		return borrowId;
	}

	public UserBook setBorrowId(String borrowId) {
		this.borrowId = borrowId;
		return this;
	}

	public String getUserId() {
		return userId;
	}

	public UserBook setUserId(String userId) {
		this.userId = userId;
		return this;
	}

	public String getBorrowDesc() {
		return borrowDesc;
	}

	public UserBook setBorrowDesc(String borrowDesc) {
		this.borrowDesc = borrowDesc;
		return this;
	}

	public String getBorrowDate() {
		return borrowDate;
	}

	public UserBook setBorrowDate(String borrowDate) {
		this.borrowDate = borrowDate;
		return this;
	}

	public Integer getBorrowNum() {
		return borrowNum;
	}

	public UserBook setBorrowNum(Integer borrowNum) {
		this.borrowNum = borrowNum;
		return this;
	}

	public Integer getReturnNum() {
		return returnNum;
	}

	public UserBook setReturnNum(Integer returnNum) {
		this.returnNum = returnNum;
		return this;
	}

}
