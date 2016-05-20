package com.goujia.website.base.dao.membercollection;

import java.util.List;

import com.goujia.website.base.entity.membercollection.MemberCollection;
import com.goujia.website.base.mybatis.page.session.NewRowBounds;

public interface MemberCollectionMapper {

	/**
	 * 方法描述：取消收藏
	 * 
	 * @param id
	 *            收藏id
	 * @return 是否成功 1：成功 0：失败
	 * @author zhaoyonglian 15-6-19
	 */
	int delete(Integer id);

	/**
	 * 方法描述：收藏
	 * 
	 * @param record
	 *            收藏对象
	 * @return 是否成功 1：成功 0：失败
	 * @author zhaoyonglian 15-6-19
	 */
	int insert(MemberCollection record);

	/**
	 * 方法描述：查看收藏详情
	 * 
	 * @param id
	 *            收藏id
	 * @return 收藏对象
	 * @author zhaoyonglian 15-6-19
	 */
	MemberCollection get(Integer id);

	/**
	 * 方法描述：修改收藏信息
	 * 
	 * @param record
	 *            收藏对象
	 * @return 是否成功 1：成功 0：失败
	 * @author zhaoyonglian 15-6-19
	 */
	int update(MemberCollection record);

	/**
	 * 方法描述：查看收藏列表
	 * 
	 * @param collection
	 *            收藏条件
	 * @return 收藏列表
	 * @author zhaoyonglian 15-6-19
	 */
	List<MemberCollection> collectList(MemberCollection collection);

	boolean deleteByContent(MemberCollection collection);

	/**
	 * 
	* @Description  查看总数
	* @param collection  userId，collectionContentId，propertyType
	* @return   总数
	* @author zhaoyonglian   
	* @date 2015年9月4日 下午1:45:54
	 */
	Integer countByContent(MemberCollection collection);
	
	MemberCollection selectTopic(MemberCollection collection);

	
	/**
	* @Description  
	* @param collection
	* @param newRowBounds
	* @return
	* @author chenghao   
	* @date Sep 14, 2015 6:15:46 PM
	*/
	List<MemberCollection> collectListWithPage(MemberCollection collection,
			NewRowBounds newRowBounds);

	void deleteByMember(MemberCollection men);
}