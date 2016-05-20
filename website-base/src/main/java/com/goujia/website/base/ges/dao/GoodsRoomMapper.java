package com.goujia.website.base.ges.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goujia.website.base.ges.entity.GoodsRoom;
import com.goujia.website.base.ges.vo.GoodsBuildingVO;
import com.goujia.website.base.ges.vo.GoodsRoomVO;
import com.goujia.website.base.ges.vo.GoodsVO;
import com.goujia.website.base.mybatis.page.session.NewRowBounds;

public interface GoodsRoomMapper {
    /**
     * 新增ShopGoods
     * 
     * @Title: create
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param goodsRoom
     * @param @return 设定文件
     * @return int 返回类型
     * @throws
     */
    public int create(GoodsRoom goodsRoom);

    /**
     * 修改ShopGoods
     * 
     * @Title: update
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param goodsRoomVO
     * @param @return 设定文件
     * @return int 返回类型
     * @throws
     */
    public int update(GoodsRoomVO goodsRoomVO);

    /**
     * 查询Matter带有锚点信息
     * 
     * @Title: query
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param goodsRoomVO
     * @param @return 设定文件
     * @return GoodsRoomVO 返回类型
     * @throws
     */
    public GoodsRoomVO query(GoodsRoomVO goodsRoomVO);

    /**
     * 查询带有锚点信息的GoodsRoom列表
     * 
     * @Title: list
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param goodsRoomVO
     * @param @return 设定文件
     * @return List<GoodsRoomVO> 返回类型
     * @throws
     */
    public List<GoodsRoomVO> list(GoodsRoomVO goodsRoomVO);

    /**
     * 查单条房间信息
     * 
     * @Title: queryRoom
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param goodsRoomVO
     * @param @return 设定文件
     * @return GoodsRoomVO 返回类型
     * @throws
     */
    public GoodsRoomVO queryRoom(GoodsRoomVO goodsRoomVO);

    /**
     * 查询GoodsRoom列表
     * 
     * @Title: listGoodsRoom
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param goodsRoomVO
     * @param @return 设定文件
     * @return List<GoodsRoomVO> 返回类型
     * @throws
     */
    public List<GoodsRoomVO> listGoodsRoom(GoodsRoomVO goodsRoomVO);

    /**
     * 删除GoodsRoom
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
     * 查询物料锚点
     * 
     * @Title: selectMark
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param goodsRoomVO
     * @param @return 设定文件
     * @return GoodsRoomVO 返回类型
     * @throws
     */
    public List<GoodsRoomVO> selectMark(GoodsRoomVO goodsRoomVO);

    /**
     * 
     * @Description 美丽家列表
     * @param goodsVO
     * @param newRowBounds
     * @param type 类型，城市/县区
     * @return
     * @author zhaoyonglian
     * @date 2015年9月4日 上午10:51:02
     */
    public List<GoodsRoomVO> getRoomPic(
            @Param(value = "goodsVO") GoodsVO goodsVO,
            @Param(value = "newRowBounds") NewRowBounds newRowBounds,
            @Param(value = "type") String type);
    
    /**
     * 
    * @Description  美丽家图片数量
    * @param goodsVO
    * @param type
    * @return
    * @author zhaoyonglian   
    * @date 2015年9月4日 上午11:07:38
     */
    public Integer getRoomPicCount(
            @Param(value = "goodsVO") GoodsVO goodsVO,
            @Param(value = "type") String type);

	public GoodsRoom getById(@Param("id")Integer id);

	public GoodsRoom getNextById(@Param("id")Integer id);

	public GoodsRoom getPreById(@Param("id")Integer id);

	public GoodsRoom getFirst();

	public GoodsRoom getEnd();

    
    /**
    * @Description  
    * @param goods
    * @return
    * @author chenghao   
    * @date Sep 17, 2015 4:27:44 PM
    */
    public List<GoodsRoom> getByGoodsId(@Param("goods")Integer goods);

	public List<Integer> getAllId();

	public GoodsRoom queryById(@Param("id")Integer id);

}