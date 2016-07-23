package com.test.persistence.entity.business.book;

import com.test.persistence.AbstractModel;

public class Book extends AbstractModel {

	private static final long serialVersionUID = -7827574791074488368L;

	// 图书ID
	private String bookId;
	// 图书名称
	private String bookName;
	// 图书作者
	private String bookAuthor;
	// 图书类型ID
	private String bookTypeId;
	// 图书图片
	private String bookImage;
	// 图书出版时间
	private String bookPublicTime;
	// 图书价格
	private Integer bookPrice;
	// 图书是否上架 1：已上架 0：未上架
	private String bookIsOnline;

	public Book() {

	}

	public Book(String bookName) {
		this(bookName, null, null, null, null, null);
	}

	public Book(String bookName, String bookTypeId) {
		this(bookName, bookTypeId, null, null, null, null);
	}

	public Book(String bookName, String bookTypeId, String bookAuthor) {
		this(bookName, bookTypeId, bookAuthor, null, null, null);
	}

	public Book(String bookName, String bookTypeId, String bookAuthor,
			String bookPublicTime) {
		this(bookName, bookTypeId, bookAuthor, null, bookPublicTime, null);
	}

	public Book(String bookName, String bookTypeId, String bookAuthor,
			String bookImage, String bookPublicTime) {
		this(bookName, bookTypeId, bookAuthor, bookImage, bookPublicTime, null);
	}

	public Book(String bookName, String bookTypeId, String bookAuthor,
			String bookImage, String bookPublicTime, Integer bookPrice) {
		this.bookName = bookName;
		this.bookTypeId = bookTypeId;
		this.bookAuthor = bookAuthor;
		this.bookImage = bookImage;
		this.bookPublicTime = bookPublicTime;
		this.bookPrice = bookPrice;
	}

	public String getBookId() {
		return bookId;
	}

	public Book setBookId(String bookId) {
		this.bookId = bookId;
		return this;
	}

	public String getBookName() {
		return bookName;
	}

	public Book setBookName(String bookName) {
		this.bookName = bookName;
		return this;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public Book setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
		return this;
	}

	public String getBookTypeId() {
		return bookTypeId;
	}

	public Book setBookTypeId(String bookTypeId) {
		this.bookTypeId = bookTypeId;
		return this;
	}

	public String getBookImage() {
		return bookImage;
	}

	public Book setBookImage(String bookImage) {
		this.bookImage = bookImage;
		return this;
	}

	public String getBookPublicTime() {
		return bookPublicTime;
	}

	public Book setPublicTime(String bookPublicTime) {
		this.bookPublicTime = bookPublicTime;
		return this;
	}

	public Integer getBookPrice() {
		return bookPrice;
	}

	public Book setBookPrice(Integer bookPrice) {
		this.bookPrice = bookPrice;
		return this;
	}

	public String getBookIsOnline() {
		return bookIsOnline;
	}

	public Book setBookIsOnline(String bookIsOnline) {
		this.bookIsOnline = bookIsOnline;
		return this;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName
				+ ", bookAuthor=" + bookAuthor + ", bookTypeId=" + bookTypeId
				+ ", bookImage=" + bookImage + ", bookPublicTime="
				+ bookPublicTime + ", bookPrice=" + bookPrice + "]";
	}

}
