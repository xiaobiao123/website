/**
 * Copyright 2014-2015 goujia.com
 * All rights reserved.
 * 
 * @project
 * @author caoqi
 * @version 1.0
 * @date 2014-06-12
 */
package com.goujia.website.base.ges.entity;

import java.util.Date;

/**
 * 会员
 * 
 * @author caoqi
 * @date 2014-06-12
 *
 */
public class Member{
	/**
	 * 主键ID
	 */
	private Integer id;
	
	/**
	 * 邮箱
	 */
	private String email;
	
	/**
	 * 用户名
	 */
	private String loginName;
	
	/**
	 * 密码，以md5加密
	 */
	private String passwordKey;
	
	/**
	 * 支付密码，以md5加密
	 */
	private String payPassword;
	
	/**
	 * 手机号码
	 */
	private String phone;
	
	/**
	 * 真实姓名
	 */
	private String realName;

	/**
	 * 性别
	 * 'f'|'m':'是'|'否'
	 */
	private String gender;

	/**
	 * 头像路径
	 */
	private String headPath;

	/**
	 * 联系地址
	 */
	private String address;

	/**
	 * 是否删除
	 * 'y'|'n':'是'|'否'
	 */
	private String isDeleted;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;
	
	/**
	 * 生日
	 */
	private Date birthday;
	
	/**
	 * 省份
	 */
	private Integer province;
	/**
	 * 城市
	 */
	private Integer city;
	/**
	 * 地区
	 */
	private Integer county;
	/**
	 * 身份证号
	 */
	private String idCard;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * qq
     */
    private String qq;

    /**
     * wechat
     */
    private String wechat;

    /**
     * weibo
     */
    private String weibo;

    /**
     * 是否屏蔽
     * 'y'|'n':'是'|'否'
     */
    private String isDisabled;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPasswordKey() {
		return passwordKey;
	}

	public void setPasswordKey(String passwordKey) {
		this.passwordKey = passwordKey;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHeadPath() {
		return headPath;
	}

	public void setHeadPath(String headPath) {
		this.headPath = headPath;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getPayPassword() {
		return payPassword;
	}

	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getProvince() {
		return province;
	}

	public void setProvince(Integer province) {
		this.province = province;
	}

	public Integer getCity() {
		return city;
	}

	public void setCity(Integer city) {
		this.city = city;
	}

	public Integer getCounty() {
		return county;
	}

	public void setCounty(Integer county) {
		this.county = county;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getWeibo() {
        return weibo;
    }

    public void setWeibo(String weibo) {
        this.weibo = weibo;
    }

    public String getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(String isDisabled) {
        this.isDisabled = isDisabled;
    }
}