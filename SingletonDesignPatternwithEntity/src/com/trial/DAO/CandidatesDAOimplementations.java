package com.trial.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.trial.candidates.Candidates;
import com.trial.singleton.util.ConnectionProvider;

public class CandidatesDAOimplementations implements CandidatesDAO {
	
//	@Override
//	public void savedata(Candidates candy) {
//		System.out.println("Imvoked save data started");
//		
//		String Insertquery="insert into candidates values(?,?,?,?,?,?,?,?)";
//		
//		
//		try {			
//			Connection connection=ConnectionProvider.getconnection();
//			PreparedStatement prepared=connection.prepareStatement(Insertquery);
//			prepared.setInt(1, candy.getId());
//			prepared.setString(2, candy.getName());
//			prepared.setString(3, candy.getGender());
//			prepared.setInt(4, candy.getDob());
//			prepared.setString(5, candy.getDesignation());
//			prepared.setLong(6, candy.getMobilenumber());
//			prepared.setString(7, candy.getAddress());
//			prepared.setInt(8, candy.getSalary());
//			
//			prepared.executeUpdate();
//			System.out.println("Data is Inserted successfully");
//
//		}
//		catch(SQLException s) {
//			System.out.println(s.getMessage());
//		}
//		
//		
//	}
//	@Override
//	public void readalldata(Candidates candy) {
//		System.out.println("readalldata method");
//		
//		
//		String ReadAllData="SELECT * FROM javadevelopes.candidates";
//		
//		try {
//			Connection connection=ConnectionProvider.getconnection();
//			Statement statement=connection.createStatement();
//			PreparedStatement prepared=connection.prepareStatement(ReadAllData);
//			ResultSet result=prepared.executeQuery(ReadAllData);
//			while(result.next()) {
//				System.out.println("ID: "+prepared.getResultSet().getInt(1));
//				System.out.println("Name: "+prepared.getResultSet().getString(2));
//				System.out.println("Gender: "+prepared.getResultSet().getString(3));
//				System.out.println("DOB: "+prepared.getResultSet().getBigDecimal(4));
//				System.out.println("Designation: "+prepared.getResultSet().getString(5));
//				System.out.println("Mobile number: "+prepared.getResultSet().getLong(6));
//				System.out.println("Location: "+prepared.getResultSet().getString(7));
//				System.out.println("Salary "+prepared.getResultSet().getInt(8));
//				System.out.println("___________________________________");
//				
//			}
//
//		}
//		catch(SQLException s) {
//			System.out.println("Inside catch block exception");
//			System.out.println(s.getMessage());
//			s.printStackTrace();
//		}
//		
//	
//	}
	
	@Override
	public void readsingledata(Candidates candy) {
		System.out.println("Readsingledata method ");
		
		
		String ReadSingleData="SELECT * FROM javadevelopes.candidates where id=?";
		
	
		try {
			Connection connection = ConnectionProvider.getconnection();
			PreparedStatement prepared=connection.prepareStatement(ReadSingleData);
			prepared.setInt(1, candy.getId());			
			ResultSet result = prepared.executeQuery();
			result.next();
				System.out.println("ID: "+prepared.getResultSet().getInt(1));
				System.out.println("Name: "+prepared.getResultSet().getString(2));
				System.out.println("Gender: "+prepared.getResultSet().getString(3));
				System.out.println("DOB: "+prepared.getResultSet().getBigDecimal(4));
				System.out.println("Designation: "+prepared.getResultSet().getString(5));
				System.out.println("Mobile number: "+prepared.getResultSet().getLong(6));
				System.out.println("Location: "+prepared.getResultSet().getString(7));
				System.out.println("Salary "+prepared.getResultSet().getInt(8));
				System.out.println("___________________________________");
				

			

	}
	catch(SQLException s) {
		System.out.println("Inside catch block exception");
		System.out.println(s.getMessage());
		s.printStackTrace();
	}
	
}
		
	
		
	
		
	}
	


