package com.goujia.website.base.dao.membercollection;

import java.util.List;

import com.goujia.website.base.entity.membercollection.UserSupport;
import com.goujia.website.base.mybatis.page.session.NewRowBounds;

public interface UserSupportMapper {
    /**
     * 方法描述：取消点赞
     * 
     * @param id
     *            点赞id
     * @return 是否成功 1：成功 0：失败
     * @author liqingfeng 15-8-11
     */
    int delete(Integer id);
    /**
     * 方法描述：点赞
     * 
     * @param record
     *            点赞对象
     * @return 是否成功 1：成功 0：失败
     * @author liqingfeng 15-8-11
     */
    int insert(UserSupport record);

    /**
     * 方法描述：查看点赞详情
     * 
     * @param id
     *            点赞id
     * @return 点赞对象
     * @author liqingfeng 15-6-19
     */
    
    UserSupport get(Integer id);
    /**
     * 方法描述：修改点赞信息
     * 
     * @param record
     *            点赞对象
     * @return 是否成功 1：成功 0：失败
     * @author liqingfeng 15-6-
     */
    int update(UserSupport record);
    
    /**
     * 方法描述：查看收藏列表
     * 
     * @param collection
     *            点赞条件
     * @return 点赞列表
     * @author liqingfeng 15-6-19
     */
    List<UserSupport> userSupportList(UserSupport suersupport);

    /**
     * 
    * @Description  软删除
    * @param suersupport
    * @author zhaoyonglian   
    * @date 2015年9月4日 下午4:45:23
     */
    Integer deleteByContent(UserSupport suersupport);

    /**
     * 
    * @Description  查看总数
    * @param suersupport infoId userId, propertyType
    * @return
    * @author zhaoyonglian   
    * @date 2015年9月4日 下午2:35:50
     */
    int countByContent(UserSupport suersupport);
    
    UserSupport selectTopic(UserSupport suersupport);
    
    /**
    * @Description  
    * @param support
    * @param newRowBounds
    * @return
    * @author chenghao   
    * @date Sep 15, 2015 4:39:40 PM
    */
    List<UserSupport> listWithPage(UserSupport support,
            NewRowBounds newRowBounds);

}