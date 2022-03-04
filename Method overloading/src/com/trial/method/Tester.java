package com.trial.method;

public class Tester {
	public static void main(String[] args) {
		Addition add= new Addition();
		add.add(25, 63);
		System.out.println("Addition of three numbers is "+ add.add(23, 79, 63.52));
	}

}
