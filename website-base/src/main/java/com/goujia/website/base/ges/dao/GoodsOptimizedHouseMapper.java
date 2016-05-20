package com.goujia.website.base.ges.dao;

import java.util.List;

import com.goujia.website.base.ges.entity.GoodsOptimizedHouse;

public interface GoodsOptimizedHouseMapper {
    /**
     * 新增GoodsTypeOpt
     * 
     * @Title: create
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param goodsOptimizedHouse
     * @param @return 设定文件
     * @return int 返回类型
     * @throws
     */
    public int create(GoodsOptimizedHouse goodsOptimizedHouse);

    /**
     * 修改ShopGoods
     * 
     * @Title: update
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param goodsOptimizedHouse
     * @param @return 设定文件
     * @return int 返回类型
     * @throws
     */
    public int update(GoodsOptimizedHouse goodsOptimizedHouse);

    /**
     * 查询GoosType
     * 
     * @Title: listGoodsType
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param goodsId
     * @param @return 设定文件
     * @return List<E> 返回类型
     * @throws
     */
    public List<GoodsOptimizedHouse> listGoodsType(int goodsId);

    /**
     * 查询ShopGoods
     * 
     * @Title: query
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param id
     * @param @return 设定文件
     * @return GoodsOptimizedHouse 返回类型
     * @throws
     */
    public GoodsOptimizedHouse query(int id);
}