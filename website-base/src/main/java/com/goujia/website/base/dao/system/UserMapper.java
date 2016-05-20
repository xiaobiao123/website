package com.goujia.website.base.dao.system;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goujia.website.base.entity.system.User;
import com.goujia.website.base.vo.system.UserVO;

public interface UserMapper {

	UserVO get(Integer id);
	
	int delete(Integer id);
	
	int insert(User record);
	
	int update(User record);
	
	UserVO findByNameAndPwd(User record);

	UserVO getByUserName(@Param("user")String name);
	List<User> findAll();

	UserVO getByPhone(@Param("phone")String phone);
}