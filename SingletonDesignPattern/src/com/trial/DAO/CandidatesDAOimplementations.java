package com.trial.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.trial.singleton.util.ConnectionProvider;

public class CandidatesDAOimplementations implements CandidatesDAO {
	
	@Override
	public void savedata() {
		System.out.println("Imvoked save data started");
		
		String Insertquery="insert into candidates values(13,'ABCDEFG','M',1996,'Data Analyst',9552312345,'Mumbai',85000)";
		
		
		try {			
			Connection connection=ConnectionProvider.getconnection();
			Statement statement=connection.createStatement();
			statement.executeUpdate(Insertquery);
			System.out.println("Data is Inserted successfully");

		}
		catch(SQLException s) {
			System.out.println(s.getMessage());
		}
		
		
	}
	@Override
	public void readalldata() {
		System.out.println("readalldata method");
		
		
		String ReadAllData="SELECT * FROM javadevelopes.candidates";
		
		try {
			Connection connection=ConnectionProvider.getconnection();
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
		
	
	}
	
	@Override
	public void readsingledata() {
		System.out.println("Readsingledata method ");
		
		
		String ReadSingleData="SELECT * FROM javadevelopes.candidates where id=11";
		
	
		try {
			Connection connection = ConnectionProvider.getconnection();

			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(ReadSingleData);
			while (result.next()) {
				System.out.println("ID: " + result.getInt(1));
				System.out.println("Name: " + result.getString(2));
				System.out.println("Gender: " + result.getString(3));
				System.out.println("DOB: " + result.getBigDecimal(4));
				System.out.println("Designation: " + result.getString(5));
				System.out.println("Mobile number: " + result.getLong(6));
				System.out.println("Location: " + result.getString(7));
				System.out.println("Salary " + result.getInt(8));
				System.out.println("___________________________________");

			}

	}
	catch(SQLException s) {
		System.out.println("Inside catch block exception");
		System.out.println(s.getMessage());
		s.printStackTrace();
	}
	
}
		
	
		
	
		
	}
	


