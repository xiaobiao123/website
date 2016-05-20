package com.goujia.website.base.ges.dao;


import java.util.List;

import com.goujia.website.base.ges.entity.OrderPayment;
import com.goujia.website.base.ges.vo.CountForInsertVO;
import com.goujia.website.base.ges.vo.CountPayedVO;

public interface OrderPaymentMapper {
    /**
     * 新增Payment
    * @Title: create 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @param orderPayment
    * @param @return    设定文件 
    * @return int    返回类型 
    * @throws
     */
    public int create(OrderPayment orderPayment);
    /**
     * 修改Order
    * @Title: updateByNotice 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @param orderPayment
    * @param @return    设定文件 
    * @return int    返回类型 
    * @throws
     */
    public int updateByNotice(OrderPayment orderPayment);
    /**
     * 查询已支付Payment总数
    * @Title: countByPayed 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @param orderId
    * @param @return    设定文件 
    * @return int    返回类型 
    * @throws
     */
    public List<CountPayedVO> countByPayed(int orderId);
    /**
     * 统计未支付的当前序号的Payment数，正确应返回0
    * @Title: countForInsert 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @param countForInsertVO
    * @param @return    设定文件 
    * @return int    返回类型 
    * @throws
     */
    public int countForInsert(CountForInsertVO countForInsertVO);
    /**
     * 查询
    * @Title: query 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @param id
    * @param @return    设定文件 
    * @return OrderPayment    返回类型 
    * @throws
     */
    public OrderPayment query(int id);
    /**
     * 查询
    * @Title: queryPayingByOrderId 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @param orderId
    * @param @return    设定文件 
    * @return OrderPayment    返回类型 
    * @throws
     */
    public OrderPayment queryPayingByOrderId(int orderId);
}