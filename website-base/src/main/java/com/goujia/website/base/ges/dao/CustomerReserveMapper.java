package com.goujia.website.base.ges.dao;

import com.goujia.website.base.ges.entity.CustomerReserve;

public interface CustomerReserveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerReserve record);

    int insertSelective(CustomerReserve record);

    CustomerReserve selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerReserve record);

    int updateByPrimaryKey(CustomerReserve record);
}