package com.goujia.website.base.dao.topic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goujia.website.base.entity.topic.Topic;
import com.goujia.website.base.entity.topic.TopicArticle;
import com.goujia.website.base.mybatis.page.session.NewRowBounds;
import com.goujia.website.base.vo.topic.TopicArticlePageVo;
import com.goujia.website.base.vo.topic.TopicArticleVo;
import com.goujia.website.base.vo.topic.TopicSearchParam;

public interface TopicArticleMapper {

	int count(TopicSearchParam searchParam);

	List<TopicArticlePageVo> pageList(Integer topicId);

	void batchCreate(@Param("list") List<TopicArticle> list);

	void realDeleteByArticId(@Param("article") Integer articleId);

	List<Topic> findAllByArticleId(@Param("article") Integer article);

	List<TopicArticleVo> list(Integer topicId);

	int delete(Integer id);

	/**
	 * 方法描述：分页查看话题相关的文章信息 （前端）
	 * 
	 * @param topicId
	 *            话题id
	 * @param rowBounds
	 *            分页
	 * @return 文章列表
	 * @author zhaoyonglian 15-6-24
	 */
	List<TopicArticleVo> relationedArticlePage(Integer topicId,
			NewRowBounds rowBounds);

}