package com.trial.money;

public class ICICI extends Bank{
	String bankbranch="street";
	String Ifsccode="ICICI0009876";
	int noofbranches=101;
	
	public Object rateofinterestforloan () {
		return"11.03%";
		
	}
	public void display() {
		System.out.println(bankbranch);
		System.out.println(Ifsccode);
		System.out.println(noofbranches);
	}
}
