/**
 * Project Name:website-base
 * File Name:GoujiaAccountMapper.java
 * Package Name:com.goujia.website.base.ges.dao
 * Date:2015年7月14日上午9:19:53
 * Copyright (c) 2015, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.goujia.website.base.ges.dao;

import java.util.List;

import com.goujia.website.base.ges.entity.GoujiaAccount;

/**
 * ClassName:GoujiaAccountMapper <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年7月14日 上午9:19:53 <br/>
 * @author   1
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface GoujiaAccountMapper {

	public int create(GoujiaAccount goujiaAccount);
	
	public List<GoujiaAccount> queryByType(String type);
}

