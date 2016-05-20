package com.goujia.website.base.dao.comment;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goujia.website.base.entity.comment.OrderReview;
import com.goujia.website.base.mybatis.page.session.NewRowBounds;
import com.goujia.website.base.vo.comment.OrderReviewSearchParam;
import com.goujia.website.base.vo.comment.OrderReviewVO;

/**
 * 
 * @Description: 直播家评论dao类
 * @author zhaoyonglian
 * @date 2015年8月6日 下午5:03:35
 * 
 */
public interface OrderReviewMapper {
    /**
     * 
     * @Description 删除评论（彻底）
     * @param id
     *            评论id
     * @return 是否删除成功
     * @author zhaoyonglian
     * @date 2015年8月6日 下午5:33:17
     */
    int delete(Integer id);

    /**
     * 
     * @Description 删除评论（软删除）
     * @param id
     *            评论id
     * @return 是否删除成功
     * @author zhaoyonglian
     * @date 2015年8月6日 下午5:36:09
     */
    int disableList(List<String> list);

    /**
     * 
     * @Description 增加评论
     * @param record
     *            评论信息
     * @return 是否添加成功
     * @author zhaoyonglian
     * @date 2015年8月6日 下午5:36:37
     */
    int add(OrderReview record);

    /**
     * 
     * @Description 获取评论详情
     * @param id
     *            评论id
     * @return 评论详情
     * @author zhaoyonglian
     * @date 2015年8月6日 下午5:37:01
     */
    OrderReview getById(Integer id);

    /**
     * 
     * @Description 修改评论信息
     * @param record
     *            评论对象
     * @return 是否修改成功
     * @author zhaoyonglian
     * @date 2015年8月6日 下午5:37:29
     */
    int update(OrderReview record);

    /**
     * 
     * @Description 分页查看评论列表
     * @param record
     *            参数：user_id，content，order_id
     * @param rowBounds
     * @return 评论列表
     * @author zhaoyonglian
     * @date 2015年8月6日 下午5:38:01
     */
    public List<OrderReviewVO> listPage(OrderReviewSearchParam searchParam,
            NewRowBounds rowBounds);

    /**
     * 
     * @Description 总数
     * @param record
     *            参数
     * @return 条件下的数量
     * @author zhaoyonglian
     * @date 2015年8月6日 下午6:06:26
     */
    public Integer countListPage(OrderReviewSearchParam searchParam);

    
    /**
    * @Description  
    * @param order
    * @return
    * @author chenghao   
    * @date Sep 17, 2015 10:31:43 AM
    */
    Integer countByOrder(@Param("order")Integer order);

    
    /**
    * @Description  
    * @param order
    * @param newRowBounds
    * @return
    * @author chenghao   
    * @date Sep 22, 2015 10:44:49 AM
    */
    List<OrderReviewVO> getAll(@Param("order")Integer order, NewRowBounds newRowBounds);

	long countOrderPage(OrderReviewSearchParam searchParam);

	List<Integer> listOrderPage(OrderReviewSearchParam searchParam,
			NewRowBounds newRowBounds);

}