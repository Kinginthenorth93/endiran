package com.trial.company;

public class CompanyTester {
	public static void main(String[] args) {
		Company c=new Company("XYZ", "Delhi", "5000", 52162500, 92121523652l);
		System.out.println(c.name);
		System.out.println(c.branchname);
		System.out.println(c.noofemployees);
		System.out.println(c.profit);
		System.out.println(c.contactnumber);
		System.out.println("______________________________________________________________________________________");
		
		Company c1=new Company("XYZ", "Tamilnadu", "4450", 50000000, 91956325487l);
		System.out.println(c1.name);
		System.out.println(c1.branchname);
		System.out.println(c1.noofemployees);
		System.out.println(c1.profit);
		System.out.println(c1.contactnumber);
		System.out.println("______________________________________________________________________________________");
		
		Company c2=new Company("XYZ", "2", "9450", 10000000, 919998845645l);
		System.out.println(c2.toString());
		
		
		}
		
	}


