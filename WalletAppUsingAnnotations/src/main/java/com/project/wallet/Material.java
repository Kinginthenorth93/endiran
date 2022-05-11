package com.project.wallet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Material {
	
	@Value("3.2")
	private double size;
	
	@Value("leather")
	private String type;
	
	@Value("3.5")
	private float thickness;
	
	@Value("2500.00")
	private double price;
	
	public Material() {
		System.out.println("Object created: "+this.getClass().getName());
	}
	
	
	public Material(double size, String type, float thickness, double price) {
		this.size = size;
		this.type = type;
		this.thickness = thickness;
		this.price = price;
	}


	public double getSize() {
		return size;
	}


	public void setSize(double size) {
		this.size = size;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public float getThickness() {
		return thickness;
	}


	public void setThickness(float thickness) {
		this.thickness = thickness;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Material [size=" + size + ", type=" + type + ", thickness=" + thickness + ", price=" + price + "]";
	}
	
	

}
