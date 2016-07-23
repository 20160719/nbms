package com.test.persistence.entity.system;

import com.test.persistence.AbstractModel;

public class Account extends AbstractModel {

	private static final long serialVersionUID = 1114042108705861956L;

	//账号
	protected String account;
	//密码
	protected String password;
	//用户身份ID
	protected String userTypeId;
	//用户身份名称
	protected String userTypeName;

	public Account() {

	}

	public Account(String account) {
		this(account, null);
	}

	public Account(String account, String password) {
		this(account, password, null);
	}

	public Account(String account, String password, String userTypeId) {
		this.account = account;
		this.password = password;
		this.userTypeId = userTypeId;
	}

	public String getAccount() {
		return account;
	}

	public Account setAccount(String account) {
		this.account = account;
		return this;
	}

	public String getPassword() {
		return password;
	}

	public Account setPassword(String password) {
		this.password = password;
		return this;
	}

	public String getUserTypeId() {
		return userTypeId;
	}

	public Account setUserTypeId(String userTypeId) {
		this.userTypeId = userTypeId;
		return this;
	}

	public String getUserTypeName() {
		return userTypeName;
	}

	public Account setUserTypeName(String userTypeName) {
		this.userTypeName = userTypeName;
		return this;
	}

}
