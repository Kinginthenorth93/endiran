package com.trial.l;

public class Money {
	public void deposit(int amount) {
		if(amount>50000) {
			throw new ArithmeticException(); 
		}else {
			System.out.println("Pay in Counter with payslip");
		}
	}





}
