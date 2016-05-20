package com.goujia.website.base.ges.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goujia.website.base.ges.entity.CityOperator;
import com.goujia.website.base.ges.vo.CityOperatorVo;


public interface CityOperatorMapper {
    /**
     *  方法描述：查询CityOperator信息
     * @param cityOperator
     * @return
     * @author  zhaoyonglian 15-7-14
     */
    public CityOperator queryForCityOperator(CityOperator cityOperator);
    /**
     * 
     * @param city 城市编号
     * @return
     */
    public List<CityOperatorVo> getByCountryId(@Param("city") int city);
    /**
     * 
     * @param city 城市编号
     * @return
     */
    public List<CityOperatorVo> getByCityId(@Param("city") int city);
    /**
     * 
    * @Description  根据城市ID查询城运商ID
    * @param city
    * @return
    * @author 发哥   
    * @date 2015年8月18日 下午5:33:40
     */
    public CityOperatorVo selectOperatorIdByCity(int cityId);
}