package com.practice.cons;

public class City {
	String cityname;
	String nooftowns;
	int peoplesliving;
	String famousarea;
	int noofhospitals;
	
	public City(String cityname, String nooftowns, int peoplesliving, String famousarea, int noofhospitals) {
		this.cityname=cityname;
		this.nooftowns=nooftowns;
		this.peoplesliving=peoplesliving;
		this.famousarea=famousarea;
		this.noofhospitals=noofhospitals;
		
		}

	@Override
	public String toString() {
		return "City [cityname=" + cityname + ", nooftowns=" + nooftowns + ", peoplesliving=" + peoplesliving
				+ ", famousarea=" + famousarea + ", noofhospitals=" + noofhospitals + "]";
	}

	
	
	
	
	
	
	

	
	
	
	

}
