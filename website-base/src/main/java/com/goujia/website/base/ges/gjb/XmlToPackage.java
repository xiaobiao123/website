package com.goujia.website.base.ges.gjb;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.goujia.goujiabao.util.Tool;

/**
 * 转model
 * 
 * @author User
 * 
 */
public abstract class XmlToPackage {

	public Object parseXml(String xml, Object obj) {
		SAXReader saxReader = new SAXReader();
		Document document;
		try {
			document = saxReader.read(new ByteArrayInputStream(xml
					.getBytes("GBK")));
			Element root = document.getRootElement();
			Iterator it = root.elementIterator();
			while (it.hasNext()) {
				Element element = (Element) it.next();
				Field field = obj.getClass()
						.getDeclaredField(element.getName());
				field.setAccessible(true);
				if (field != null) {
					if (XmlToModel.class.isAssignableFrom(field.getType())) {
						field.set(obj, assembleBean(field.getType(), element));
					} else {
						field.set(obj, element.getText());
					}
				}
			}

		} catch (Exception e) {

		}
		return obj;
	}

	public <T> T assembleBean(Class<T> clazz, Element element) {
		T bean = null;
		try {
			bean = clazz.newInstance();
			Field[] fields = clazz.getDeclaredFields();
			for (Field field : fields) {
				field.setAccessible(true);
				Element node = element.element(field.getName());
				if (node != null
						&& XmlToModel.class.isAssignableFrom(field.getType())) {
					field.set(bean, assembleBean(field.getType(), node));
				} else if (node != null) {
					field.set(bean, node.getText());
				}
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return bean;
	}

}
