package com.goujia.website.base.vo.article;

import java.util.List;

import com.goujia.website.base.entity.article.Article;
import com.goujia.website.base.entity.article.ArticleLabel;
import com.goujia.website.base.entity.article.Label;
import com.goujia.website.base.entity.topic.Topic;
import com.goujia.website.base.entity.topic.TopicLabel;





/**
 * Copyright 2014-2015 www.goujiawang.com
 * All rights reserved.
 * 
 * @project website-base
 * @author jiqijie
 * @version 2.0
 * @date 2015年6月2日
 */

public class ArticleVO extends Article{
	
	private String userName;
	private List<Label> categoryLabelList;
	private List<Label> styleLabelList;
	private List<Topic> topicList;
	private Integer totalReview;
	private Boolean hadRecommend;
	private Boolean hadCollection;
	private List<Label> labels;						//关联标签名字符串
	private String headImage;						//用户头像
	private Integer commentNum=0;						//评论个数
	private List<String> images;					//编辑器中的图片数组
	private List<TopicLabel> articleLabels;
	private Integer collectId;
	private List<ArticleLabel>  articleLabel;
	
	

	public List<ArticleLabel> getArticleLabel() {
        return articleLabel;
    }

    public void setArticleLabel(List<ArticleLabel> articleLabel) {
        this.articleLabel = articleLabel;
    }

    /** 
     * @return collectId 
     */
    
    public Integer getCollectId() {
        return collectId;
    }

    /** 
     * @param collectId 要设置的 collectId 
     */
    
    public void setCollectId(Integer collectId) {
        this.collectId = collectId;
    }

    /** 
     * @return articleLabels 
     */
    
    public List<TopicLabel> getArticleLabels() {
        return articleLabels;
    }

    /** 
     * @param articleLabels 要设置的 articleLabels 
     */
    
    public void setArticleLabels(List<TopicLabel> articleLabels) {
        this.articleLabels = articleLabels;
    }

    public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public Integer getCommentNum() {
		return commentNum;
	}

	public void setCommentNum(Integer commentNum) {
		this.commentNum = commentNum;
	}

	public String getHeadImage() {
		return headImage;
	}

	public void setHeadImage(String headImage) {
		this.headImage = headImage;
	}

	public List<Label> getLabels() {
		return labels;
	}

	public void setLabels(List<Label> labels) {
		this.labels = labels;
	}

	public Boolean getHadCollection() {
		return hadCollection;
	}

	public void setHadCollection(Boolean hadCollection) {
		this.hadCollection = hadCollection;
	}

	public Boolean getHadRecommend() {
		return hadRecommend;
	}

	public void setHadRecommend(Boolean hadRecommend) {
		this.hadRecommend = hadRecommend;
	}


	public Integer getTotalReview() {
		return totalReview;
	}

	public void setTotalReview(Integer totalReview) {
		this.totalReview = totalReview;
	}

	public List<Topic> getTopicList() {
		return topicList;
	}

	public void setTopicList(List<Topic> topicList) {
		this.topicList = topicList;
	}

	public List<Label> getCategoryLabelList() {
		return categoryLabelList;
	}

	public void setCategoryLabelList(List<Label> categoryLabelList) {
		this.categoryLabelList = categoryLabelList;
	}

	public List<Label> getStyleLabelList() {
		return styleLabelList;
	}

	public void setStyleLabelList(List<Label> styleLabelList) {
		this.styleLabelList = styleLabelList;
	}

	public List<Label> getTechnologyLabelList() {
		return technologyLabelList;
	}

	public void setTechnologyLabelList(List<Label> technologyLabelList) {
		this.technologyLabelList = technologyLabelList;
	}

	public List<Label> getMaterialLabelList() {
		return materialLabelList;
	}

	public void setMaterialLabelList(List<Label> materialLabelList) {
		this.materialLabelList = materialLabelList;
	}

	private List<Label> technologyLabelList;
	private List<Label> materialLabelList;
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}