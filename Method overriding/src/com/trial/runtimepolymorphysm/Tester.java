package com.trial.runtimepolymorphysm;

public class Tester {
	public static void main(String[] args) {
		Modi m=new Modi();
		m.period();
		m.ruling();
		System.out.println("__________________________________________________________");
		
		Emmanuel e= new Emmanuel();
		e.ruling();
		e.period();
		
		System.out.println("___________________________________________________________");
		System.out.println("\n");
		
		Morrison mo=new Morrison();
		mo.ruling();
		mo.ruling();
		System.out.println("___________________________________________________________");
		System.out.println("\n");
		
		Modi m1=new Morrison();
		m1.ruling();
		m1.period();
		
	}

}
