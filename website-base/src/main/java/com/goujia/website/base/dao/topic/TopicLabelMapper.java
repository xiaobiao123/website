package com.goujia.website.base.dao.topic;

import java.util.List;

import com.goujia.website.base.entity.topic.TopicLabel;

public interface TopicLabelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TopicLabel record);

    int insertSelective(TopicLabel record);

    TopicLabel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TopicLabel record);

    int updateByPrimaryKey(TopicLabel record);
    
    List<TopicLabel> getTopicLableListFor(int topicId);
}