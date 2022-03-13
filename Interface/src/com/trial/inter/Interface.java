 package com.trial.inter;

import java.util.Scanner;

public class Interface implements Laptop, Mobile {

	public void mobileprice() {
		int priceoffer;
		Scanner scan=new Scanner(System.in);
		System.out.println("PRICE of mobile is: ");
		priceoffer=scan.nextInt();		
		if(priceoffer<50000) {
			System.out.println("Order the mobile");
		}else {
			System.out.println("Search for suggested budget mobile");
		}

	}

	public void mobilecharge() {
		int chargepower;
		Scanner scan=new Scanner(System.in);
		System.out.println("Charge depends on percentage");
		chargepower=scan.nextInt();
		if (chargepower>8000) {
			System.out.println(chargepower+"mph power is use for long stay power in mobile");
		} else {
			System.out.println("Less than "+chargepower+"mph is not okay for mobile ");
		}

	}

	public void price() {
		int pricelaptop;
		Scanner scan=new Scanner(System.in);
		System.out.println("PRICE of Laptop is: ");
		pricelaptop=scan.nextInt();		
		if(pricelaptop>40000) {
			System.out.println("If configuration is ok, then Order the Laptop");
		}else {
			System.out.println("Search for suggested budget Laptop");
		}
		
	}

	
	public void charge() {
		int charger;
		Scanner scan=new Scanner(System.in);
		System.out.println("Charge depends on percentage");
		charger=scan.nextInt();
		if (charger>8000) {
			System.out.println(charger+"mph power is use for long stay power in laptop");
		} else {
			System.out.println("Less than "+charger+"mph is not okay for laptop ");
		}
		
	}

}
