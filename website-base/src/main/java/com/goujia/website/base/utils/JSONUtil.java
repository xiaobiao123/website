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
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.JSONUtils;

import org.apache.commons.beanutils.BeanUtils;

import com.goujia.website.base.helper.AjaxJsonValueProcessor;
import com.goujia.website.base.helper.JsonValueProcessorImpl;

/**
 * 
 * @author Flouny.Caesar
 *
 */
public class JSONUtil {
	
	public static JsonConfig DEFAULT_JSON_CONFIG = null;
	public static JsonConfig AJAX_JSON_CONFIG = null;
	
	static {
        AJAX_JSON_CONFIG =  new JsonConfig();
        AJAX_JSON_CONFIG.registerJsonValueProcessor(java.util.Date.class, new AjaxJsonValueProcessor());
        AJAX_JSON_CONFIG.registerJsonValueProcessor(String.class, new AjaxJsonValueProcessor());
        DEFAULT_JSON_CONFIG =  new JsonConfig();
        DEFAULT_JSON_CONFIG.registerJsonValueProcessor(java.util.Date.class, new JsonValueProcessorImpl());
    }
	
	/**
	 * 对JSON每一个KEY的VALUE文本中可能引起问题的特殊字符串做JS转义 双引号,单引号都转义
	 * @param json
	 * @return
	 */
	public static String escapeValue(String json) {
		if (StringUtil.isBlank(json)) return json;
		
		json = json.replaceAll("\\\\", "\\\\\\\\");
        json = json.replaceAll("\"", "\\\\\"");
        json = json.replaceAll("'", "\\\\'");
        json = json.replaceAll("\b", "\\\\b");
        json = json.replaceAll("\n", "\\\\n");
        json = json.replaceAll("\t", "\\\\t");
        json = json.replaceAll("\f", "\\\\f");
        json = json.replaceAll("\r", "\\\\r");
        
        return json;
	}
	
	/**
	 * 将一组key,value数据转换为JSON格式。注意：VALUE中的特殊字符串已做了JS转义。 例如： 输入："name","flouny"
	 * 输出："name:flouny"
	 * @param key
	 * @param value
	 * @return
	 */
	public static String toKeyValue(String key, String value) {
		 if (StringUtil.isEmpty(key))  throw new RuntimeException("The key of json-string not exist!");
		 
		 return (value == null)?key.concat(":null") : key.concat(":\"").concat(escapeValue(value)).concat( "\"");
	 }
	
	/**
     * Flash中使用的字符转译
     * 
     * @param str
     * @return
     */
    public static String flashEscapeValue(String json) {
        if (json == null || json.length() <= 0)
            return json;

        json = json.replaceAll("<", "＜");
        json = json.replaceAll(">", "＞");
        json = json.replaceAll("\\\\", "\\\\\\\\");
        json = json.replaceAll("\"", "\\\\\"");
        json = json.replaceAll("'", "\\\\'");
        json = json.replaceAll("\b", "\\\\b");
        json = json.replaceAll("\n", "\\\\n");
        json = json.replaceAll("\t", "\\\\t");
        json = json.replaceAll("\f", "\\\\f");
        json = json.replaceAll("\r", "\\\\r");

        return json;
    }
	 
	 /**
	  * 将bean转换为jsonString ,支持标准javabean,Collection,Object[]
	  * 如果需要结果给javacript 使用 需要使用toJSONString(object,JSONUtil.AJAX_JSON_CONFIG);
	  * @param obj
	  * @return
	  */
	 public static String toAJAXJSONString(Object obj) {
		 
		 return toJSONString(obj,DEFAULT_JSON_CONFIG);
	 }
	 
	 /**
	  * 将bean 转换为jsonString,需要指定参数JsonConfig
	  * @param obj
	  * @param jsonConfig
	  * @return
	  */
	 @SuppressWarnings("static-access")
	public static String toJSONString(Object obj, JsonConfig jsonConfig) {
		 if(obj == null) return null;
	 
		 String result = null;
	 
		 if(obj instanceof String) {
		 
			 return (String)obj;
		 } else if (obj instanceof Collection) {
			 JSONArray jsons = new JSONArray();
			 jsons.addAll((Collection<?>) obj,jsonConfig);
			 result = jsons.toString();
		 } else if(JSONUtils.isArray(obj)) {
			 JSONArray jsons = new JSONArray();
			 jsons.add(obj,jsonConfig);
			 result = jsons.toString();
		 } else if(obj instanceof Map) {
			 JSONObject json = new JSONObject();
			 json.accumulateAll((Map<?, ?>)obj, jsonConfig);
			 result = json.toString();
		 } else {
			 JSONObject json = new JSONObject();
			 result = json.fromObject(obj,jsonConfig).toString();
		 }
        
		 if(AJAX_JSON_CONFIG.equals(jsonConfig)) {
			 result = result.replaceAll("\\\\\\\\","\\\\");
			 result = result.replaceAll("\\\\\"","\"");
			 result = result.replaceAll("\\\\\'","\'");
		 }
      
		 return result;
	}
	    
    /**
     * 将json 对象转为javabean
     * @param json
     * @param beanClass
     * @return
     */
	public static Object jsonObjectToBean(JSONObject json, Class<?> beanClass) {
		
		return JSONObject.toBean(json,beanClass);
    }
		
	/**
	 * 将json String 对象转为javabean
	 * @param jsonString
	 * @param beanClass
	 * @return
	 */
	public static Object jsonStringObjectToBean(String jsonString,Class<?> beanClass){
        
        return JSONObject.toBean(JSONObject.fromObject(jsonString),beanClass);
    }
	
	/**
	 * 将List对象序列化为JSON文本
	 * @param list
	 * @return
	 */
	public static <T> String toJSONString(List<T> list) {
		
		return JSONArray.fromObject(list).toString();
	}
	
	/**
	 * 将JSON对象数组序列化为JSON文本
	 * @param jsonArray
	 * @return
	 */
	public static String toJSONString(JSONArray jsonArray) {
		
		return jsonArray.toString();
	}
	
	/**
	 * 将JSON对象序列化为JSON文本
	 * @param jsonObject
	 * @return
	 */
	public static String toJSONString(JSONObject jsonObject) {
		
		return jsonObject.toString();
	}
	
	/**
	 *  将对象序列化为JSON文本
	 * @param object
	 * @return
	 */
	public static String toJSONString(Object object) {
		
		return JSONArray.fromObject(object).toString();
	}
	
	/**
	 * 将对象转换为List对象
	 * @param object
	 * @return
	 */
	public static List<Object> toArrayList(Object object) {
		List<Object> arrayList = new ArrayList<Object>();
		JSONArray jsonArray = JSONArray.fromObject(object);
		
		Iterator<?> it = jsonArray.iterator();
		while (it.hasNext()) {
			JSONObject jsonObject = (JSONObject) it.next();
			Iterator<?> keys = jsonObject.keys();
			while (keys.hasNext()) {
				Object key = keys.next();
				Object value = jsonObject.get(key);
				arrayList.add(value);
			}
		}
		
		return arrayList;
	}
	
	/**
	 * 将对象转换为Collection对象
	 * @param object
	 * @return
	 */
	public static Collection<?> toCollection(Object object) {
		JSONArray jsonArray = JSONArray.fromObject(object);
		
		return JSONArray.toCollection(jsonArray);
	}
	
	/**
	 * 将对象转换为JSON对象数组
	 * @param object
	 * @return
	 */
	public static JSONArray toJSONArray(Object object) {
		
		return JSONArray.fromObject(object);
	}
	
	/**
	 * 将对象转换为JSON对象
	 * @param object
	 * @return
	 */
	public static JSONObject toJSONObject(Object object) {
		
		return JSONObject.fromObject(object);
	}
	
	/**
	 * 将对象转换为HashMap
	 * @param object
	 * @return
	 */
	public static HashMap<String, Object> toHashMap(Object object) {
		HashMap<String, Object> data = new HashMap<String, Object>();
		JSONObject jsonObject = JSONUtil.toJSONObject(object);
		Iterator<?> it = jsonObject.keys();
		while (it.hasNext()) {
			String key = String.valueOf(it.next());
			Object value = jsonObject.get(key);
			data.put(key, value);
		}
		
		return data;
	}
	
	/**
	 * 将对象转换为List<Map<String,Object>>
	 * @param object
	 * @return
	 */
	public static List<Map<String, Object>> toList(Object object) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		JSONArray jsonArray = JSONArray.fromObject(object);
		for (Object obj : jsonArray) {
			JSONObject jsonObject = (JSONObject) obj;
			Map<String, Object> map = new HashMap<String, Object>();
			Iterator<?> it = jsonObject.keys();
			while (it.hasNext()) {
				String key = (String) it.next();
				Object value = jsonObject.get(key);
				 map.put((String) key, value);
			}
			
			list.add(map);
		}
		
		return list;
	}
	
	/**
	 * 将JSON对象数组转换为传入类型的List
	 * @param jsonArray
	 * @param objectClass
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "deprecation" })
	public static <T> List<T> toList(JSONArray jsonArray, Class<T> objectClass) {
		
		return JSONArray.toList(jsonArray, objectClass);
	}
	
	/**
	 * 将对象转换为传入类型的List
	 * @param object
	 * @param objectClass
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "deprecation" })
	public static <T> List<T> toList(Object object, Class<T> objectClass) {
		JSONArray jsonArray = JSONArray.fromObject(object);
		
		return JSONArray.toList(jsonArray, objectClass);
	}
	
	/**
	 * 将JSON对象转换为传入类型的对象
	 * @param jsonObject
	 * @param beanClass
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T toBean(JSONObject jsonObject, Class<T> beanClass) {
		
		return (T) JSONObject.toBean(jsonObject, beanClass);
	}
	
	/**
	 * 将对象转换为传入类型的对象
	 * @param object
	 * @param beanClass
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T toBean(Object object, Class<T> beanClass) {
		JSONObject jsonObject = JSONObject.fromObject(object);
		
		return (T) JSONObject.toBean(jsonObject, beanClass);
	}
	
	/**
	 * 将JSON文本反序列化为主从关系的实体
	 * @param <T> 泛型T 代表主实体类型
	 * @param <D> 泛型D 代表从实体类型
	 * @param jsonString JSON文本
	 * @param mainClass 主实体类型
	 * @param detailName 从实体类在主实体类中的属性名称
	 * @param detailClass 从实体类型
	 * @return
	 */
	public static <T, D> T toBean(String jsonString, Class<T> mainClass, String detailName, Class<D> detailClass) {
		JSONObject jsonObject = JSONObject.fromObject(jsonString);
		JSONArray jsonArray = (JSONArray) jsonObject.get(detailName);
		
		T mainEntity = JSONUtil.toBean(jsonObject, mainClass);
		List<D> detailList = JSONUtil.toList(jsonArray, detailClass);
		
		try {
			BeanUtils.setProperty(mainEntity, detailName, detailList);
		} catch (Exception e) {
			throw new RuntimeException("主从关系JSON反序列化实体失败！");
		}
		
		return mainEntity;
	}
	
	/**
	 * 将JSON文本反序列化为主从关系的实体
	 * @param <T>泛型T 代表主实体类型
     * @param <D1>泛型D1 代表从实体类型
     * @param <D2>泛型D2 代表从实体类型
     * @param jsonString JSON文本
     * @param mainClass 主实体类型
     * @param detailName1 从实体类在主实体类中的属性
     * @param detailClass1 从实体类型
     * @param detailName2 从实体类在主实体类中的属性
     * @param detailClass2 从实体类型
	 * @return
	 */
	public static <T, D1, D2> T toBean(String jsonString, Class<T> mainClass, String detailName1, Class<D1> detailClass1, String detailName2, Class<D2> detailClass2) {
		JSONObject jsonObject = JSONObject.fromObject(jsonString);
        JSONArray jsonArray1 = (JSONArray) jsonObject.get(detailName1);
        JSONArray jsonArray2 = (JSONArray) jsonObject.get(detailName2);

        T mainEntity = JSONUtil.toBean(jsonObject, mainClass);
        List<D1> detailList1 = JSONUtil.toList(jsonArray1, detailClass1);
        List<D2> detailList2 = JSONUtil.toList(jsonArray2, detailClass2);
        
        try {
        	 BeanUtils.setProperty(mainEntity, detailName1, detailList1);
             BeanUtils.setProperty(mainEntity, detailName2, detailList2);
        } catch (Exception ex) {
        	throw new RuntimeException("主从关系JSON反序列化实体失败！");
        }
        
        return mainEntity;
	}
	
	/**
	 * 将JSON文本反序列化为主从关系的实体
     * @param <T>泛型T 代表主实体类型
     * @param <D1>泛型D1 代表从实体类型
     * @param <D2>泛型D2 代表从实体类型
     * @param jsonString JSON文本
     * @param mainClass 主实体类型
     * @param detailName1 从实体类在主实体类中的属性
     * @param detailClass1 从实体类型
     * @param detailName2 从实体类在主实体类中的属性
     * @param detailClass2 从实体类型
     * @param detailName3 从实体类在主实体类中的属性
     * @param detailClass3 从实体类型
	 * @return
	 */
	public static <T, D1, D2, D3> T toBean(String jsonString, Class<T> mainClass, String detailName1, Class<D1> detailClass1, String detailName2, Class<D2> detailClass2, String detailName3, Class<D3> detailClass3) {
		JSONObject jsonObject = JSONObject.fromObject(jsonString);
        JSONArray jsonArray1 = (JSONArray) jsonObject.get(detailName1);
        JSONArray jsonArray2 = (JSONArray) jsonObject.get(detailName2);
        JSONArray jsonArray3 = (JSONArray) jsonObject.get(detailName3);

        T mainEntity = JSONUtil.toBean(jsonObject, mainClass);
        List<D1> detailList1 = JSONUtil.toList(jsonArray1, detailClass1);
        List<D2> detailList2 = JSONUtil.toList(jsonArray2, detailClass2);
        List<D3> detailList3 = JSONUtil.toList(jsonArray3, detailClass3);
        
        try {
        	BeanUtils.setProperty(mainEntity, detailName1, detailList1);
            BeanUtils.setProperty(mainEntity, detailName2, detailList2);
            BeanUtils.setProperty(mainEntity, detailName3, detailList3);
        } catch (Exception ex) {
        	throw new RuntimeException("主从关系JSON反序列化实体失败！");
        }
        
        return mainEntity;
	}
	
	/**
	 * 
	 * 将JSON文本反序列化为主从关系的实体
	 * @param <T> 主实体类型
	 * @param jsonString JSON文本
	 * @param mainClass 主实体类型
	 * @param detailClass 存放了多个从实体在主实体中属性名称和类型
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static <T> T toBean(String jsonString, Class<T> mainClass, HashMap<String, Class> detailClass) {
		JSONObject jsonObject = JSONObject.fromObject(jsonString);
		T mainEntity = JSONUtil.toBean(jsonObject, mainClass);
		
		try {
			for (Object key : detailClass.keySet()) {
				Class value = (Class) detailClass.get(key);
				BeanUtils.setProperty(mainEntity, key.toString(), value);
			}
		} catch (Exception e) {
			throw new RuntimeException("主从关系JSON反序列化实体失败！", e);
		}
		
		return mainEntity;
	}
}