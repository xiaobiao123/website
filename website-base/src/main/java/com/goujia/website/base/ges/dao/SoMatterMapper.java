package com.goujia.website.base.ges.dao;

import com.goujia.website.base.ges.entity.SoMatter;

/**
 * 订单物料
 * 
 * @author zhaoyonglian
 * 
 */
public interface SoMatterMapper {
    /**
     * 增加订单物料关系
     *  
     * @param matter
     *            订单物料
     * @return
     * @author zhaoyonglian
     */
    public int create(SoMatter matter);
}