package com.goujia.website.base.ges.dao;

import java.util.List;

import com.goujia.website.base.ges.entity.GoodsMatter;

public interface GoodsMatterMapper {
    /**
     * 新增GoodsMatter
     * 
     * @Title: create
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param goodsMatter
     * @param @return 设定文件
     * @return int 返回类型
     * @throws
     */
    public int create(GoodsMatter goodsMatter);

    /**
     * 删除GoodsMatter
     * 
     * @Title: delete
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param goodsMatter
     * @param @return 设定文件
     * @return int 返回类型
     * @throws
     */
    public int delete(GoodsMatter goodsMatter);

    /**
     * 修改GoodsMatter
     * 
     * @Title: update
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param goodsMatter
     * @param @return 设定文件
     * @return int 返回类型
     * @throws
     */
    public int update(GoodsMatter goodsMatter);

    /**
     * 修改GoodsMatter
     * 
     * @Title: updateByMarkId
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param goodsMatter
     * @param @return 设定文件
     * @return int 返回类型
     * @throws
     */
    public int updateByMarkId(GoodsMatter goodsMatter);

    /**
     * 查询GoodsMatter
     * 
     * @Title: query
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param goodsMatter
     * @param @return 设定文件
     * @return List<GoodsMatter> 返回类型
     * @throws
     */
    public List<GoodsMatter> query(GoodsMatter goodsMatter);
}