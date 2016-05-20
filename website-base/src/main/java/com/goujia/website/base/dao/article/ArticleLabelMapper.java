package com.goujia.website.base.dao.article;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goujia.website.base.entity.article.ArticleLabel;
import com.goujia.website.base.entity.topic.TopicLabel;

public interface ArticleLabelMapper {

	void addBatch(@Param("list")List<ArticleLabel> list);

	List<ArticleLabel> findByArticleId(@Param("article")Integer articleId);

	void realDeleteByArticleId(@Param("article")Integer articleId);
	
	List<TopicLabel> getArticleLabelName(@Param("articleId")Integer articleId);
	
	
      	
}