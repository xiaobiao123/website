package com.goujia.website.base.dao.orderlog;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goujia.website.base.entity.orderlog.OrderLogImage;

/**
 * 
 * @Description: 日志图片mapper类
 * @author zhaoyonglian
 * @date 2015年8月15日 上午11:59:52
 * 
 */
public interface OrderLogImageMapper {
    /**
     * 
     * @Description 删除图片
     * @param id
     * @return
     * @author zhaoyonglian
     * @date 2015年8月15日 下午12:00:10
     */
    int deleteByLog(Integer log_id);

    /**
     * 
     * @Description 添加图片
     * @param record
     * @return
     * @author zhaoyonglian
     * @date 2015年8月15日 下午12:01:23
     */
    int add(OrderLogImage record);

    /**
     * 
     * @Description 获取日志相关图片
     * @param log_id
     *            日志id
     * @return
     * @author zhaoyonglian
     * @date 2015年8月15日 下午12:06:09
     */
    public List<String> getAllByLog(
            @Param(value = "log_id") Integer log_id);
}