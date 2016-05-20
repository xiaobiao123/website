package com.goujia.website.base.dao.topic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goujia.website.base.entity.topic.Topic;
import com.goujia.website.base.mybatis.page.session.NewRowBounds;
import com.goujia.website.base.vo.topic.TopicSearchParam;
import com.goujia.website.base.vo.topic.TopicVo;

public interface TopicMapper {
	int delete(Integer id);

	int creat(Topic topic);

	/*boolean delete(Integer id);*/
	
	int update(Topic topic);
	
	Topic get(Integer id);

	int count(TopicSearchParam searchParam);
	int countDelete(TopicSearchParam searchParam);

	List<TopicVo> page(TopicSearchParam searchParam, NewRowBounds rowBounds);
	
	List<TopicVo> pageList(TopicSearchParam searchParam,NewRowBounds rowBounds);
	
	List<TopicVo> topicList(TopicSearchParam searchParam,NewRowBounds rowBounds);
	/*List<Topic> pageVO(TopicSearchParam searchParam, NewRowBounds rowBounds);*/
	
	List<TopicVo> recoverylist(TopicSearchParam searchParam, NewRowBounds rowBounds);
	
	int recoveryMessage(Integer id);
	
	int delArticle(Integer id);
	Topic queryById(Integer id);
	long countByName(@Param("name")String name);

	List<TopicVo> findAllWithCountByName(@Param("name")String name, NewRowBounds newRowBounds);
	
	List<TopicVo> topicRec();
	
	TopicVo getTopicInfo(int id);
	
	List<TopicVo> findTopicFor(TopicVo topicVo, NewRowBounds newRowBounds);
	
	int findTopicCountFor(TopicVo topicVo);
}