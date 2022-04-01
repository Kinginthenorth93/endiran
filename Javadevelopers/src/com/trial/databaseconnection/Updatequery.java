package com.trial.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Updatequery {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/javadevelopes";
		String username="root";
		String password="Md@8015868393";
		Connection connection=null;
		String UpdateQuery="update candidates set designation=\"Manual Testing\" where id=5";
		
		try {
			connection=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is successfull "+url);
			Statement statement=connection.createStatement();
			statement.executeUpdate(UpdateQuery);
			System.out.println("Data is updated successfully");
		}
		catch(SQLException s) {
			System.out.println(s.getMessage());
						
		}
		finally {
			if(connection!=null) {
			System.out.println("Connection is closed");
			} else {
				System.out.println("Connection is not closed");
			}
				
	}

	}
}
