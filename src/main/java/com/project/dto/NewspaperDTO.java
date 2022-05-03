package com.project.dto;

public class NewspaperDTO {
	private String NewspaperName;
	private double Price;
	private String Language;
	private double Noofpages;
	public NewspaperDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NewspaperDTO(String newspaperName, double price, String language, double noofpages) {
		super();
		NewspaperName = newspaperName;
		Price = price;
		Language = language;
		Noofpages = noofpages;
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
	public double getNoofpages() {
		return Noofpages;
	}
	public void setNoofpages(double noofpages) {
		Noofpages = noofpages;
	}
	@Override
	public String toString() {
		return "NewspaperDTO [NewspaperName=" + NewspaperName + ", Price=" + Price + ", Language=" + Language
				+ ", Noofpages=" + Noofpages + "]";
	}

}
