package com.goujia.website.base.dao.code.sms;

import org.apache.ibatis.annotations.Param;

import com.goujia.website.base.entity.code.sms.SmsValidation;


public interface SmsValidationMapper {

	int create(SmsValidation smsValidation);

	SmsValidation findLastByPhone(@Param("phone")String phone);

	
}