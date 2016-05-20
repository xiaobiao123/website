package com.goujia.website.base.mybatis.page.dialect;

/**
 * MySql5数据库方言实现
 * 
 * @Project: website-base
 * @Date: 2015年6月4日
 * @Author: wangfeng
 */

public class MySql5Dialect implements Dialect {

	public String getPageSql(String sql, int offset, int limit, String orderBy, String order) {
		sql = getLineSql(sql);//.replaceAll("[^\\s,]+\\.", "");
		if(orderBy != null && order != null && sql.toLowerCase().lastIndexOf("order by") == -1)
			sql = sql + " order by " + orderBy + " " + order;
		sql = sql + " limit " + offset + " ," + limit;
		return sql;
	}

	private String getLineSql(String sql) {
		return sql.replaceAll("[\r\n]", " ").replaceAll("\\s{2,}", " ");
	}
}
