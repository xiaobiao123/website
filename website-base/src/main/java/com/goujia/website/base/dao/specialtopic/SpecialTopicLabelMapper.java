package com.goujia.website.base.dao.specialtopic;

import com.goujia.website.base.entity.specialtopic.SpecialTopicLabel;

/**
 * 
 * @Description: 专题标签
 * @author zhaoyonglian
 * @date 2015年8月8日 下午5:49:48
 * 
 */
public interface SpecialTopicLabelMapper {
    /**
     * 
     * @Description 删除专题标签关系
     * @param id
     *            关系id
     * @return 是否成功
     * @author zhaoyonglian
     * @date 2015年8月8日 下午5:52:23
     */
    int delete(Integer id);

    /**
     * 
     * @Description 添加专题标签关系
     * @param record
     *            关系对象
     * @return 添加是否成功
     * @author zhaoyonglian
     * @date 2015年8月8日 下午5:52:57
     */
    int add(SpecialTopicLabel record);

    /**
     * 
     * @Description 获得关系详情
     * @param id
     *            关系id
     * @return 详情
     * @author zhaoyonglian
     * @date 2015年8月8日 下午5:54:00
     */
    SpecialTopicLabel getById(Integer id);

    /**
     * 
     * @Description 更新关系
     * @param record
     *            关系对象
     * @return 是否更新成功
     * @author zhaoyonglian
     * @date 2015年8月8日 下午5:54:17
     */
    int update(SpecialTopicLabel record);

}