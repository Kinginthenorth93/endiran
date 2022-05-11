package com.project.wallet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Money {
	@Value("cash")
	private String type;
	
	@Value("15000")
	private String size;
	
	public Money() {
		System.out.println("Object created: "+this.getClass().getName());
	}
	
	public Money(String type, String size) {
		this.type=type;
		this.size=size;
	}
	
	public String gettype() {
		return type;
	}
	public void settype(String type) {
		this.type=type;
	}
	public String getsize() {
		return size;
	}
	public void setsize(String size) {
		this.size=size;
	}
	@Override
	public String toString () {
		return "Money [type=" + type + " , size = " + size + "]";
		
	}

}
