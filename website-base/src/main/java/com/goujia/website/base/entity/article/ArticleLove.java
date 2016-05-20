package com.goujia.website.base.entity.article;

import java.util.Date;

import com.goujia.website.base.entity.system.User;

public class ArticleLove {
    private Integer id;     				//主键ID
    private Article article;				//文章ID
    private User user;				//用户ID
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

	private Date loveTime;					//点赞时间
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Date getLoveTime() {
        return loveTime;
    }

    public void setLoveTime(Date loveTime) {
        this.loveTime = loveTime;
    }
}