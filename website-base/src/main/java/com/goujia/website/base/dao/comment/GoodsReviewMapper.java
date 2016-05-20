package com.goujia.website.base.dao.comment;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goujia.website.base.entity.comment.GoodsReview;
import com.goujia.website.base.mybatis.page.session.NewRowBounds;
import com.goujia.website.base.vo.comment.GoodsReviewSearchParam;
import com.goujia.website.base.vo.comment.GoodsReviewVO;

public interface GoodsReviewMapper {
    int delete(Integer id);

    int add(GoodsReview record);

    GoodsReview getById(Integer id);

    int update(GoodsReview record);
    /**
     * 分页查询
     * @param searchParam
     * @param rowBounds
     * @return list
     * @author liqingfeng
     */
    List<GoodsReviewVO> listPage(GoodsReviewSearchParam searchParam,
            NewRowBounds rowBounds);
    
 
    /**
     * 
     * @Description 总数
     * @param record
     *            参数
     * @return 条件下的数量
     * @author liqingfeng
     * @date 2015年8月10日 
     */
    public Integer countListPage(GoodsReviewSearchParam searchParam);

    /**
     * 
     * @Description 删除评论（软删除）
     * @param id
     *            评论id
     * @return 是否删除成功
     * @author liqingfeng   
     * @date 2015年8月6日 下午5:36:09
     */
    int disableList(List<String> list);

    
    /**
    * @Description  
    * @param id
    * @param newRowBounds
    * @return
    * @author chenghao   
    * @date Sep 17, 2015 4:22:20 PM
    */
    List<GoodsReviewVO> findByGoodsId(@Param("goods")Integer id, NewRowBounds newRowBounds);
}