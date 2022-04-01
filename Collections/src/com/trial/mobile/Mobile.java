package com.trial.mobile;

import java.io.Serializable;

public class Mobile implements Serializable {
	private String brand;
	private String RAM;
	private String Processor;
	private String location;
	private int price;
	
	
	public Mobile() {
		
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getRAM() {
		return RAM;
	}


	public void setRAM(String rAM) {
		RAM = rAM;
	}


	public String getProcessor() {
		return Processor;
	}


	public void setProcessor(String processor) {
		Processor = processor;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", RAM=" + RAM + ", Processor=" + Processor + ", location=" + location
				+ ", price=" + price + "]";
	}
	
	
	
	
	 
	
	
	

}
