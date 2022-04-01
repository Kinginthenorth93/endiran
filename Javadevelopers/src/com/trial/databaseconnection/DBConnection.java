package com.trial.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/javadevelopes";
		String username="root";
		String password="Md@8015868393";
		Connection connection=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is successfully established"+ url);
			}
		catch(SQLException|ClassNotFoundException exception) {
			System.out.println("Conncetion is failed"+exception.getMessage());
		}
		finally {
			connection.close();
		}
	}

}
