package com.goujia.website.base.entity.article;

import java.util.Date;

import com.goujia.website.base.entity.system.User;

public class ArticleReview {
    private Integer id;				//主键(ID)
    private Article article;		//文章ID(ARTICLE_ID)	
	private String content;			//评论内容(CONTENT)
    private User user;				//用户的ID
    private Date gmtCreate;			//创建时间(GMT_CREATE)
    private String isDeleted;		//是否删除(IS_DELETED) n/y
    private Date gmtModify;			//修改时间
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted == null ? null : isDeleted.trim();
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }
}