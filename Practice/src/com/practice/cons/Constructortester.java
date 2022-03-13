package com.practice.cons;

public class Constructortester {
	public static void main(String[] args) {
		City a = new City("Chennai", "23", 10256396, "Mahabalipuram, Amusement park and beaches", 152);
		System.out.println("Cityname is "+a.cityname);
		System.out.println(a.nooftowns+" towns are in this City.");
		System.out.println(a.peoplesliving+" peoples living in this City");
		System.out.println(a.famousarea+" and many places are there to visit.");
		System.out.println(a.noofhospitals+" hospitals in this city.");
		System.out.println("_______________________________________________________________________");
		
		
		City b=new City("Bangalore", "23", 10256323, "Amusement parks, mountains and Temples", 200);
		System.out.println("Cityname is "+b.cityname);
		System.out.println(b.nooftowns+" towns are in this City.");
		System.out.println(b.peoplesliving+" peoples living in this City");
		System.out.println(b.famousarea+" and many places are there to visit.");
		System.out.println(b.noofhospitals+" hospitals in this city.");
		System.out.println("________________________________________________________________________");
		
		
		City c=new City("Delhi", "15", 956325, "Red Fort, Taj Mahal", 30);
	
		System.out.println(c);  
		
	
	}
	

}
