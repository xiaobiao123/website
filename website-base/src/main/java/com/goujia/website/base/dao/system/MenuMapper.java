package com.goujia.website.base.dao.system;

import java.util.List;

import com.goujia.website.base.entity.system.Menu;

public interface MenuMapper {

	Menu get(Integer id);

	List<Menu> list();

	/**
	 * 方法描述：查看子菜单
	 * 
	 * @param parentId
	 *            父菜单id
	 * @return 子菜单列表
	 * @author zhaoyonglian 15-6-8
	 */
	List<Menu> findSubMenu(int parentId);

}