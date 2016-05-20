/**
 * Copyright 2014-2015 www.goujiawang.com
 * All rights reserved.
 * 
 * @project
 * @author Flouny.Caesar
 * @version 2.0
 * @date 2014-11-26
 */
package com.goujia.website.base.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.ListUtils;

/**
 * List处理的工具类
 * @author Flouny.Caesar
 *
 */
public class ListUtil extends ListUtils {
	
	/**
	 * 
	 * @param list
	 * @return
	 */
	public static boolean isNotEmpty(List<?> list) {
		
		return list != null && !list.isEmpty();
	}
	
	/**
	 * 
	 * @param list
	 * @return
	 */
	public static boolean isEmpty(List<?> list) {
		
		return list == null || list.isEmpty();
	}
	
	/**
	 * 将Map转换为List
	 * 0： key
	 * 1: value
	 * @param populateMap
	 * @return
	 */
	public static List<Object[]> getMapToList(Map<Object, Object> populateMap) {
		if (populateMap == null) throw new RuntimeException("---------- populateMap is null ----------");
		
		List<Object[]> list = new ArrayList<Object[]>();
		Iterator<Object> it = populateMap.keySet().iterator();
		while (it.hasNext()) {
			Object key = it.next();
			Object value = populateMap.get(key);
			
			Object[] objs = new Object[2];
			objs[0] = key;
			objs[1] = value;
			
			list.add(objs);
		}
		
		return list;
	}
}