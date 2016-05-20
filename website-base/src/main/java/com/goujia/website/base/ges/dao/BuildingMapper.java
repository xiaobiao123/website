package com.goujia.website.base.ges.dao;

import java.util.List;

import com.goujia.website.base.ges.entity.ProductParam;
import com.goujia.website.base.ges.entity.ProductResultType;
import com.goujia.website.base.ges.vo.BuildingVO;

public interface BuildingMapper {
    
    /**
     *  方法描述：查看building信息
     * @param building
     * @return
     * @author  zhaoyonglian 15-7-8
     */
    public List<BuildingVO> queryForBuilding(BuildingVO building);

    /**
     *  方法描述：根据城市/县，查询building列表  用到这个
     * @param building  cityId, countyId  pageSize
     * @return
     * @author  zhaoyonglian 15-7-8
     */
    public List<BuildingVO> listForLimitBuilding(BuildingVO building);
    
    public List<ProductResultType> selectBuilDing(ProductParam productParam);
}