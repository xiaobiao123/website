package com.goujia.website.base.entity.article;

import com.goujia.website.base.ges.entity.Goods;


public class ArticleGoods {
	private Integer id;
	private Article article;
	private Goods goods;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
}