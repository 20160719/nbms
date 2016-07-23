package com.test.persistence.entity.system;

public class Menu {

	// 菜单ID
	private String menuId;
	// 菜单父级ID
	private String menuParentId;
	// 菜单名称
	private String menuName;
	// 菜单URL
	private String menuUrl;
	// 菜单可见性   1有效: 0:无效
	private String menuIsValid;
	// 菜单层级
	private Integer menuLevel;
	// 菜单创建人
	private String menuUserId;
	// 菜单创建时间
	private String menuCreateTime;
	// 菜单序列
	private String menuSeq;
	// 菜单说明
	private String menuRemark;
	
	public Menu() {
		
	}

	public Menu(String menuName, String menuUrl, Integer menuLevel, String menuCreateTime) {
		this.menuName = menuName;
		this.menuUrl = menuUrl;
		this.menuLevel = menuLevel;
		this.menuCreateTime = menuCreateTime;
	}

	public String getMenuId() {
		return menuId;
	}

	public Menu setMenuId(String menuId) {
		this.menuId = menuId;
		return this;
	}

	public String getMenuParentId() {
		return menuParentId;
	}

	public Menu setMenuParentId(String menuParentId) {
		this.menuParentId = menuParentId;
		return this;
	}

	public String getMenuName() {
		return menuName;
	}

	public Menu setMenuName(String menuName) {
		this.menuName = menuName;
		return this;
	}

	public String getMenuUrl() {
		return menuUrl;
	}

	public Menu setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
		return this;
	}

	public String getMenuIsValid() {
		return menuIsValid;
	}

	public Menu setMenuIsValid(String menuIsValid) {
		this.menuIsValid = menuIsValid;
		return this;
	}

	public Integer getMenuLevel() {
		return menuLevel;
	}

	public Menu setMenuLevel(Integer menuLevel) {
		this.menuLevel = menuLevel;
		return this;
	}

	public String getMenuCreateTime() {
		return menuCreateTime;
	}

	public Menu setMenuCreateTime(String menuCreateTime) {
		this.menuCreateTime = menuCreateTime;
		return this;
	}

	public String getMenuUserId() {
		return menuUserId;
	}

	public Menu setMenuUserId(String menuUserId) {
		this.menuUserId = menuUserId;
		return this;
	}

	public String getMenuSeq() {
		return menuSeq;
	}

	public Menu setMenuSeq(String menuSeq) {
		this.menuSeq = menuSeq;
		return this;
	}

	public String getMenuRemark() {
		return menuRemark;
	}

	public Menu setMenuRemark(String menuRemark) {
		this.menuRemark = menuRemark;
		return this;
	}

}
