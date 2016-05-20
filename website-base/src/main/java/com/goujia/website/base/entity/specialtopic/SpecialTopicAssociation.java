package com.goujia.website.base.entity.specialtopic;

import java.util.Date;

public class SpecialTopicAssociation {
	private Integer id;						//主键
	private String contentType;				//关联内容类型(问题|文章|话题 question|article|topic)
	private Integer topicId;				//专题的ID
	private Integer associaedContentId;		//相关内容的ID
	private Date gmtCreate;					//创建时间

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType == null ? null : contentType.trim();
	}

	public Integer getTopicId() {
		return topicId;
	}

	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}

	public Integer getAssociaedContentId() {
		return associaedContentId;
	}

	public void setAssociaedContentId(Integer associaedContentId) {
		this.associaedContentId = associaedContentId;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
}