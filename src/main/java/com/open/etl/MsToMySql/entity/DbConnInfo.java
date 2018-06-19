package com.open.etl.MsToMySql.entity;

public class DbConnInfo {

	private String url;
	
	private String port;
	
	private String dbName;
	
	private String dbType;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getDbType() {
		return dbType;
	}

	public void setDbType(String dbType) {
		this.dbType = dbType;
	}

	@Override
	public String toString() {
		return "LinkInfo [url=" + url + ", port=" + port + ", dbName=" + dbName + ", dbType=" + dbType + "]";
	}
	
	
	
}
