package com.goujia.website.base.ges.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goujia.website.base.ges.entity.ActivityShop;
import com.goujia.website.base.ges.entity.Shop;
import com.goujia.website.base.vo.shop.ShopVO;

public interface ShopGesMapper {
    /**
     * 方法描述：查看产品4s店列表
     * 
     * @param goodsId
     * @return
     * @author zhaoyonglian 15-7-10
     */
    public List<Shop> listForShopByGoods(@Param("goodsId") Integer goodsId,
            @Param("cityId") Integer cityId, @Param("typeId") Integer typeId);

    /**
     * 
     * 方法描述：查看4s店详情
     * 
     * @param shopId
     *            4s店id
     * @return
     * @author zhaoyonglian 15-7-13
     */
    public Shop queryForShop(Integer shopId);

    /**
     * 
     * @Description 根据城运商ID获取4S的地址
     * @param operatopId
     * @return
     * @author 发哥
     * @date 2015年8月18日 下午5:40:39
     */
    public List<ActivityShop> listForShopByOperatopId(@Param("cityId") Integer cityId,
            @Param("type") Integer type);

    List<Shop> findAllByCounty(@Param("county")Integer county);
	List<Shop> findAllByCity(@Param("city")Integer city);
}