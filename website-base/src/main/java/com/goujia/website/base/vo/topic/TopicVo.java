package com.goujia.website.base.vo.topic;


import java.util.List;

import com.goujia.website.base.entity.topic.Topic;
import com.goujia.website.base.entity.topic.TopicLabel;
import com.goujia.website.base.vo.article.ArticleVO;


public class TopicVo extends Topic {
	     
	/*private static final long serialVersionUID = 2709138313327713481L;*/
	
	/**用户名--文章创建人*/
	private String userName;
	private Integer joinNum;
	private List<TopicArticleVo> articles;
	private List<ArticleVO> articleVOs;
	private List<TopicLabel> topicLabels;
	private int collectId;
	
	/** 
     * @return topicLabels 
     */
    
    public List<TopicLabel> getTopicLabels() {
        return topicLabels;
    }

    /** 
     * @param topicLabels 要设置的 topicLabels 
     */
    
    public void setTopicLabels(List<TopicLabel> topicLabels) {
        this.topicLabels = topicLabels;
    }

    /** 
     * @return articleVOs 
     */
    
    public List<ArticleVO> getArticleVOs() {
        return articleVOs;
    }

    /** 
     * @param articleVOs 要设置的 articleVOs 
     */
    
    public void setArticleVOs(List<ArticleVO> articleVOs) {
        this.articleVOs = articleVOs;
    }

    public List<TopicArticleVo> getArticles() {
		return articles;
	}

	public void setArticles(List<TopicArticleVo> articles) {
		this.articles = articles;
	}

	public Integer getJoinNum() {
		return joinNum;
	}

	public void setJoinNum(Integer joinNum) {
		this.joinNum = joinNum;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getCollectId() {
		return collectId;
	}

	public void setCollectId(int collectId) {
		this.collectId = collectId;
	}

}
