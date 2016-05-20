package com.goujia.website.console.manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.goujia.website.base.entity.article.Article;
import com.goujia.website.base.entity.article.ArticleLabel;
import com.goujia.website.base.entity.article.Label;
import com.goujia.website.base.entity.topic.Topic;
import com.goujia.website.base.entity.topic.TopicArticle;
import com.goujia.website.service.article.ArticleLabelService;
import com.goujia.website.service.article.ArticleService;
import com.goujia.website.service.topic.TopicArticleService;

@Transactional
@Service
public class ArticleManager {
	private Logger logger=LoggerFactory.getLogger(getClass());
	@Autowired
	private ArticleService articleService;
	@Autowired
	private TopicArticleService topicArticleService;
	@Autowired
	private ArticleLabelService articleLabelService;
	public void add(List<Label> category_list, List<Label> technology_list, List<Label> material_list, List<Label> style_list, Article article, List<Topic> topicList) {
		List<ArticleLabel> alList=new ArrayList<ArticleLabel>();
		article.setIntroduction(genIntroduction(article.getContent()));
		articleService.create(article);
		if(category_list!=null)
			for(Label label:category_list){
				ArticleLabel al=new ArticleLabel();
				al.setArticle(article);
				al.setLabel(label);
				alList.add(al);
			}
		if(technology_list!=null)
			for(Label label:technology_list){
				ArticleLabel al=new ArticleLabel();
				al.setArticle(article);
				al.setLabel(label);
				alList.add(al);
			}
		if(material_list!=null)
			for(Label label:material_list){
				ArticleLabel al=new ArticleLabel();
				al.setArticle(article);
				al.setLabel(label);
				alList.add(al);
			}
		if(style_list!=null)
			for(Label label:style_list){
				ArticleLabel al=new ArticleLabel();
				al.setArticle(article);
				al.setLabel(label);
				alList.add(al);
			}
		if(alList!=null && !alList.isEmpty())
			articleLabelService.addBatch(alList);
		List<TopicArticle> topicArticleList=new ArrayList<TopicArticle>();
		if(topicList!=null && !topicList.isEmpty()){
			for(Topic topic:topicList){
				TopicArticle t=new TopicArticle();
				t.setArticleId(article.getId());
				t.setGmtCreate(new Date());
				t.setTopicId(topic.getId());
				topicArticleList.add(t);
			}
			if(!topicArticleList.isEmpty())
				topicArticleService.batchCreate(topicArticleList);
		}
		
		
	}
	public void update(Article article, String category_label,
			String technology_label, String material_label, String style_label,
			String topic_list) {
		Gson gson=new Gson();
		List<Label> category_list=gson.fromJson(category_label, new TypeToken<List<Label>>(){}.getType());
		List<Label> technology_list=gson.fromJson(technology_label, new TypeToken<List<Label>>(){}.getType());
		List<Label> material_list=gson.fromJson(material_label, new TypeToken<List<Label>>(){}.getType());
		List<Label> style_list=gson.fromJson(style_label, new TypeToken<List<Label>>(){}.getType());
		List<Topic> topicList=gson.fromJson(topic_list, new TypeToken<List<Topic>>(){}.getType());
		List<ArticleLabel> alList=new ArrayList<ArticleLabel>();
		article.setIntroduction(genIntroduction(article.getContent()));
		articleService.update(article);
		logger.warn("category_label--------------:"+category_list.size());
		logger.warn("technology_label-------------:"+technology_list.size());
		logger.warn("material_label---------:"+material_list.size());
		logger.warn("style_label---------:"+style_list.size());
		if(category_list!=null)
			for(Label label:category_list){
				ArticleLabel al=new ArticleLabel();
				al.setArticle(article);
				al.setLabel(label);
				alList.add(al);
			}
		if(technology_list!=null)
			for(Label label:technology_list){
				ArticleLabel al=new ArticleLabel();
				al.setArticle(article);
				al.setLabel(label);
				alList.add(al);
			}
		if(material_list!=null)
			for(Label label:material_list){
				ArticleLabel al=new ArticleLabel();
				al.setArticle(article);
				al.setLabel(label);
				alList.add(al);
			}
		if(style_list!=null)
			for(Label label:style_list){
				ArticleLabel al=new ArticleLabel();
				al.setArticle(article);
				al.setLabel(label);
				alList.add(al);
			}
		articleLabelService.realDeleteByArticleId(article.getId());
		logger.warn("alList_size------------------------"+alList.size());	
		if(alList!=null && !alList.isEmpty()){
			logger.warn("alList_add------------------------"+alList.size());
			articleLabelService.addBatch(alList);
		}
		logger.warn("alList_end------------------------"+alList.size());	
		List<TopicArticle> topicArticleList=new ArrayList<TopicArticle>();
		topicArticleService.realDeleteByArticId(article.getId());
		if(topicList!=null && !topicList.isEmpty()){
			for(Topic topic:topicList){
				TopicArticle t=new TopicArticle();
				t.setArticleId(article.getId());
				t.setGmtCreate(new Date());
				t.setTopicId(topic.getId());
				topicArticleList.add(t);
			}
			if(!topicArticleList.isEmpty())
				topicArticleService.batchCreate(topicArticleList);
		}
		
		
	}
	private String genIntroduction(String content){
		String regEx_html = "<[^>]+>"; // 定义HTML标签的正则表达式  
	    String regEx_space = "\\s*|\t|\r|\n";//定义空格回车换行符  
	    Integer introduction_length=40;
		Pattern p_html = Pattern.compile(regEx_html, Pattern.CASE_INSENSITIVE);  
        Matcher m_html = p_html.matcher(content);  
        content = m_html.replaceAll(""); // 过滤html标签 
        Pattern p_space = Pattern.compile(regEx_space, Pattern.CASE_INSENSITIVE);  
        Matcher m_space = p_space.matcher(content);  
        content = m_space.replaceAll(""); // 过滤空格回车标签 
        return content;
	}
	private int  min(int a,int b){
		if(a>b)
			return b;
		else
			return a;
	}
	
	
}
