package com.goujia.website.base.dao.system;

import org.apache.ibatis.annotations.Param;

import com.goujia.website.base.entity.system.UserAdmin;
import com.goujia.website.base.vo.system.UserVO;

public interface UserAdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserAdmin record);

    int insertSelective(UserAdmin record);

    UserAdmin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserAdmin record);

    int updateByPrimaryKey(UserAdmin record);
    
    UserAdmin findByNameAndPwd(UserAdmin userAdmin);
}