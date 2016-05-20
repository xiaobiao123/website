package com.goujia.website.base.ges.dao;

import java.util.List;

import com.goujia.website.base.ges.entity.MaterialsCategory;

public interface MaterialsCategoryMapper {
    /**
     * 方法描述：物料分类列表
     * 
     * @param materialsCategory
     * @return
     * @author zhaoyonglian 15-7-10
     */
    public List<MaterialsCategory> listForMaterialsCategory(
            MaterialsCategory materialsCategory);
}