package com.trial.usingscannerif;

import java.util.Scanner;

public class Usingscanner3 {
	public static void main(String[] args) {
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First number");
		a=scan.nextInt();
		System.out.println("Enter the Second number");
		b=scan.nextInt();
		char operator;
		System.out.println("Enter the operator +,-,*,/,%");
		operator=scan.next().charAt(0);
		
		if(operator== '+') {
			System.out.println(a + "+" + b + "=" + (a+b));
		}else if(operator== '-') {
			System.out.println(a + "-" + b + "=" + (a-b));
		}else if(operator== '*') {
			System.out.println(a + "*" + b + "=" + (a*b));
		}else if(operator== '/') {
			System.out.println(a + "/" + b + "=" + (a/b));
		}else if(operator== '%') {
			System.out.println(a + "%" + b + "=" + (a%b));
		} else {
			System.out.println("You enterted incorrect operator");
		}
		
	}

}
