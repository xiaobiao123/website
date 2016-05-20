package com.goujia.website.base.dao.orderlog;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goujia.website.base.entity.orderlog.OrderLog;
import com.goujia.website.base.mybatis.page.session.NewRowBounds;
import com.goujia.website.base.vo.orderlog.OrderLogSearchParam;
import com.goujia.website.base.vo.orderlog.OrderLogVO;

/**
 * 
 * @Description: 订单日志mapper接口
 * @author zhaoyonglian
 * @date 2015年8月15日 下午12:07:36
 * 
 */
public interface OrderLogMapper {
    /**
     * 
     * @Description 删除日志信息
     * @param id
     *            日志id
     * @return 是否成功
     * @author zhaoyonglian
     * @date 2015年8月15日 下午12:07:54
     */
    int delete(Integer id);
    
    /**
     *  
    * @Description  批量删除日志
    * @param ids 日志ids
    * @return  是否成功
    * @author zhaoyonglian   
    * @date 2015年8月17日 下午7:59:18
     */
    public int deleteList(List<String> list);

    /**
     * 
     * @Description 添加日志信息
     * @param record
     *            日志对象
     * @return 是否成功
     * @author zhaoyonglian
     * @date 2015年8月15日 下午12:08:16
     */
    int add(OrderLog record);

    /**
     * 
     * @Description 得到日志详情
     * @param id
     *            日志id
     * @return
     * @author zhaoyonglian
     * @date 2015年8月15日 下午2:57:02
     */
    OrderLog getById(Integer id);

    /**
     * 
     * @Description 修改日志信息
     * @param record
     *            日志对象
     * @return 是否成功
     * @author zhaoyonglian
     * @date 2015年8月15日 下午2:57:27
     */
    int update(OrderLog record);

    /**
     * 
     * @Description 分页查看日志列表
     * @param searchParam
     * @param newRowBounds
     * @return
     * @author zhaoyonglian
     * @date 2015年8月15日 下午3:32:29
     */
    public List<OrderLog> listPage(OrderLogSearchParam searchParam,
            NewRowBounds newRowBounds);

    /**
     * 
     * @Description 分页日志数量
     * @param searchParam
     * @return
     * @author zhaoyonglian
     * @date 2015年8月15日 下午3:33:22
     */
    public int countListPage(OrderLogSearchParam searchParam);

    
    /**
    * @Description  
    * @param label
    * @param order
    * @return
    * @author chenghao   
    * @date Sep 16, 2015 6:52:17 PM
    */
    List<OrderLogVO> findAllByLabelAndOrder(@Param("label")Integer label,@Param("order")Integer order);

    
    /**
    * @Description  
    * @param label
    * @param order
    * @return
    * @author chenghao   
    * @date Sep 16, 2015 6:52:36 PM
    */
    OrderLogVO findLastByOrder(@Param("order")Integer order);

    
    /**
    * @Description  
    * @param label
    * @param newRowBounds
    * @return
    * @author chenghao   
    * @date Sep 17, 2015 9:16:17 AM
    */
    List<OrderLogVO> findLastByLabel(@Param("label")Integer label, NewRowBounds newRowBounds);

    
    /**
    * @Description  
    * @param label
    * @param newRowBounds
    * @return
    * @author chenghao   
    * @date Sep 17, 2015 10:13:54 AM
    */
    List<Integer> findOrderByLabel(@Param("label")Integer label, NewRowBounds newRowBounds);

    
    /**
    * @Description  
    * @param order
    * @return
    * @author chenghao   
    * @date Sep 22, 2015 10:19:05 AM
    */
    List<OrderLogVO> findAllByOrder(@Param("order")Integer order);

}