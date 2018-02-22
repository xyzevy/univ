package com.sand.util.hive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.sand.util.properties.PropertiesUtil;

import net.sf.jsqlparser.statement.SetStatement;

//@Component
public class MysqlUtil {
	
	private Connection connection;
	
	private Statement statement;
	
	public MysqlUtil() {
		init();
	}
	
	public void init(){
		PropertiesUtil propertiesUtil = new PropertiesUtil();
		Properties properties = propertiesUtil.getProperties("/system.properties");
		String driverName = properties.getProperty("mysql.driverClass");
		String url = properties.getProperty("mysql.jdbcurl");
		String userName = properties.getProperty("mysql.user");
		String password = properties.getProperty("mysql.password");
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, userName, password);
			statement = connection.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet executeQuery(String cmd){
		try {
			return statement.executeQuery(cmd);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}