package com.trial.money;

public class Tester {
	public static void main(String[] args) {
		
		Bank m1=new Bank();
		Bank m2=new Bank();
		boolean type=m2.equals(m1);
		System.out.println(type);
		
		
		ICICI I1=new ICICI();
		ICICI I2=new ICICI();
		boolean type2=I2.equals(I1);
		System.out.println(type2);
		I2.display();
	
		Bank e1=new Bank();
		Bank e2=new Bank();
		boolean type3=e2.equals(e1);
		System.out.println(type3);
	}

}
