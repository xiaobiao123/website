package com.goujia.website.base.dao.sepcialtopic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.goujia.website.base.dao.specialtopic.SpecialTopicAssociationMapper;
import com.goujia.website.base.entity.question.Question;
import com.goujia.website.base.entity.topic.Topic;
import com.goujia.website.base.vo.article.ArticleVO;

@SuppressWarnings("resource")
public class SpecialTopicAssociationMapperTest {
	
	
	
//	@Test
//	public void findAssociationArticleTest() throws Exception {
//		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext(
//				    "classpath:applicationContext.xml");
//		SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) ctx.getBean("sqlSessionFactory");
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		List<ArticleVO> list = sqlSession.getMapper(SpecialTopicAssociationMapper.class).findAssociationArticle(1);
//		System.out.println(list.size()); 
//		for (ArticleVO article : list) {
//			System.out.println(article.getArticleName()+","+article.getUserName()+","+article.getGmtCreate());
//		}
//	}
//	
//
//	@Test
//	public void findAssociationTopicTest() throws Exception {
//		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext(
//				    "classpath:applicationContext.xml");
//		SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) ctx.getBean("sqlSessionFactory");
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		List<Topic> list = sqlSession.getMapper(SpecialTopicAssociationMapper.class).findAssociationTopic(1);
//		System.out.println(list.size()); 
//		for (Topic topic : list) {
//			System.out.println(topic.getName()+","+topic.getGmtCreate()+","+topic.getAssociatedArticleNumber());
//		}
//	}
//	
//	@Test
//	public void findAssociationQuestionTest() throws Exception {
//		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext(
//				    "classpath:applicationContext.xml");
//		SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) ctx.getBean("sqlSessionFactory");
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		List<Question> list = sqlSession.getMapper(SpecialTopicAssociationMapper.class).findAssociationQuestion(1);
//		System.out.println(list.size()); 
//		for (Question question : list) {
//			System.out.println(question.getSubject()+","+question.getGmtCreate()+","+question.getAnwserAmount());
//		}
//	}
}
