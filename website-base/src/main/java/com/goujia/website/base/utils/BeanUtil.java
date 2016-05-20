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

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

/**
 * Bean处理的工具类
 * @author Flouny.Caesar
 *
 */
public class BeanUtil extends BeanUtils {
	
	/**
	 * 创建对象实例
	 * @param clazz
	 * @return
	 */
	public static Object instantiateClass(Class<?> clazz) {
		if (clazz == null) 
			throw new RuntimeException(clazz + " Class must not be null");
		
		if (clazz.isInterface()) 
			throw new RuntimeException(clazz + " Specified class is an interface");
		
		try {
			Constructor<?> ctor = clazz.getDeclaredConstructor((Class[]) null);
			
			if (!Modifier.isPublic(ctor.getModifiers()) ||
					!Modifier.isPublic(ctor.getDeclaringClass().getModifiers())) {
				
				throw new RuntimeException("The class constructor is not public method");
			}
			
			return ctor.newInstance(new Object[]{});
		} catch (Exception e) {
			
			throw new RuntimeException(e.getMessage(), e);
		}
	}
	
	/**
	 * 取得request对象中 所有的参数值并生成 一个相应的对象返回
	 * 
	 * @param request
	 * @param beanClass
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T RequestToBean(HttpServletRequest request, Class<T> beanClass) {
		try {
			T bean =(T) beanClass.getInterfaces();
			Map<?, ?> map = request.getParameterMap();
			BeanUtil.populate(bean, map);
			
			return bean;
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}
}