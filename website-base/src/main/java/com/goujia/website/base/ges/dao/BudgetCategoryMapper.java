package com.goujia.website.base.ges.dao;

import java.util.List;

import com.goujia.website.base.ges.entity.BudgetCategory;

public interface BudgetCategoryMapper {
    /**
     * 方法描述：查询预算
     * 
     * @param id
     * @return
     * @author zhaoyonglian 15-7-10
     */
    public BudgetCategory query(Integer id);

    /**
     * 方法描述：查询预算分类
     * 
     * @return
     * @author zhaoyonglian 15-7-10
     */
    public List<BudgetCategory> list();
}