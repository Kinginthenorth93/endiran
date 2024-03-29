package com.trial.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CandidatesDAOimplementations implements CandidatesDAO {
	
	@Override
	public void savedata() {
		System.out.println("Invoked save data method");
		
		String url="jdbc:mysql://localhost:3306/javadevelopes";
		String username="root";
		String password="Md@8015868393";
		Connection connection=null;
		String Insertquery="insert into candidates values(12,'Amitshah','M',1966,'Software Developer',9552314555,'Kolkata',40000)";
		
		
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
	@Override
	public void readalldata() {
		System.out.println("readalldata method");
		
		String url="jdbc:mysql://localhost:3306/javadevelopes";
		String username="root";
		String password="Md@8015868393";
		Connection connection=null;
		String ReadAllData="SELECT * FROM javadevelopes.candidates";
		
		try {
			connection=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is successfull "+url);
			Statement statement=connection.createStatement();
			ResultSet result=statement.executeQuery(ReadAllData);
			while(result.next()) {
				System.out.println("ID: "+result.getInt(1));
				System.out.println("Name: "+result.getString(2));
				System.out.println("Gender: "+result.getString(3));
				System.out.println("DOB: "+result.getBigDecimal(4));
				System.out.println("Designation: "+result.getString(5));
				System.out.println("Mobile number: "+result.getLong(6));
				System.out.println("Location: "+result.getString(7));
				System.out.println("Salary "+result.getInt(8));
				System.out.println("___________________________________");
				
			}

		}
		catch(SQLException s) {
			System.out.println("Inside catch block exception");
			System.out.println(s.getMessage());
			s.printStackTrace();
		}
		finally {
			if(connection!=null) {
			System.out.println("Connection is closed");
			} else {
				System.out.println("Connection is not closed");
			}
		}
	
	}
	
	@Override
	public void readsingledata() {
		System.out.println("Readsingledata method ");
		
		String url="jdbc:mysql://localhost:3306/javadevelopes";
		String username="root";
		String password="Md@8015868393";
		Connection connection=null;
		String ReadSingleData="SELECT * FROM javadevelopes.candidates where id=2";
		
	
	try {
		connection=DriverManager.getConnection(url,username,password);
		System.out.println("Connection is successfull "+url);
		Statement statement=connection.createStatement();
		ResultSet result=statement.executeQuery(ReadSingleData);
		while(result.next()) {
			System.out.println("ID: "+result.getInt(1));
			System.out.println("Name: "+result.getString(2));
			System.out.println("Gender: "+result.getString(3));
			System.out.println("DOB: "+result.getBigDecimal(4));
			System.out.println("Designation: "+result.getString(5));
			System.out.println("Mobile number: "+result.getLong(6));
			System.out.println("Location: "+result.getString(7));
			System.out.println("Salary "+result.getInt(8));
			System.out.println("___________________________________");
			
		}

	}
	catch(SQLException s) {
		System.out.println("Inside catch block exception");
		System.out.println(s.getMessage());
		s.printStackTrace();
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
	


