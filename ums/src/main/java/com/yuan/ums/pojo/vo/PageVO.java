package com.yuan.ums.pojo.vo;

import com.yuan.ums.util.ConstantUtil;

import java.io.Serializable;
import java.util.List;

/**
 * <b>系统分页视图信息</b>
 * @Name PageVO
 * @Description
 * @Author admin
 * @Date 2020/12/30 21:44
 * @Version 2.0
 */
public class PageVO<E> implements Serializable {
	private static final long serialVersionUID = 4757164801943033899L;
	private Integer pageNum;
	private Integer pageSize;
	private List<E> list;
	private Long totalCount;
	private Integer totalPage;

	public PageVO() {}

	public PageVO(Integer pageNum, Integer pageSize) {
		if (pageNum != null && pageNum > 0){
			this.pageNum = pageNum;
		}else {
			this.pageNum = ConstantUtil.PAGE_NUM;
		}
		if (pageSize != null && pageSize > 0){
			this.pageSize = pageSize;
		}else {
			this.pageSize = ConstantUtil.PAGE_SIZE;
		}
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<E> getList() {
		return list;
	}

	public void setList(List<E> list) {
		this.list = list;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
}
