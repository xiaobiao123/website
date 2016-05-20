package com.goujia.website.base.ges.dao;

import com.goujia.website.base.ges.entity.OrderEarnest;

public interface OrderEarnestMapper {
    /**
     * 创建 POJO
     * @Title: create
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param orderEarnest
     * @param @return 设定文件
     * @return int 返回类型
     * @throws
     */
    public int create(OrderEarnest orderEarnest);
    /**
     * 查询
    * @Title: query 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @param id
    * @param @return    设定文件 
    * @return OrderEarnest    返回类型 
    * @throws
     */
    public OrderEarnest query(int id);
    /**
     * 查询
    * @Title: queryUnpaidByOrderId 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @param orderId
    * @param @return    设定文件 
    * @return OrderEarnest    返回类型 
    * @throws
     */
    public OrderEarnest queryUnpaidByOrderId(int orderId);
    /**
     * 修改
    * @Title: updateByNotice 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @param orderEarnest
    * @param @return    设定文件 
    * @return int    返回类型 
    * @throws
     */
    public int updateByNotice(OrderEarnest orderEarnest);
    /**
     * 修改
    * @Title: updateOrderByNotice 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @param code
    * @param @return    设定文件 
    * @return int    返回类型 
    * @throws
     */
    public int updateOrderByNotice(String code);
}