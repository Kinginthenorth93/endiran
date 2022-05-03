package com.project.newspaperentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "newspaperdetails")
public class Newspaper {
	@Id
	@Column(name = "NAME")
	private String NewspaperName;
	
	@Column(name = "PRICE")
	private double Price;
	
	@Column(name = "LANGUAGE")
	private String Language;
	
	@Column(name = "NOOFPAGES")
	private double NoOfPages;
	
	public Newspaper() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Newspaper(String newspaperName, double price, String language, double noOfPages) {
		super();
		NewspaperName = newspaperName;
		Price = price;
		Language = language;
		NoOfPages = noOfPages;
	}
	public String getNewspaperName() {
		return NewspaperName;
	}
	public void setNewspaperName(String newspaperName) {
		NewspaperName = newspaperName;
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
	public double getNoOfPages() {
		return NoOfPages;
	}
	public void setNoOfPages(double noOfPages) {
		NoOfPages = noOfPages;
	}
	@Override
	public String toString() {
		return "Newspaper [NewspaperName=" + NewspaperName + ", Price=" + Price + ", Language=" + Language
				+ ", NoOfPages=" + NoOfPages + "]";
	} 

}
