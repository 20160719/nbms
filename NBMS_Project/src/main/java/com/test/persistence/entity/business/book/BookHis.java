package com.test.persistence.entity.business.book;

import java.io.Serializable;

public class BookHis implements Serializable{

	private static final long serialVersionUID = -1233638489992247392L;

	private String bookId;
	
	private String bookName;
	
	private String bookAuthor;
	
	private String bookTypeId;
	
	private String bookImage;
	
	private String bookPublicTime;
	
	private Integer bookPrice;
	
	private String userId;

	private String operId;

	private String operTime;

	private String operType;

	private String operRemark;

	public String getBookId() {
		return bookId;
	}

	public BookHis setBookId(String bookId) {
		this.bookId = bookId;
		return this;
	}

	public String getBookName() {
		return bookName;
	}

	public BookHis setBookName(String bookName) {
		this.bookName = bookName;
		return this;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public BookHis setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
		return this;
	}

	public String getBookTypeId() {
		return bookTypeId;
	}

	public BookHis setBookTypeId(String bookTypeId) {
		this.bookTypeId = bookTypeId;
		return this;
	}

	public String getBookImage() {
		return bookImage;
	}

	public BookHis setBookImage(String bookImage) {
		this.bookImage = bookImage;
		return this;
	}

	public String getBookPublicTime() {
		return bookPublicTime;
	}

	public BookHis setBookPublicTime(String bookPublicTime) {
		this.bookPublicTime = bookPublicTime;
		return this;
	}

	public Integer getBookPrice() {
		return bookPrice;
	}

	public BookHis setBookPrice(Integer bookPrice) {
		this.bookPrice = bookPrice;
		return this;
	}

	public String getUserId() {
		return userId;
	}

	public BookHis setUserId(String userId) {
		this.userId = userId;
		return this;
	}

	public String getOperId() {
		return operId;
	}

	public BookHis setOperId(String operId) {
		this.operId = operId;
		return this;
	}

	public String getOperTime() {
		return operTime;
	}

	public BookHis setOperTime(String operTime) {
		this.operTime = operTime;
		return this;
	}

	public String getOperType() {
		return operType;
	}

	public BookHis setOperType(String operType) {
		this.operType = operType;
		return this;
	}

	public String getOperRemark() {
		return operRemark;
	}

	public BookHis setOperRemark(String operRemark) {
		this.operRemark = operRemark;
		return this;
	}

	@Override
	public String toString() {
		return "BookHis [bookId=" + bookId + ", bookName=" + bookName
				+ ", bookAuthor=" + bookAuthor + ", bookTypeId=" + bookTypeId
				+ ", bookImage=" + bookImage + ", bookPublicTime="
				+ bookPublicTime + ", bookPrice=" + bookPrice + ", operId="
				+ operId + ", operTime=" + operTime + ", operType=" + operType
				+ ", operRemark=" + operRemark + "]";
	}

}
