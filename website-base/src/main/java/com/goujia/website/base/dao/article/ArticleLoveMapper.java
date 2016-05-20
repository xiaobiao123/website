package com.goujia.website.base.dao.article;

import org.apache.ibatis.annotations.Param;

import com.goujia.website.base.entity.article.ArticleLove;

public interface ArticleLoveMapper {
    
	
	

    int insert(ArticleLove record);


	int countByUserAndArticle(@Param("article")Integer articleId, @Param("user")Integer userId);

}