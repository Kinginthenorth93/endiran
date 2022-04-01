package com.trial.company;

public class Company {
	String name;
	String branchname;
	String noofemployees;
	int profit;
	long contactnumber;
	
	
	public Company() {
		
	}


	public Company(String name, String branchname, String noofemployees, int profit, long contactnumber) {
		super();
		this.name = name;
		this.branchname = branchname;
		this.noofemployees = noofemployees;
		this.profit = profit;
		this.contactnumber = contactnumber;
	}


	@Override
	public String toString() {
		return "Company [name=" + name + ", Total noofbranchname=" + branchname + ", Total noofemployees=" + noofemployees + ", Total profit="
				+ profit + ", Head contactnumber=" + contactnumber + "]";
	}
	
	
	
	
	
	

}
