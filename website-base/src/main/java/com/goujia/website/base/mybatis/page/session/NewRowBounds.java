package com.goujia.website.base.mybatis.page.session;

import org.apache.ibatis.session.RowBounds;

import com.goujia.website.base.utils.Page;
import com.goujia.website.base.vo.BaseSearchParam;

/** 
*
*
* @Project: website-base
* @File: NewRowBounds.java 
* @Date: 2015-5-28 
* @Author: wangfeng
*
*/

public class NewRowBounds extends RowBounds {

	private String orderBy;
	private String order;
	public final static NewRowBounds DEFAULT = new NewRowBounds();

	public NewRowBounds() {
		super();
	}

	@SuppressWarnings("rawtypes")
	public NewRowBounds(Page page) {
		super(page.getFirst(), page.getPageSize());
		this.orderBy = page.getOrderBy();
		this.order = page.getOrder();
	}
	
	public NewRowBounds(int offset, int limit, String orderBy, String order) {
		super(offset, limit);
		this.orderBy = orderBy;
		this.order = order;
	}
	public NewRowBounds(BaseSearchParam param) {
	    super(((param.getPageNo() - 1) * param.getPageSize()),param.getPageSize());
	}
	
	public NewRowBounds(String orderBy, String order){
		super();
		this.order = order;
		this.orderBy = orderBy;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public String getOrder() {
		return order;
	}
	
	
}

