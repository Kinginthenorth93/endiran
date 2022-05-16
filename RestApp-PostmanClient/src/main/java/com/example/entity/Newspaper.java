package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "newspaperdetails")
public class Newspaper {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "NAME")
	private String Name;
	
	@Column(name = "PRICE")
	private double Price;
	
	@Column(name = "LANGUAGE")
	private String Language;
	
	@Column(name = "NOOFPAGES")
	private double Noofpages;

	public Newspaper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Newspaper(int id, String name, double price, String language, double noofpages) {
		super();
		this.id = id;
		Name = name;
		Price = price;
		Language = language;
		Noofpages = noofpages;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public double getNoofpages() {
		return Noofpages;
	}

	public void setNoofpages(double noofpages) {
		Noofpages = noofpages;
	}

	@Override
	public String toString() {
		return "Newspaper [id=" + id + ", Name=" + Name + ", Price=" + Price + ", Language=" + Language + ", Noofpages="
				+ Noofpages + "]";
	}
	
	
	
	
	

}
