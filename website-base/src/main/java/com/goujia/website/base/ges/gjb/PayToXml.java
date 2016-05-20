package com.goujia.website.base.ges.gjb;

import java.lang.reflect.Field;



/**
 * 支付信息 
 * @author User
 *
 */
public abstract class PayToXml implements ModelToXml {
	
	/**
	 * 将实体类转为xml,不剔除值为空的字段
	 * 此处直接复用的原来的代码，如果觉得不好，可以修改为使用开源工具包进行转换
	 * @param pack 包裹xml的头尾信息
	 * @return
	 */
	public String toXMLString(String pack){
		StringBuffer sb = new StringBuffer();
		
		Field[] fields = this.getClass().getDeclaredFields();
		for (Field field : fields) {
			try {
				field.setAccessible(true);
				sb.append("<"+field.getName()+">"+Tool.nullToEmpty(field.get(this))+"</"+field.getName()+">");
			} catch (Exception e) {
				return null;
			} 
		}
		if(pack!=null){
			return "<"+pack+">"+sb.toString()+"</"+pack+">";
		}else{
			return sb.toString();
		}
	}
	
	/***
	 * 
	 * @param pack 外层节点
	 * @param flag 是否剔除值为空的节点 false 否 true 是
	 * @return
	 */
	public String toXmlString(String pack,boolean flag){
		StringBuffer sb = new StringBuffer();
		
		Field[] fields = this.getClass().getDeclaredFields();
		for (Field field : fields) {
			try {
				field.setAccessible(true);
				if(field.get(this)==null&&flag){
					
				}else if(field.get(this)==null&&!flag){
					sb.append("<"+field.getName()+">"+Tool.nullToEmpty(field.get(this))+"</"+field.getName()+">");
				}else{
					sb.append("<"+field.getName()+">"+String.valueOf(field.get(this))+"</"+field.getName()+">");
				}
			} catch (Exception e) {
				return null;
			} 
		}
		if(pack!=null){
			return "<"+pack+">"+sb.toString()+"</"+pack+">";
		}else{
			return sb.toString();
		}
	}
	

}
