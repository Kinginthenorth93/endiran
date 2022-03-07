package com.trial.big;

public class tester {
	public static void main(String[] args) {
		
		Cons shop1=new Cons("ABC laptop sale and services", 1, 12000, 52000, 9865325263l);
		System.out.println("Name of the Shop: "+ shop1.shopname);
		System.out.println("Floor number: " + shop1.shop);
		System.out.println("Rent for this shop is Rps. " + shop1.rentforshop);
		System.out.println("Profit of the shop per month is " + shop1.profitfromshop);
		System.out.println("Contact number : " + shop1.shopcontactnumber);
		
	}
	

}
