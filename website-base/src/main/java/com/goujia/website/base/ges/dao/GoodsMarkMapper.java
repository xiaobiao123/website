package com.goujia.website.base.ges.dao;

import java.util.List;

import com.goujia.website.base.ges.entity.GoodsMark;
import com.goujia.website.base.ges.entity.GoodsMatter;
import com.goujia.website.base.ges.vo.GoodsMarkVO;

public interface GoodsMarkMapper {
    /**
     * 新增GoodsMark
     * 
     * @Title: create
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param goodsMark
     * @param @return 设定文件
     * @return int 返回类型
     * @throws
     */
    public int create(GoodsMark goodsMark);

    /**
     * 修改GoodsMark
     * 
     * @Title: update
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param goodsMarkVO
     * @param @return 设定文件
     * @return int 返回类型
     * @throws
     */
    public int update(GoodsMarkVO goodsMarkVO);

    /**
     * 查询GoodsMark
     * 
     * @Title: list
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param goodsMarkVO
     * @param @return 设定文件
     * @return List<GoodsMark> 返回类型
     * @throws
     */
    public List<GoodsMark> list(GoodsMarkVO goodsMarkVO);

    /**
     * 通过matter goods查询GoodsMark
     * 
     * @Title: queryByMatter
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param goodsMatter
     * @param @return 设定文件
     * @return List<E> 返回类型
     * @throws
     */
    public List<GoodsMark> queryByMatter(GoodsMatter goodsMatter);

    /**
     * 通过matter goods查询GoodsMark
     * 
     * @Title: queryById
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param goodsMatter
     * @param @return 设定文件
     * @return GoodsMark 返回类型
     * @throws
     */
    public GoodsMark queryById(GoodsMatter goodsMatter);
}
