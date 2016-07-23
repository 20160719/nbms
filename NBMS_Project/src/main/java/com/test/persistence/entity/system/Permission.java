package com.test.persistence.entity.system;

public class Permission {
	private String permissionId;
	private String permissionUrl;
	private String permissionDesc;
	public String getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(String permissionId) {
		this.permissionId = permissionId;
	}
	public String getPermissionUrl() {
		return permissionUrl;
	}
	public void setPermissionUrl(String permissionUrl) {
		this.permissionUrl = permissionUrl;
	}
	public String getPermissionDesc() {
		return permissionDesc;
	}
	public void setPermissionDesc(String permissionDesc) {
		this.permissionDesc = permissionDesc;
	}
	@Override
	public String toString() {
		return "Permission [permissionId=" + permissionId + ", permissionUrl="
				+ permissionUrl + ", permissionDesc=" + permissionDesc + "]";
	}
	
}
