package com.lyceum.dao.mybatis;

import org.apache.ibatis.session.SqlSessionFactory;

public abstract class MybatisClient {

	private final MybatisConnectionManager connectionManager;
	
	public MybatisClient(MybatisConnectionManager connectionManager) {
		this.connectionManager = connectionManager;
	}
	
	public SqlSessionFactory getSqlSessionFactory() {
		return connectionManager.getSqlSessionFactory();
	}
	
}
