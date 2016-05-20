package com.goujia.website.base.ges.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goujia.website.base.ges.entity.Order;
import com.goujia.website.base.ges.vo.OrderVO;
import com.goujia.website.base.mybatis.page.session.NewRowBounds;

public interface OrderMapper {
    /**
     * 新增Order
     * 
     * @Title: create
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param order
     * @param @return 设定文件
     * @return int 返回类型
     * @throws
     */
    public int create(Order order);

    /**
     * 修改Order
     * 
     * @Title: updateByNotice
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param order
     * @param @return 设定文件
     * @return int 返回类型
     * @throws
     */
    public int updateByNotice(Order order);

    /**
     * 修改Order
     * 
     * @Title: updateByPaymentNotice
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param order
     * @param @return 设定文件
     * @return int 返回类型
     * @throws
     */
    public int updateByPaymentNotice(Order order);

    /**
     * 删除order
     * 
     * @Title: delete
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param id
     * @param @return 设定文件
     * @return int 返回类型
     * @throws
     */
    public int delete(int id);

    /**
     * 修改Order
     * 
     * @Title: updateStatus
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param order
     * @param @return 设定文件
     * @return int 返回类型
     * @throws
     */
    public int updateStatus(Order order);

    /**
     * 查询Order信息
     * 
     * @Title: query
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param id
     * @param @return 设定文件
     * @return OrderVO 返回类型
     * @throws
     */
    public OrderVO query(int id);

    /**
     * 查询Order信息
     * 
     * @Title: queryByCode
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param code 设定文件
     * @return void 返回类型
     * @throws
     */
    public OrderVO queryByCode(String code);

    /**
     * 分页查询订单列表
     * 
     * @Title: pageForOrders
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param order
     * @param @return 设定文件
     * @return List<OrderVO> 返回类型
     * @throws
     */
    public List<OrderVO> pageForOrders(@Param(value = "order") Order order,
            @Param(value = "newRowBounds") NewRowBounds newRowBounds);

    /**
     * 查询Order总数
     * 
     * @Title: countForOrders
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param order
     * @param @return 设定文件
     * @return int 返回类型
     * @throws
     */
    public int countForOrders(Order order);

    /**
     * 个人中心订单列表查询 queryList
     * 
     * @author gwb
     * @param order
     * @return 2015年7月9日 下午5:04:19
     */
    public List<OrderVO> queryList(Order order);

    /**
     * 
     * @Description 分页查看订单列表
     * @param order
     *            订单信息
     * @param newRowBounds
     * @return
     * @author zhaoyonglian
     * @date 2015年8月14日 上午11:35:55
     */
    public List<OrderVO> orderListPage(@Param("order")Order order,
            @Param("newRowBounds")NewRowBounds newRowBounds);

    /**
     * 
     * @Description 订单总数
     * @param order
     *            订单信息
     * @return
     * @author zhaoyonglian
     * @date 2015年8月14日 上午11:44:50
     */
    public Integer countOrderListPage(@Param("order")Order order);
    
    /**
     * 
    * @Description  得到该城运商下的所有订单信息
    * @return
    * @author 发哥   
    * @date 2015年8月18日 下午6:45:44
     */
    public List<OrderVO> getActivityOrderList(@Param("goodsId")int goodsId);
    /**
     * 
    * @Description  得到该城运商下的所有订单总数  
    * @return
    * @author 发哥   
    * @date 2015年8月18日 下午6:48:23
     */
    public int getActivityOrderCount(@Param("goodsId")int goodsId,@Param("cityId") int cityId,
            @Param("type") int type);
    
    /**
     * 根据订单id查询订单相关信息
     * @param orderId
     * @return
     */
    public OrderVO queryOrderInfo(int orderId); 
    
}