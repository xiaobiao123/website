package com.goujia.website.base.ges.dao;

import java.util.List;

import com.goujia.website.base.ges.entity.GoodsMarkPhoto;

public interface GoodsMarkPhotoMapper {
    /**
     * 新增GoodsMarkPhoto
     * 
     * @Title: create
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param goodsMarkPhoto
     * @param @return 设定文件
     * @return int 返回类型
     * @throws
     */
    public int create(GoodsMarkPhoto goodsMarkPhoto);

    /**
     * 修改GoodsMarkPhoto
     * 
     * @Title: update
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param goodsMarkPhoto
     * @param @return 设定文件
     * @return int 返回类型
     * @throws
     */
    public int update(GoodsMarkPhoto goodsMarkPhoto);

    /**
     * 查询GoodsMarkPhoto
     * 
     * @Title: query
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param markId
     * @param @return 设定文件
     * @return List<GoodsMarkPhoto> 返回类型
     * @throws
     */
    public List<GoodsMarkPhoto> query(int markId);
}