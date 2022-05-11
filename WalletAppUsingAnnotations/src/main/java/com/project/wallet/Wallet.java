package com.project.wallet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Wallet {
	
	@Value("Yellow")
	private String colour;
	
	@Value("B_ONE")
	private Brand brand;
	
	@Autowired
	private Material material;
	
	@Value("135.00")
	private double price;
	
	@Autowired
	private Money money;
	
	@Autowired
	private ATMCard atmcard;
	
	@Autowired
	private Photo photo;
	
	public Wallet() {
		System.out.println("Object created: "+this.getClass().getName());
	}

	public Wallet(String colour, Brand brand, Material material, double price, Money money, ATMCard atmcard,
			Photo photo) {
		super();
		this.colour = colour;
		this.brand = brand;
		this.material = material;
		this.price = price;
		this.money = money;
		this.atmcard = atmcard;
		this.photo = photo;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Money getMoney() {
		return money;
	}

	public void setMoney(Money money) {
		this.money = money;
	}

	public ATMCard getAtmcard() {
		return atmcard;
	}

	public void setAtmcard(ATMCard atmcard) {
		this.atmcard = atmcard;
	}

	public Photo getPhoto() {
		return photo;
	}

	public void setPhoto(Photo photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Wallet [colour=" + colour + ", brand=" + brand + ", material=" + material + ", price=" + price
				+ ", money=" + money + ", atmcard=" + atmcard + ", photo=" + photo + "]";
	}
	
	
	
	
	



}
