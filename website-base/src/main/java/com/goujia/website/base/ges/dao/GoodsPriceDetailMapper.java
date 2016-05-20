package com.goujia.website.base.ges.dao;

import java.util.List;

import com.goujia.website.base.ges.entity.GoodsPriceDetail;
import com.goujia.website.base.ges.vo.GoodsPriceDetailVO;

public interface GoodsPriceDetailMapper {
    /**
     * 新增GoodsPriceDetail
     * 
     * @Title: create
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param doodsPriceDetail
     * @param @return 设定文件
     * @return int 返回类型
     * @throws
     */
    public int create(GoodsPriceDetail doodsPriceDetail);

    /**
     * 修改GoodsPriceDetail
     * 
     * @Title: update
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param doodsPriceDetail
     * @param @return 设定文件
     * @return int 返回类型
     * @throws
     */
    public int update(GoodsPriceDetail doodsPriceDetail);

    /**
     * 查询
     * 
     * @Title: list
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param goodsPriceDetail
     * @param @return 设定文件
     * @return List<GoodsPriceDetailVO> 返回类型
     * @throws
     */
    public List<GoodsPriceDetailVO> list(GoodsPriceDetail goodsPriceDetail);

    /**
     * 查询
     * 
     * @Title: query
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param goodsPriceDetail
     * @param @return 设定文件
     * @return List<GoodsPriceDetail> 返回类型
     * @throws
     */
    public List<GoodsPriceDetail> query(GoodsPriceDetail goodsPriceDetail);
}