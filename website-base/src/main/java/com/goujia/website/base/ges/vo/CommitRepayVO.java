package com.goujia.website.base.ges.vo;

import com.goujia.goujiabao.model.GYJRequest;
import com.goujia.lychee.model.IViewObject;

public class CommitRepayVO  extends GYJRequest implements IViewObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String commitURL;

	public String getCommitURL() {
		return commitURL;
	}

	public void setCommitURL(String commitURL) {
		this.commitURL = commitURL;
	}
}
