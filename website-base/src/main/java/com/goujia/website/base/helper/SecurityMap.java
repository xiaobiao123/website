/**
 * Copyright 2014-2015 www.goujiawang.com
 * All rights reserved.
 * 
 * @project
 * @author Flouny.Caesar
 * @version 2.0
 * @date 2014-11-26
 */
package com.goujia.website.base.helper;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 线程安全Map
 * 
 * @author Flouny.Caesar
 *
 */
public class SecurityMap {
	
	private Map<Object, Object> concurrentMap = new ConcurrentHashMap<Object, Object>();
	
	public static void set(Object k, Object v) {
		
		geInstance().concurrentMap.put(k, v);
	}
	
	public static Object get(Object k) {
		
		return geInstance().concurrentMap.get(k);
	}
	
	public static void clear() {
		geInstance().concurrentMap.clear();
	}
	
	private static SecurityMap geInstance() {
		return local.get();
	}
	
	private static ThreadLocal<SecurityMap> local = new ThreadLocal<SecurityMap>() {
		protected SecurityMap initialValue() {
			super.initialValue();
			return new SecurityMap();
		}
	};
}