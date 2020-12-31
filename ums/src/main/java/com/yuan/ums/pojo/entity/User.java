package com.yuan.ums.pojo.entity;

import com.yuan.ums.base.entity.BaseEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>用户实体信息</b>
 * @Name User
 * @Description
 * @Author admin
 * @Date 2020/12/30 21:58
 * @Version 2.0
 */
public class User extends BaseEntity {
	private static final long serialVersionUID = -2105027642150701238L;
	private Long id;
	private String name;
	private String cellphone;
	private String password;
	private Role role;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
