package com.sand.util.sqoop;

import java.io.File;

public class SqoopParams {

	private String host;
	private String databaseType;
	private String databasePort;
	private String databaseName;
	private String userName;
	private String password;
	private String tableName;
	private String hiveDatabase;
	private String hiveTable;
	private String overwrite;
	
	public String getJdbcUrl(){
		if ("oracle".equals(databaseType)) {
			return "jdbc:" + databaseType + ":thin:@" + host + ":" + databasePort + ":" + databaseName;
		}else{
			return "jdbc:" + databaseType + "://" + host + ":" + databasePort + File.separator + databaseName;
		}
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getDatabaseType() {
		return databaseType;
	}

	public void setDatabaseType(String databaseType) {
		this.databaseType = databaseType;
	}

	public String getDatabasePort() {
		return databasePort;
	}

	public void setDatabasePort(String databasePort) {
		this.databasePort = databasePort;
	}

	public String getDatabaseName() {
		return databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getHiveDatabase() {
		return hiveDatabase;
	}

	public void setHiveDatabase(String hiveDatabase) {
		this.hiveDatabase = hiveDatabase;
	}

	public String getHiveTable() {
		return hiveTable;
	}

	public void setHiveTable(String hiveTable) {
		this.hiveTable = hiveTable;
	}

	public String getOverwrite() {
		return overwrite;
	}

	public void setOverwrite(String overwrite) {
		this.overwrite = overwrite;
	}

}