package com.trial.caps;

public class Laptoptester {
	public static void main(String[] args) {
		Laptop acer=new Laptop();
		acer.setBrand("Acer");
		acer.setProcessor("Intel i5 processor with snapdragon quadcore");
		acer.setRam("8GB RAM");
		acer.setSerialnumber("Az20186325963N0123");
		acer.setGraphiccard("4GB Radion");
		acer.setPrice("INR54599 only");
		acer.setServicenumber(9897959693l);
		
		
		
		System.out.println("          Configuration and Specifications of ACER               ");
		System.out.println("Brand name: "+acer.getBrand()); 
		System.out.println(acer.getProcessor());
		System.out.println("RAM: "+ acer.getRam());
		System.out.println("Serial number: "+acer.getSerialnumber());
		System.out.println("Graphics: "+acer.getGraphiccard());
		System.out.println("Price: "+acer.getPrice());
		System.out.println("Service number: "+acer.getServicenumber());
	
	}

}
