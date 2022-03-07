package com.trial.shoppingmall;

public class Shoppingmalltester {
	public static void main(String[] args) {
		Shoppingmall purchase = new Shoppingmall();
		System.out.println(purchase.Name());
		System.out.println(purchase.Location());
		System.out.println(purchase.floors());
		purchase.homeappliances();
		purchase.AC();
		purchase.refrigerator();
		
	}

}
