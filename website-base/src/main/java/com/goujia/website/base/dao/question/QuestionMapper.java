package com.goujia.website.base.dao.question;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goujia.website.base.entity.question.Question;
import com.goujia.website.base.mybatis.page.session.NewRowBounds;
import com.goujia.website.base.vo.question.QuestionSearchParam;
import com.goujia.website.base.vo.question.QuestionVO;

/**
 * Copyright 2014-2015 www.goujiawang.com All rights reserved.
 * 
 * @project website-console
 * @version 2.0
 * 
 *          含义：问题实体类mapper接口
 * 
 * @author zhaoyonglian 15-6-3
 * 
 */
public interface QuestionMapper {
    /**
     * 方法描述：根据问题ID删除问题
     * 
     * @param id
     *            问题ID
     * @return 是否成功 1：成功 0：失败
     * @author zhaoyonglian 15-6-3
     */
    int delete(Integer id);

    /**
     * 方法描述：插入问题
     * 
     * @param record
     *            问题对象
     * @return 是否成功 1：成功 0：失败
     * @author zhaoyonglian 15-6-3
     */
    int insert(Question record);

    /**
     * 方法描述：查看问题详情
     * 
     * @param id
     *            问题ID
     * @return 问题对象
     * @author zhaoyonglian 15-6-3
     */
    Question get(Integer id);

    /**
     * 方法描述：封信问题信息
     * 
     * @param record
     *            问题对象
     * @return 是否成功 1：成功 0：失败
     * @author zhaoyonglian 15-6-3
     */
    int update(Question record);

    /**
     * 方法描述：分页查询问题列表
     * 
     * @param searchParam
     *            搜索条件
     * @param rowBounds
     *            分页对象
     * @return 该条件下的问题列表
     * @author zhaoyonglian 15-6-3
     */
    List<QuestionVO> list(QuestionSearchParam searchParam,
            NewRowBounds rowBounds);

    /**
     * 方法描述：查看分页总数
     * 
     * @param searchParam
     *            搜索条件
     * @return 总条数
     * @author zhaoyonglian 15-6-3
     */
    public int count(QuestionSearchParam searchParam);

    /**
     * 方法描述：废弃问题
     * 
     * @param id
     *            问题ID
     * @return 是否成功 1：成功 0：失败
     * @author zhaoyonglian 15-6-3
     */
    public int disable(Integer id);

    /**
     * 方法描述：获得问题详情 网页前端
     * 
     * @param id
     *            问题id
     * @return 问题详情
     * @author zhaoyonglian 15-6-29
     */
    public QuestionVO getDetail(Integer id);

    List<QuestionVO> findAllByState(@Param("state") Integer state,
            @Param("user") Integer user_id, NewRowBounds newRowBounds);
	void reuse(Integer id);
	long countByState(@Param("state") Integer state,
            @Param("user") Integer user_id);

    /**
     * 方法描述：个人中心我关注的问题列表
     * 
     * @param userId
     * @param rowBounds
     * @return
     * @author zhaoyonglian 15-7-15
     */
    public List<QuestionVO> personQuestion(Integer userId,
            NewRowBounds rowBounds);

    /**
     * 方法描述：个人中心我关注的问题个数
     * 
     * @param userId
     * @return
     * @author zhaoyonglian 15-7-15
     */
    public int personQuestionCount(Integer userId);

	QuestionVO getVO(@Param("id")Integer id);

	void isConfirm(@Param("id")Integer id);
}