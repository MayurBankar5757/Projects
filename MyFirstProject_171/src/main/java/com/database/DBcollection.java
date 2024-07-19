package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBcollection {
	static String dbDriver = "com.mysql.cj.jdbc.Driver";
	static String dbURL = "jdbc.mysql://localhost:3306/" ;
	
	static String dbName = "test";
	static String dbUsername = "root";
	static String dbPassword = "root";
	
	public static Connection getConnection () throws SQLException, ClassNotFoundException{
		Class.forName(dbDriver);
		Connection con = DriverManager.getConnection(dbURL+dbName ,dbUsername,dbPassword );
		return con;

}
	}




