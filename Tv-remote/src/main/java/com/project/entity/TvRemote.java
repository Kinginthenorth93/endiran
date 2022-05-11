package com.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Tv_remote")
public class TvRemote {
	@Id
	@Column(name = "ID")
	@GeneratedValue(generator= "abc")
	@GenericGenerator(name = "abc", strategy = "increment")
	private int id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "BRAND")
	private String brand;
	
	@Column(name = "COLOUR")
	private String colour;
	
	@Column(name = "PRICE")
	private double price;
	
	@Column(name = "NoOfShells")
	private int NoOfShells;
	
	@Column(name = "IsPowerButtionWorking")
	private boolean IsPowerButtonWorking;
	
	public TvRemote() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TvRemote(int id, String name, String brand, String colour, double price, int noOfShells,
			boolean isPowerButtonWorking) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.colour = colour;
		this.price = price;
		NoOfShells = noOfShells;
		IsPowerButtonWorking = isPowerButtonWorking;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNoOfShells() {
		return NoOfShells;
	}
	public void setNoOfShells(int noOfShells) {
		NoOfShells = noOfShells;
	}
	public boolean isIsPowerButtonWorking() {
		return IsPowerButtonWorking;
	}
	public void setIsPowerButtonWorking(boolean isPowerButtonWorking) {
		IsPowerButtonWorking = isPowerButtonWorking;
	}
	@Override
	public String toString() {
		return "TvRemote [id=" + id + ", name=" + name + ", brand=" + brand + ", colour=" + colour + ", price=" + price
				+ ", NoOfShells=" + NoOfShells + ", IsPowerButtonWorking=" + IsPowerButtonWorking + "]";
	}
	
	
	
}	
