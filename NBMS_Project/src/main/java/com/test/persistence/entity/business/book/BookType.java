package com.test.persistence.entity.business.book;

import com.test.persistence.AbstractModel;

public class BookType extends AbstractModel {

	private static final long serialVersionUID = 970007664411908522L;
	// 图书类型ID
	private String bookTypeId;
	// 图书类型名称
	private String bookTypeName;
	// 父级图书类型ID
	private String bookTypeParentId;
	// 图书类型层级
	private Integer bookTypeLevel;
	// 图书类型排序
	private String bookTypeSeq;
	// 图书类型描述
	private String bookTypeRemark;
	
	public BookType() {
		
	}

	public BookType(String bookTypeName) {
		this(bookTypeName, null, null, null, null);
	}

	public BookType(String bookTypeName, String bookTypeParentId) {
		this(bookTypeName, bookTypeParentId, null, null, null);
	}

	public BookType(String bookTypeName, String bookTypeParentId, Integer bookTypeLevel, String bookTypeSeq, String bookTypeRemark) {
		this.bookTypeName = bookTypeName;
		this.bookTypeParentId = bookTypeParentId;
		this.bookTypeLevel = bookTypeLevel;
		this.bookTypeSeq = bookTypeSeq;
		this.bookTypeRemark = bookTypeRemark;
	}

	public String getBookTypeId() {
		return bookTypeId;
	}

	public BookType setBookTypeId(String bookTypeId) {
		this.bookTypeId = bookTypeId;
		return this;
	}

	public String getBookTypeName() {
		return bookTypeName;
	}

	public BookType setBookTypeName(String bookTypeName) {
		this.bookTypeName = bookTypeName;
		return this;
	}

	public String getBookTypeParentId() {
		return bookTypeParentId;
	}

	public BookType setBookTypeParentId(String bookTypeParentId) {
		this.bookTypeParentId = bookTypeParentId;
		return this;
	}

	public String getBookTypeRemark() {
		return bookTypeRemark;
	}

	public BookType setBookTypeRemark(String bookTypeRemark) {
		this.bookTypeRemark = bookTypeRemark;
		return this;
	}

	public Integer getBookTypeLevel() {
		return bookTypeLevel;
	}

	public BookType setBookTypeLevel(Integer bookTypeLevel) {
		this.bookTypeLevel = bookTypeLevel;
		return this;
	}

	public String getBookTypeSeq() {
		return bookTypeSeq;
	}

	public BookType setBookTypeSeq(String bookTypeSeq) {
		this.bookTypeSeq = bookTypeSeq;
		return this;
	}

	@Override
	public String toString() {
		return "BookType [bookTypeId=" + bookTypeId + ", bookTypeName="
				+ bookTypeName + ", bookTypeParentId=" + bookTypeParentId
				+ ", bookTypeRemark=" + bookTypeRemark + ", bookTypeLevel="
				+ bookTypeLevel + ", bookTypeSeq=" + bookTypeSeq + "]";
	}

}
