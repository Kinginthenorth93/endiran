package com.trial.switc;

import java.util.Scanner;

public class Switch3 {
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
	
		switch(operator) {
		case '+':
			System.out.println(a + "+" + b + "=" + (a+b));
			break;
		case '-':
			System.out.println(a + "-" + b + "=" + (a-b));
			break;
		case '*':
			System.out.println(a + "*" + b + "=" + (a*b));
			break;
		case '/':
			System.out.println(a + "/" + b + "=" + (a/b));	
			break;
		case '%':
			System.out.println(a + "%" + b + "=" + (a%b));	
			break;
		default:
			System.out.println("You entered the incorrect operator");
		}
	
	
	
	}

}
