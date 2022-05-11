package com.project.wallet;

public class CardType {
	String type;
	
	public CardType() {
		System.out.println("Object created: "+this.getClass().getName());
	}

	public CardType(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "CardType [type=" + type + "]";
	}
	
	 

}
