package com.goujia.website.base.dao.question;

import com.goujia.website.base.entity.question.QuestionLabel;

/**
 * 
 * @Description: 问题标签关系dao类
 * @author zhaoyonglian
 * @date 2015年8月8日 下午5:37:04
 * 
 */
public interface QuestionLabelMapper {
    /**
     * 
     * @Description 删除问题标签关系
     * @param id
     *            关系id
     * @return 是否删除成功
     * @author zhaoyonglian
     * @date 2015年8月8日 下午5:37:32
     */
    int delete(Integer id);

    /**
     * 
     * @Description 添加问题标签关系
     * @param record
     *            问题标签关系
     * @return 是否添加成功
     * @author zhaoyonglian
     * @date 2015年8月8日 下午5:38:03
     */
    int add(QuestionLabel record);

    /**
     * 
     * @Description 获得关系详情
     * @param id
     * @return
     * @author zhaoyonglian
     * @date 2015年8月8日 下午5:38:50
     */
    QuestionLabel getById(Integer id);

    /**
     * 
     * @Description 更新关系
     * @param record
     * @return
     * @author zhaoyonglian
     * @date 2015年8月8日 下午5:39:12
     */
    int update(QuestionLabel record);

}