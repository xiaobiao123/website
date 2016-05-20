package com.goujia.website.base.ges.gjb;

import java.lang.reflect.Field;


/**
 * 转xml
 * @author User
 *
 */
public abstract class PackageToXml {
	
	/**
	 * 递归 多层
	 * @param pack
	 * @param flag
	 * @return
	 */
	public String toXmlStringRecursion(String pack,boolean flag){
		StringBuffer sb = new StringBuffer();
		Field[] fields = this.getClass().getDeclaredFields();
		FieldRecursion(sb,fields,pack,flag,this);
		return sb.toString();
	}
	
	/**
	 * 属性递归
	 * @param sb
	 * @param fields
	 * @param pack
	 * @param flag
	 * @return
	 */
	public StringBuffer FieldRecursion(StringBuffer sb,Field[] fields,String pack,boolean flag,Object obj){
		if(pack!=null){
			sb.append("<"+pack+">");
		}
		for (Field field : fields) {
			try {
				field.setAccessible(true);
				if(field.get(obj)==null&&flag){
					
				}else if(field.get(obj)==null&&!flag){
					if(ModelToXml.class.isAssignableFrom(field.getType())){
						FieldRecursion(sb,field.getType().getDeclaredFields(),field.getName(),flag,field.get(obj));
					}else{
						sb.append("<"+field.getName()+">"+Tool.nullToEmpty(field.get(obj))+"</"+field.getName()+">");
					}
				}else{
					if(ModelToXml.class.isAssignableFrom(field.getType())){
						FieldRecursion(sb,field.getType().getDeclaredFields(),field.getName(),flag,field.get(obj));
					}else{
						sb.append("<"+field.getName()+">"+String.valueOf(field.get(obj))+"</"+field.getName()+">");
					}
				}
			} catch (Exception e) {
				return null;
			} 
		}
		if(pack!=null){
			return sb.append("</"+pack+">");
		}
		return sb;
	}
	
	/**
	 * 添加xml头
	 * @param xml
	 * @return
	 */
	public String addXmlHead(String xml){
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+xml;
	}

}
