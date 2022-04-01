package com.trial.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuery {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/javadevelopes";
		String username="root";
		String password="Md@8015868393";
		Connection connection=null;
		String Insertquery="insert into candidates values(11,'Modi','M',1956,'Software Developer',9562314555,'Kolkata',40000)";
		
		
		try {
			connection=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established successfully"+ url);
			Statement statement=connection.createStatement();
			statement.executeUpdate(Insertquery);
			System.out.println("Data is Inserted successfully");

		}
		catch(SQLException s) {
			System.out.println(s.getMessage());
		}
		finally {
			if(connection!=null) {
				System.out.println("Connection is closed");
			} else {
				System.out.println("Connection is notr closed");
			}
		}
	
	
	}

}
