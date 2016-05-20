package com.goujia.website.base.dao.message;

import com.goujia.website.base.entity.message.InnerMessage;

public interface InnerMessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InnerMessage record);

    int insertSelective(InnerMessage record);

    InnerMessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InnerMessage record);

    int updateByPrimaryKeyWithBLOBs(InnerMessage record);

    int updateByPrimaryKey(InnerMessage record);
}