package com.goujia.website.base.vo;

/**
 * Copyright 2014-2015 www.goujiawang.com
 * All rights reserved.
 * 
 * @project website-base
 * @author Wangfeng
 * @version 2.0
 * @date 2015年6月2日
 */
public class BaseSearchParam{
	
	private Integer pageNo;			//页号
	private Integer pageSize;		//页数
	private String order;			//排序方式
	private String orderBy;			//排序字段

	public Integer getPageNo() {
		return pageNo == null?1:pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public Integer getPageSize() {
		return pageSize == null?15:pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	
}
