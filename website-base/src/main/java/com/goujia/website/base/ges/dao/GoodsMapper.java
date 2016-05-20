package com.goujia.website.base.ges.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goujia.website.base.ges.entity.Goods;
import com.goujia.website.base.ges.vo.GoodsBuildingVO;
import com.goujia.website.base.ges.vo.GoodsDiyVO;
import com.goujia.website.base.ges.vo.GoodsVO;
import com.goujia.website.base.mybatis.page.session.NewRowBounds;

public interface GoodsMapper {
    /**
     * 方法描述：获得上架产品数量
     * 
     * @param goodsVO
     * @return
     * @author zhaoyonglian 15-7-8
     */
    public int countOnSaleGoods(@Param(value = "goodsVO") GoodsVO goodsVO,
            @Param(value = "type") String type);

    /**
     * 方法描述：分页获得上架产品列表
     * 
     * @param goodsVO
     * @return
     * @author zhaoyonglian 15-7-8
     */
    public List<GoodsBuildingVO> pageForSaleGoods(
            @Param(value = "goodsVO") GoodsVO goodsVO,
            @Param(value = "newRowBounds") NewRowBounds newRowBounds,
            @Param(value = "type") String type);

    /**
     * 方法描述： 根据ID查询产品包信息带楼盘信息
     * 
     * @param id
     * @return
     * @author zhaoyonglian 15-7-8
     */
    public GoodsBuildingVO queryGoodsWithBuilding(int id);

    /**
     * 方法描述：根据产品包ID查询相关联的其他产品包信息
     * 
     * @param goodsId
     * @param houseId
     * @return
     * @author zhaoyonglian 15-7-8
     */
    public List<GoodsBuildingVO> listSimilarGoods(
            @Param(value = "goodsId") int goodsId,
            @Param(value = "houseId") int houseId,
            @Param(value = "pageSize") int pageSize);

    /**
     * 方法描述：查看产品包详情
     * 
     * @param id
     * @return
     * @author zhaoyonglian 15-7-14
     */
    public Goods query(Integer id);

    /**
     * 
     * @Title: selectByAllProductByCityId
     * @Description: TODO(根据城市ID查询出所有的产品包)
     * @param @param goodsVo
     * @param @return 设定文件
     * @return List<GoodsBuildingVO> 返回类型
     * @throws
     */
    public List<GoodsBuildingVO> selectByAllProductByCityId(GoodsVO goodsVo);

    public List<GoodsBuildingVO> listByCityAndName(
            @Param("city") Integer cityId, @Param("name") String name,
            NewRowBounds newRowBounds);

    public long countByCityAndName(@Param("city") Integer cityId,
            @Param("name") String name);

    /**
     * 
     * @Description 查看产品包列表（简单的一些信息）
     * @param goodsVO
     * @param newRowBounds
     * @param type
     * @return
     * @author zhaoyonglian
     * @date 2015年9月10日 上午10:50:42
     */
    public List<GoodsBuildingVO> getPageGoodsList(
            @Param(value = "goodsVO") GoodsVO goodsVO,
            @Param(value = "newRowBounds") NewRowBounds newRowBounds,
            @Param(value = "type") String type);

    /**
     * 
     * @Description 查看产品包列表数量
     * @param goodsVO
     * @param type
     * @return
     * @author zhaoyonglian
     * @date 2015年9月10日 上午10:51:11
     */
    public int getPageGoodsListCount(@Param(value = "goodsVO") GoodsVO goodsVO,
            @Param(value = "type") String type);

    /**
     * 
    * @Description  查看产品包diy列表
    * @param id  产品包id
    * @return
    * @author zhaoyonglian   
    * @date 2015年9月22日 上午10:05:02
     */
    public List<GoodsDiyVO> listDiy(Integer id);
    
    /**
     * 
    * @Description  diy频道列表
    * @param isDiy 1
    * @return
    * @author zhaoyonglian   
    * @date 2015年10月13日 下午3:02:02
     */
    public List<GoodsBuildingVO> standardDiyList(Integer isDiy);
}