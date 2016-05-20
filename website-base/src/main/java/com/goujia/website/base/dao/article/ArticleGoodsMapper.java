package com.goujia.website.base.dao.article;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goujia.website.base.entity.article.ArticleGoods;


public interface ArticleGoodsMapper {

	void realDel(ArticleGoods item);

	void add(ArticleGoods item);

	List<Integer> getAllByArticle(@Param("article")Integer article);

}