package com.trial.zoo;


public class Zootester {
	public static void main(String[] args) {
		Zoo vandalur= new Zoo("Vandalur", 167, 1067.568, 15, false, 500);
		
		System.out.println("Name of the Zoo is " + vandalur.name);
		System.out.println("There are " +vandalur.noofanimals + " animals in the Zoo");
		System.out.println(vandalur.zoosize + "sq.km");
		System.out.println("There are " +vandalur.noofzookeeper + " zookeepers working in this Zoo");
		System.out.println(vandalur.iszooopeninsunday);
		System.out.println("Entry fees of zoo is Rupees"+ vandalur.zooentryfees);
		
		
		
		
	}
	

}
