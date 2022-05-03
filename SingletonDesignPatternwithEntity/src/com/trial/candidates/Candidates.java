package com.trial.candidates;

import java.io.Serializable;

public class Candidates implements Serializable {
	private int id;
	private String name;
	private String gender;
	private int dob;
	private String designation;
	private long mobilenumber;
	private String address;
	private int salary;
	
	 public Candidates() {
		// TODO Auto-generated constructor stub
	}
	 
	 
	 

	public Candidates(int id, String name, String gender, int dob, String designation, long mobilenumber,
			String address, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.designation = designation;
		this.mobilenumber = mobilenumber;
		this.address = address;
		this.salary = salary;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Candidates [id=" + id + ", name=" + name + ", gender=" + gender + ", dob=" + dob + ", designation="
				+ designation + ", mobilenumber=" + mobilenumber + ", address=" + address + ", salary=" + salary + "]";
	}
	
		
	

}
