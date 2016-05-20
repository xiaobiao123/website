package com.goujia.website.base.dao.question;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goujia.website.base.entity.question.QuestionAnswer;
import com.goujia.website.base.mybatis.page.session.NewRowBounds;
import com.goujia.website.base.utils.Page;
import com.goujia.website.base.vo.BaseSearchParam;
import com.goujia.website.base.vo.question.QuestionAnswerSearchParam;
import com.goujia.website.base.vo.question.QuestionAnswerVO;
import com.goujia.website.base.vo.question.QuestionVO;

/**
 * 含义：问题答案mapper接口
 * 
 * @author zhaoyonglian 15-6-3
 * 
 */
public interface QuestionAnswerMapper {
	/**
	 * 方法描述：根据答案ID删除答案
	 * 
	 * @param id
	 *            答案ID
	 * @return 是否成功 1：成功 0：失败
	 * @author zhaoyonglian 15-6-3
	 */
	int delete(Integer id);

	/**
	 * 方法描述：增加答案
	 * 
	 * @param record
	 *            答案对象
	 * @return 是否成功 1：成功 0：失败
	 * @author zhaoyonglian 15-6-3
	 */
	int insert(QuestionAnswer record);

	/**
	 * 方法描述：查询答案详情
	 * 
	 * @param id
	 *            答案ID
	 * @return 答案详情、
	 * @author zhaoyonglian 15-6-3
	 */
	QuestionAnswer get(Integer id);

	/**
	 * 方法描述：更新答案信息
	 * 
	 * @param record
	 *            答案对象
	 * @return 是否成功 1：成功 0：失败
	 * @author zhaoyonglian 15-6-3
	 */
	int update(QuestionAnswer record);

	/**
	 * 方法描述：分页查询答案列表
	 * 
	 * @param searchParam
	 *            搜索条件
	 * @param rowBounds
	 *            分页对象
	 * @return 该条件下的答案列表
	 * @author zhaoyonglian 15-6-3
	 */
	List<QuestionAnswerVO> list(QuestionAnswerSearchParam searchParam,
			NewRowBounds rowBounds);

	/**
	 * 方法描述：查看分页总素
	 * 
	 * @param searchParam
	 *            搜索条件
	 * @return 该条件下的答案的总数
	 * @author zhaoyonglian 15-6-4
	 */
	public int count(QuestionAnswerSearchParam searchParam);

	/**
	 * 方法描述：废弃答案
	 * 
	 * @param id
	 *            答案ID
	 * @return 是否成功
	 * @author zhaoyonglian 15-6-4a
	 */
	public int disable(Integer id);

	/**
	 * 方法描述：查看问题的答案列表
	 * 
	 * @param questionId
	 *            问题id
	 * @return 答案列表
	 * @author zhaoyonglian 15-6-17
	 */
	public List<QuestionAnswerVO> AnswerList(Integer questionId);

	void isEssence(@Param("id")Integer answer_id);

}