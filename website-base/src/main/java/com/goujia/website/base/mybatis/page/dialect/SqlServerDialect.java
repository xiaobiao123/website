package com.goujia.website.base.mybatis.page.dialect;

/** 
 * SqlServer数据库方言实现
 *
 * @Project: website-base
 * @Date: 2015年6月4日
 * @Author: wangfeng
 */

public class SqlServerDialect  implements Dialect {  

	public String getPageSql(String sql, int offset, int limit, String orderBy, String order) {
		sql = sql.trim();
		StringBuffer pageSql = new StringBuffer(sql.length() + 100);
		pageSql.append("select * from(select a.*,row_number() over (order by ").append(orderBy).append(" ").append(order).append(") rownum from( ");
		pageSql.append(getLineSql(sql));
		pageSql.append(") a ) b where rownum >= " + offset + " and rownum < "
				+ (offset + limit));
		return pageSql.toString();
	}

	private String getLineSql(String sql) {
		return sql.replaceAll("[\r\n]", " ").replaceAll("\\s{2,}", " ");
	}
}