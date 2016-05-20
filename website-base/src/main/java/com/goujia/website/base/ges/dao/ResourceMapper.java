package com.goujia.website.base.ges.dao;

import java.util.List;

import com.goujia.website.base.ges.entity.ProductParam;
import com.goujia.website.base.ges.entity.ProductResultType;
import com.goujia.website.base.ges.entity.Resource;


public interface ResourceMapper {
    
    /**
     *  方法描述：查看房型或风格
     * @param resource  type name
     * @return
     * @author  zhaoyonglian 15-7-8
     */
//    public List<Resource> list(ResourceVO resource);
    public List<Resource> list(Resource resource);
    
    public List<ProductResultType> selectByStyle(ProductParam productParam);
    
    public List<ProductResultType> selectByType(ProductParam productParam);
    
    public List<ProductResultType> selectByPriceAndArea(ProductParam productParam);
    
    public List<ProductResultType> selectByProductParams(ProductParam productParam);
}