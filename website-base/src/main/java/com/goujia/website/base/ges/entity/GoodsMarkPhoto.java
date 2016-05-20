/**
 * Copyright 2014-2015 goujia.com
 * All rights reserved.
 * 
 * @project
 * @author jipengfei
 * @version 1.0
 * @date 2014-06-12
 */
package com.goujia.website.base.ges.entity;

/**
 * 产品包房间细节图片锚点关系
 * 
 * @author jipengfei
 * @date 2014-06-12
 *
 */
public class GoodsMarkPhoto{
	
	/**
	 * 锚点ID
	 * G_GOODS_MARK.ID
	 */
	private Integer markId;
	
	/**
	 * 图片地址
	 */
	private String photoPath;

	public Integer getMarkId() {
		return markId;
	}

	public void setMarkId(Integer markId) {
		this.markId = markId;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
	
}