package com.goujia.website.base.dao.code.email;

import org.apache.ibatis.annotations.Param;

import com.goujia.website.base.entity.code.email.EmailCode;
import com.goujia.website.base.entity.code.sms.SmsValidation;


public interface EmailCodeMapper {

	int create(EmailCode emailCode);

	EmailCode findLastByEmail(@Param("email")String email);
}