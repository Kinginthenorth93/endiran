package com.trial.Mobile;

public class Mobile {
	String brand;
	String processor;
	String ram;
	String camerasize;
	int price;
	
	
	
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Mobile(String brand, String processor, String ram, String camerasize, int price) {
		super();
		this.brand = brand;
		this.processor = processor;
		this.ram = ram;
		this.camerasize = camerasize;
		this.price = price;
	}
	
	

	
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", processor=" + processor + ", ram=" + ram + ", camerasize=" + camerasize
				+ ", price=" + price + "]";
	}



	public static void main(String[] args) {
		Mobile mob=new Mobile("Realme 3 pro ", "Octacore", "4GM", "20pixel", 14599);
		System.err.println(mob);
	}
	
	

}
 