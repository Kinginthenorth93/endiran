package com.project.newspaperentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NamedQuery;


@Entity
@Table(name = "newspaperdetails")
@NamedQuery(name = "Newspaper.getNewspaperObject", query = "from Newspaper where NewspaperName=:name")
@NamedQuery(name = "Newspaper.getAllEntityObject", query = "from Newspaper")
public class Newspaper {
	@Id
	@GeneratedValue(generator = "abc")
	@GenericGenerator(name = "abc", strategy = "increment")
	@Column(name = "NAME")
	private String NewspaperName;
	
	@Column(name = "PRICE")
	private double Price;
	
	@Column(name = "LANGUAGE")
	private String Language;
	
	@Column(name = "NOOFPAGES")
	private double NoofPages;
	
	public Newspaper() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Newspaper(String newspaperName, double price, String language, double noofPages) {
		super();
		NewspaperName = newspaperName;
		Price = price;
		Language = language;
		NoofPages = noofPages;
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
	public double getNoofPages() {
		return NoofPages;
	}
	public void setNoofPages(double noofPages) {
		NoofPages = noofPages;
	}
	@Override
	public String toString() {
		return "Newspaper [NewspaperName=" + NewspaperName + ", Price=" + Price + ", Language=" + Language
				+ ", NoofPages=" + NoofPages + "]";
	} 

}
