package com.trial.price;

public class BMW extends Vehicle{
	String model="BMW";
	String number="xl022";
	int brakesize=350;
	
	public Object priceforthismodela() {
		int priceforthismodela=200000;
		return priceforthismodela;
		
	}
	public void displaythis() {
		System.out.println(model);
		System.out.println(number);
		System.out.println(brakesize);
	}
	

}
