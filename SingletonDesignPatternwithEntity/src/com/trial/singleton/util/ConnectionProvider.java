package com.trial.singleton.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	private static Connection connection=null;
	
	
	static {
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadevelopes","root","Md@8015868393");
			System.out.println("Connection is esuccessfully");
			System.out.println("Connection is singleton");			
			
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public static Connection getconnection() {
		if(connection!=null) {
			return connection;
		}
		else {
			System.out.println("Connection is not closed");
			return connection;
		}
	}
	public static void closeconnection() {
		try {
			if(connection!=null) {
				connection.close();
			}else {
				System.out.println("Connection is not closed");
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
