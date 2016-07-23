package com.test.persistence.entity.business.ub;

public class UserBookDetail {

	private String borrowId;

	private String userId;

	private String bookId;

	private String bookName;

	// 1:一换 0:未还
	private String isReturn;
	
	private String returnTime; 

	public UserBookDetail() {
		this(null, null, null, null, null, null);
	}

	public UserBookDetail(String borrowId, String userId, String bookId) {
		this(borrowId, userId, bookId, null, null, null);
	}

	public UserBookDetail(String borrowId, String userId, String bookId, String bookName) {
		this(borrowId, userId, bookId, bookName, null, null);
	}

	public UserBookDetail(String borrowId, String userId, String bookId, String bookName, String isReturn,String returnTime) {
		this.borrowId = borrowId;
		this.userId = userId;
		this.bookId = bookId;
		this.bookName = bookName;
		this.isReturn = isReturn;
		this.returnTime = returnTime;
	}

	public String getBorrowId() {
		return borrowId;
	}

	public UserBookDetail setBorrowId(String borrowId) {
		this.borrowId = borrowId;
		return this;
	}

	public String getUserId() {
		return userId;
	}

	public UserBookDetail setUserId(String userId) {
		this.userId = userId;
		return this;
	}

	public String getBookId() {
		return bookId;
	}

	public UserBookDetail setBookId(String bookId) {
		this.bookId = bookId;
		return this;
	}

	public String getBookName() {
		return bookName;
	}

	public UserBookDetail setBookName(String bookName) {
		this.bookName = bookName;
		return this;
	}

	public String getIsReturn() {
		return isReturn;
	}

	public UserBookDetail setIsReturn(String isReturn) {
		this.isReturn = isReturn;
		return this;
	}

	public String getReturnTime() {
		return returnTime;
	}

	public UserBookDetail setReturnTime(String returnTime) {
		this.returnTime = returnTime;
		return this;
	}

}
