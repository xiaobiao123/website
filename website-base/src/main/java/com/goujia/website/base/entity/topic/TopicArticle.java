package com.goujia.website.base.entity.topic;

import java.util.Date;

public class TopicArticle {
    private Integer id;					//主键(ID)
    private Integer topicId;			//话题ID(TOPIC_ID)

	private Integer articleId;			//文章ID(ARTICLE_ID)
    private Date gmtCreate;				//创建时间(GMT_CREATE)
    private Date gmtModified;			//修改时间(GMT_MODIFIED)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}