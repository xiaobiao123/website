package com.goujia.website.base.ges.dao;

import java.util.List;

import com.goujia.website.base.ges.entity.GoodsDetail;

public interface GoodsDetailMapper {
    
    /**
     *  方法描述：根据产品包查询产品包户型优化图
     * @param goodsId
     * @return
     * @author zhaoyonglian 15-7-8
     */
    public List<GoodsDetail> listGoodsDetail(int goodsId);
    
    /**
     *  方法描述：根据ID查询产品包信息
     * @param id
     * @return
     * @author zhaoyonglian 15-7-8
     */
    public GoodsDetail query(int id);
}