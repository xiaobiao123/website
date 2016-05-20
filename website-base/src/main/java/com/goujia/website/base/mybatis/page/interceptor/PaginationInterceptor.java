package com.goujia.website.base.mybatis.page.interceptor;

import java.sql.Connection;
import java.util.Properties;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import org.apache.ibatis.reflection.wrapper.ObjectWrapperFactory;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.goujia.website.base.mybatis.page.dialect.Dialect;
import com.goujia.website.base.mybatis.page.dialect.MySql5Dialect;
import com.goujia.website.base.mybatis.page.dialect.OracleDialect;
import com.goujia.website.base.mybatis.page.dialect.SqlServerDialect;
import com.goujia.website.base.mybatis.page.session.NewRowBounds;


/**
 * 实现mybatis提供的拦截器接口，编写我们自己的分页实现，原理就是拦截底层JDBC操作相关的Statement对象，
 * 把前端的分页参数如当前记录索引和每页大小通过拦截器注入到sql语句中，即在sql执行之前通过分页参数重新生成分页sql，
 * 而具体的分页sql实现是分离到Dialect接口中去。
 * 
 * @Project: website-base
 * @File: NewRowBounds.java 
 * @Date: 2015-5-28 
 * @Author: wangfeng
 */

@Intercepts({ @Signature(type = StatementHandler.class, method = "prepare", args = { Connection.class }) })
public class PaginationInterceptor implements Interceptor {

	private final static Logger logger = LoggerFactory.getLogger(PaginationInterceptor.class);
	private static final ObjectFactory DEFAULT_OBJECT_FACTORY = new DefaultObjectFactory();
	private static final ObjectWrapperFactory DEFAULT_OBJECT_WRAPPER_FACTORY = new DefaultObjectWrapperFactory();
	private Properties properties;

	public Object intercept(Invocation invocation) throws Throwable {
		StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
		BoundSql boundSql = statementHandler.getBoundSql();
		MetaObject metaStatementHandler = MetaObject.forObject(statementHandler, DEFAULT_OBJECT_FACTORY, DEFAULT_OBJECT_WRAPPER_FACTORY);
		// 分离代理对象链(由于目标类可能被多个拦截器拦截，从而形成多次代理，通过下面的两次循环
		// 可以分离出最原始的的目标类)
		while (metaStatementHandler.hasGetter("h")) {
			Object object = metaStatementHandler.getValue("h");
			metaStatementHandler = MetaObject.forObject(object, DEFAULT_OBJECT_FACTORY, DEFAULT_OBJECT_WRAPPER_FACTORY);
		}
		// 分离最后一个代理对象的目标类
		while (metaStatementHandler.hasGetter("target")) {
			Object object = metaStatementHandler.getValue("target");
			metaStatementHandler = MetaObject.forObject(object, DEFAULT_OBJECT_FACTORY, DEFAULT_OBJECT_WRAPPER_FACTORY);
		}

		Object newRowBoundsObj = metaStatementHandler.getValue("delegate.rowBounds");
		NewRowBounds newRowBounds = null;
		if(newRowBoundsObj != null && newRowBoundsObj != RowBounds.DEFAULT)
			newRowBounds = (NewRowBounds)newRowBoundsObj; 
		if (newRowBounds == null || newRowBounds == NewRowBounds.DEFAULT) {
			//TODO 上线时可以将日志删除
			logger.info("SQL : " + getLineSql(boundSql.getSql()));
			return invocation.proceed();
		}
		Configuration configuration = (Configuration) metaStatementHandler.getValue("delegate.configuration");
		Dialect.Type databaseType = null;
		try {
			databaseType = Dialect.Type.valueOf(properties.getProperty("dialect").toUpperCase());
		} catch (Exception e) {
			databaseType = Dialect.Type.valueOf("MYSQL");
		}
		if (databaseType == null) {
			throw new RuntimeException("the value of the dialect property in configuration.xml is not defined : " + configuration.getVariables().getProperty("dialect"));
		}
		Dialect dialect = null;
		switch (databaseType) {
		case MYSQL:
			dialect = new MySql5Dialect();
			break;
		case SQLSERVER:
			dialect = new SqlServerDialect();
			break;
		case ORACLE:
			dialect = new OracleDialect();
			break;
		default:
			dialect = new MySql5Dialect();
		}

		String originalSql = (String) metaStatementHandler.getValue("delegate.boundSql.sql");
		logger.info("old sql: "+getLineSql(boundSql.getSql()));
		//problem
		metaStatementHandler.setValue("delegate.boundSql.sql", dialect.getPageSql(originalSql, newRowBounds.getOffset(), newRowBounds.getLimit(), newRowBounds.getOrderBy(), newRowBounds.getOrder()));
		//将系统的值设为默认值，避免系统内部实现原有的分页方法
		metaStatementHandler.setValue("delegate.rowBounds.offset", RowBounds.NO_ROW_OFFSET);
		metaStatementHandler.setValue("delegate.rowBounds.limit", RowBounds.NO_ROW_LIMIT);
		logger.info("new sql: " + boundSql.getSql());
		return invocation.proceed();
	}

	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	private String getLineSql(String sql) {
		return sql.replaceAll("[\r\n]", " ").replaceAll("\\s{2,}", " ");
	}

}