package com.trial.price;

public class Vehicle {
	String model="JAGUAR";
	String number="XL059";
	int brakesize=320;
	
	public Object priceforthismodel() {
		int priceforthismodel=120000;
		return priceforthismodel;
		
	}

	@Override
	public boolean equals(Object vehicle) {
		if(vehicle instanceof Vehicle) {
			return true;
		}else {
			return false;
		}
	}
	

}
