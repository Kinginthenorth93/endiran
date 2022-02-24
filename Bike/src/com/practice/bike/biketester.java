package com.practice.bike;

public class biketester {
	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.Id = 100;
		bike.Brand = "pulsar";
		bike.Price = 50000.00;
		bike.Model = "Bajaj";
		System.out.println("BIKE ID= " +  bike.Id);
		System.out.println("BIKE BRAND= " + bike.Brand);
		System.out.println("BIKE PRICE= " + bike.Price);
		System.out.println("BIKE MODEL= " + bike.Model);

	}

}
