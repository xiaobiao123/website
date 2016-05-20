package com.goujia.website.base.dao.system;

import java.util.List;

import com.goujia.website.base.entity.system.Enter;
import com.goujia.website.base.mybatis.page.session.NewRowBounds;
import com.goujia.website.base.vo.system.EnterSearchParam;
import com.goujia.website.base.vo.system.EnterVO;

public interface EnterMapper {
    int delete(Integer id);

    int insert(Enter record);

    Enter getById(Integer id);

    int updateByPrimaryKeySelective(Enter record);

    int count(EnterSearchParam param);

    List<EnterVO> listPage(EnterSearchParam param, NewRowBounds newRowBounds);

}