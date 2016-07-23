package com.test.persistence.entity.system;

public class User extends Account {

	private static final long serialVersionUID = -203705855814182566L;

	private String userId;

	private String userName;

	private String userSex;

	private Integer userAge;

	private String birthday;

	private String address;

	public User() {

	}

	public User(String account, String password) {
		// super(account, password);
		this.setAccount(account).setPassword(password);
		// System.out.println("user:"+this.toString());
	}

	public String getUserId() {
		return userId;
	}

	public User setUserId(String userId) {
		this.userId = userId;
		return this;
	}

	public String getUserName() {
		return userName;
	}

	public User setUserName(String userName) {
		this.userName = userName;
		return this;
	}

	public String getUserSex() {
		return userSex;
	}

	public User setUserSex(String userSex) {
		this.userSex = userSex;
		return this;
	}

	public Integer getUserAge() {
		return userAge;
	}

	public User setUserAge(Integer userAge) {
		this.userAge = userAge;
		return this;
	}

	public String getBirthday() {
		return birthday;
	}

	public User setBirthday(String birthday) {
		this.birthday = birthday;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public User setAddress(String address) {
		this.address = address;
		return this;
	}

	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer("User ");
		buf.append("[account=" + account).append(", password=" + password)
				.append(", userId=" + userId).append(", userName=" + userName)
				.append(", userSex=" + userSex).append(", userAge=" + userAge)
				.append(", birthday=" + birthday)
				.append(", address=" + address).append("]");
		return buf.toString();
	}

}
