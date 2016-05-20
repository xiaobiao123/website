package com.goujia.website.base.dao.comment;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.junit.runners.Parameterized.Parameters;

import com.goujia.website.base.entity.comment.ImageReview;
import com.goujia.website.base.mybatis.page.session.NewRowBounds;
import com.goujia.website.base.vo.comment.ImageReviewSearchParam;
import com.goujia.website.base.vo.comment.ImageReviewVO;
import com.goujia.website.base.vo.comment.OrderReviewSearchParam;

public interface ImageReviewMapper {
    int delete(Integer id);

    int add(ImageReview record);

    ImageReview getById(Integer id);

    int update(ImageReview record);
    /**
     * 分页查询
     * @param searchParam
     * @param rowBounds
     * @return list
     * @author liqingfeng
     */
    List<ImageReviewVO> listPage(ImageReviewSearchParam searchParam,
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
    public Integer countListPage(ImageReviewSearchParam searchParam);

    /**
     * 
     * @Description 删除评论（软删除）
     * @param id
     *            评论id
     * @return 是否删除成功
     * @author liqingfeng
     * @date 2015年8月11
     */
    int disableList(List<String> list);

	long countByImageId(@Param("image")Integer id);

	List<ImageReviewVO> findByImageId(@Param("image")Integer id, NewRowBounds newRowBounds);

	long countRoom(ImageReviewSearchParam searchParam);

	List<Integer> listRoomPage(ImageReviewSearchParam searchParam,
			NewRowBounds newRowBounds);
}