package com.goujia.website.base.dao.specialtopic;

import java.util.List;

import com.goujia.website.base.entity.specialtopic.SpecialTopic;
import com.goujia.website.base.entity.system.User;
import com.goujia.website.base.mybatis.page.session.NewRowBounds;
import com.goujia.website.base.vo.specialtopic.SpecialTopicSearchParam;
import com.goujia.website.base.vo.specialtopic.SpecialTopicVO;

public interface SpecialTopicMapper {

	int updateByPrimaryKey(SpecialTopic record);

	int delete(Integer id);

	int insert(SpecialTopic record);

	int update(SpecialTopic record);

	SpecialTopic get(Integer id);

	List<SpecialTopicVO> list(SpecialTopicSearchParam searchParam,
			NewRowBounds rowBounds);

	/**
	 * 方法描述：网页前端查看专题列表
	 * 
	 * @param searchParam
	 *            搜索条件
	 * @param rowBounds
	 * @return 专题列表
	 * @author zhaoyonglian 15-6-19
	 */
	List<SpecialTopicVO> pageList(SpecialTopicSearchParam searchParam,
			NewRowBounds rowBounds);

	int count(SpecialTopicSearchParam searchParam);

	int batchInvalid(List<Integer> ids);
	
	List<SpecialTopicVO> personSpecialTopic(int userId,NewRowBounds rowBounds);
	
	int personSpecialTopicCount(int userId);
	
	int deletePersonSpecialTopic(int id);
}