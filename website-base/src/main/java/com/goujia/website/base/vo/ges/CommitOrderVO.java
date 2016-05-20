package com.goujia.website.base.vo.ges;

import com.goujia.goujiabao.model.GYJRequest;
import com.goujia.lychee.model.IViewObject;
import com.goujia.website.base.ges.entity.Order;

public class CommitOrderVO extends GYJRequest implements IViewObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String commitURL;
	private String jumpurl;
	private String noticeurl;
	private Order order;

	
	
	public String getCommitURL() {
		return commitURL;
	}

	public void setCommitURL(String commitURL) {
		this.commitURL = commitURL;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getJumpurl() {
		return jumpurl;
	}

	public void setJumpurl(String jumpurl) {
		this.jumpurl = jumpurl;
	}

	public String getNoticeurl() {
		return noticeurl;
	}

	public void setNoticeurl(String noticeurl) {
		this.noticeurl = noticeurl;
	}
	
	
	

}
