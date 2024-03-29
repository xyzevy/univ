package com.sand.util.hive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import org.junit.Test;

import com.sand.util.properties.PropertiesUtil;

public class HiveUtil {
	
private Connection connection;
	
	private Statement statement;
	
	public HiveUtil() {
		init();
	}
	public void init(){
		PropertiesUtil propertiesUtil = new PropertiesUtil();
		Properties properties = propertiesUtil.getProperties("/system.properties");
		String driverName = properties.getProperty("hive.driverClass");
		String url = properties.getProperty("hive.jdbcurl");
		String userName = properties.getProperty("oracle.user");
		String password = properties.getProperty("oracle.password");
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, userName, password);
			statement = connection.createStatement();
			System.out.println(connection);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void executeCommand(String cmd){
		try {
			statement.execute(cmd);
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
	
	public void setDatabase(String database){
		executeCommand("use " + database);
	}

}
