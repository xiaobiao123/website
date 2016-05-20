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

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * 
 * @author Flouny.Caesar
 *
 */
public class SpringBean implements BeanFactoryAware {
	
	private static BeanFactory bf;
	
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		bf = beanFactory;
	}
	
	public static Object getBean(String beanName) {
		
		return bf.getBean(beanName);
	}
	
	public static Object getBean(String beanName, Class<?> clazz) {
		
		return bf.getBean(beanName, clazz);
	}
	
	public static Object getBean(Class<?> clazz) {
		
		return bf.getBean(clazz);
	}
}