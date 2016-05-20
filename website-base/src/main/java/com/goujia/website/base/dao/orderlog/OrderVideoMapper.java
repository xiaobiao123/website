package com.goujia.website.base.dao.orderlog;

import java.util.List;

import com.goujia.website.base.entity.orderlog.OrderVideo;

/**
 * 
 * @Description: 直播家视频链接dao类
 * @author zhaoyonglian
 * @date 2015年8月24日 上午10:20:01
 * 
 */
public interface OrderVideoMapper {
    /**
     * 
     * @Description 添加视频地址
     * @param record
     * @return
     * @author zhaoyonglian
     * @date 2015年8月24日 上午10:20:26
     */
    int add(OrderVideo record);

    /**
     * 
     * @Description 修改视频地址
     * @param record
     * @return
     * @author zhaoyonglian
     * @date 2015年8月24日 上午10:20:44
     */
    int update(OrderVideo record);

    /**
     * 
     * @Description 查看订单的视频
     * @param orderId
     *            订单id
     * @return
     * @author zhaoyonglian
     * @date 2015年8月24日 上午10:34:48
     */
    public List<OrderVideo> getByOrder(Integer orderId);

    /**
     * 
     * @Description 根据订单删除视频地址
     * @param orderId
     *            订单id
     * @return
     * @author zhaoyonglian
     * @date 2015年8月28日 下午3:31:53
     */
    public int deleteByOrder(Integer orderId);
}