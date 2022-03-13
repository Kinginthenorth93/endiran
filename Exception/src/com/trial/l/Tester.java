package com.trial.l;

public class Tester {
	public static void main(String[] args) {
		Money bank=new Money();
		try {
			bank.deposit(80000);
		}
		catch(ArithmeticException l) {
			System.out.println(l.depositinstructions());
		}
	}

}
