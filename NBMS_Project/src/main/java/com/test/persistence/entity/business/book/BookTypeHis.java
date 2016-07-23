package com.test.persistence.entity.business.book;

public class BookTypeHis {
	private String bookTypeId;
	private String bookTypeName;
	private Integer bookNumbers;

	public BookTypeHis() {
		this(null);
	}

	public BookTypeHis(String bookTypeName) {
		this(bookTypeName, null);
	}

	public BookTypeHis(String bookTypeName, Integer bookNumbers) {
		this.bookTypeName = bookTypeName;
		this.bookNumbers = bookNumbers;
	}

	public String getBookTypeId() {
		return bookTypeId;
	}

	public void setBookTypeId(String bookTypeId) {
		this.bookTypeId = bookTypeId;
	}

	public BookTypeHis setBookTypeIds(String bookTypeIds) {
		this.bookTypeId = bookTypeIds;
		return this;
	}

	public String getBookTypeName() {
		return bookTypeName;
	}

	public void setBookTypeName(String bookTypeName) {
		this.bookTypeName = bookTypeName;
	}

	public BookTypeHis setBookTypeNames(String bookTypeNames) {
		this.bookTypeName = bookTypeNames;
		return this;
	}

	public Integer getBookNumbers() {
		return bookNumbers;
	}

	public BookTypeHis setBookNumbers(Integer bookNumbers) {
		this.bookNumbers = bookNumbers;
		return this;
	}

	@Override
	public String toString() {
		return "BookType [bookTypeId=" + bookTypeId + ", bookTypeName="
				+ bookTypeName + ", bookNumbers=" + bookNumbers + "]";
	}

}
