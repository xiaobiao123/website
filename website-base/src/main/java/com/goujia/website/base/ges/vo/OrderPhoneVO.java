/**
 * Copyright 2014-2015 goujia.com
 * All rights reserved.
 * 
 * @project
 * @author Flouny.Caesar
 * @version 1.0
 * @date 2014-05-21
 */
package com.goujia.website.base.ges.vo;

import com.goujia.website.base.ges.entity.Order;

/**
 * Order 实例 view
 * 
 * @author caoqi
 *
 */
public class OrderPhoneVO extends Order{

	/**
	 * 用户绑定手机号码
	 */
	private String phone;

    /**
     * 物料IDs
     */
    private String goodsMatterIds;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

    public String getGoodsMatterIds() {
        return goodsMatterIds;
    }

    public void setGoodsMatterIds(String goodsMatterIds) {
        this.goodsMatterIds = goodsMatterIds;
    }
}