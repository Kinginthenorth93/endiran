package com.trial.multilevelinteritance;

public class Vehicletester {
	public static void main(String[] args) {
		System.out.println("Models and its specifications of Vehicles");
		Bike bike=new Bike();
		System.out.println("            BIKE              ");
		bike.bikemodel();
		bike.engine();
		bike.bikeengine();
		bike.wheels();
		bike.bikewheels();
		bike.price();
		bike.bikeprice();
		
	System.out.println("--------------------------------");
	System.out.println("--------------------------------");
	
		Car car=new Car();
		System.out.println("            CAR              ");
		car.carmodel();
		car.engine();
		car.carengine();
		car.wheels();
		car.carwheels();
		car.price();
		car.carprice();

		System.out.println("--------------------------------");	
		System.out.println("--------------------------------");
	
		Bus bus=new Bus();
		System.out.println("            BUS              ");
		bus.busmodel();
		bus.engine();
		bus.busengine();
		bus.wheels();
		bus.buswheels();
		bus.price();
		bus.busprice();
		
	}

}
