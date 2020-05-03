package com.yh;


import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.alibaba.druid.pool.DruidDataSource;

@SpringBootTest
class SpringbootMabatisDemoApplicationTests {

	@Autowired
    DataSource dataSource;
	
	@Test
	void contextLoads() throws SQLException {
		// 看默认数据源
		System.out.println(dataSource.getClass());
		// 获得链接
		Connection connection = dataSource.getConnection();		
		System.out.println(connection);
		
		DruidDataSource druidDataSource = (DruidDataSource) dataSource;
		System.out.println("数据源最大连接数" + druidDataSource.getMaxActive());
		System.out.println("数据库初始化连接数" + druidDataSource.getInitialSize());
		
		//关机连接
		connection.close();
	}

}
