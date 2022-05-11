package com.project.wallet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ATMCard {
	
	@Value("1234123456785678")
	private long cardno;
	
	@Value("567")
	private int cvv;
	
	@Autowired
	private CardType cardtype;
	
	@Value("White")
	private String colour;
	
	
	public ATMCard() {
		System.out.println("Object created: "+this.getClass().getName());
	}


	public ATMCard(long cardno, int cvv, CardType cardtype, String colour) {
		super();
		this.cardno = cardno;
		this.cvv = cvv;
		this.cardtype = cardtype;
		this.colour = colour;
	}


	public long getCardno() {
		return cardno;
	}


	public void setCardno(long cardno) {
		this.cardno = cardno;
	}


	public int getCvv() {
		return cvv;
	}


	public void setCvv(int cvv) {
		this.cvv = cvv;
	}


	public CardType getCardtype() {
		return cardtype;
	}


	public void setCardtype(CardType cardtype) {
		this.cardtype = cardtype;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}
	
	@Override
	public String toString() {
		return "ATMCard [Cardno= " + cardno + ", cvv=" + cvv + ", cardtype=" + cardtype + ", colour="+ colour + "]";
	}
	
	

}
