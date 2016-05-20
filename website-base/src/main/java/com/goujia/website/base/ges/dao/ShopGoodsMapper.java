package com.goujia.website.base.ges.dao;

import com.goujia.website.base.ges.entity.ShopGoods;

public interface ShopGoodsMapper {
    /**
     * 方法描述：修改销售量
     * 
     * @param shopGoods
     *            shopid goodsid
     * @return
     * @author zhaoyonglian 15-7-16
     */
    public int updateSaleNum(ShopGoods shopGoods);
}