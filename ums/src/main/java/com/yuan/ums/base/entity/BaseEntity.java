package com.yuan.ums.base.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>基础实体信息</b>
 * @Name baseController
 * @Description
 * @Author admin
 * @Date 2020/12/30 22:24
 * @Version 2.0
 */
public class BaseEntity implements Serializable {
	private static final long serialVersionUID = 6444430541773055264L;
	private Integer begin;
	private Integer size;
	private Integer status;
	private Date createTime;
	private Date updateTime;

	public Integer getBegin() {
		return begin;
	}

	public void setBegin(Integer begin) {
		this.begin = begin;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
