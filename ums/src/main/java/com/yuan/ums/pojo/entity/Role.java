package com.yuan.ums.pojo.entity;

import com.yuan.ums.base.entity.BaseEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>角色实体信息</b>
 * @Name Role
 * @Description
 * @Author admin
 * @Date 2020/12/30 21:56
 * @Version 2.0
 */
public class Role extends BaseEntity {
	private static final long serialVersionUID = 5158361525917842614L;
	private Long id;
	private String name;

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
}
