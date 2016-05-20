package com.goujia.website.base.vo.topic;

import java.util.Date;

import com.goujia.website.base.entity.topic.TopicArticle;

public class TopicArticleVo extends TopicArticle {

	/** 文章 */
	private String articleName;
    /** 文章id*/
	private Integer id;
    /***/
	private Date gmtCreate;
    /***/
	private Integer userId;

	private String userName;				
	private String articleImage;			//文章图片
	private String articleIntroduction;		//文章简介

	public String getArticleImage() {
		return articleImage;
	}

	public void setArticleImage(String articleImage) {
		this.articleImage = articleImage;
	}

	public String getArticleIntroduction() {
		return articleIntroduction;
	}

	public void setArticleIntroduction(String articleIntroduction) {
		this.articleIntroduction = articleIntroduction;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
    
}
