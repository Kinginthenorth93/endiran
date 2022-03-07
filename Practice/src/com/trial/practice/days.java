package com.trial.practice;

import java.util.Scanner;

public class days {
	public static void main(String[] args) {
		String days;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the date: ");
		days=scan.next();
		
		switch(days) {
		case "1":
			System.out.println("Monday");
			break;
		case "2":
			System.out.println("Tuesday");
			break;
		case "3":
			System.out.println("Wednesday");
			break;
		case "4":
			System.out.println("Thursday");
			break;
		case "5":
			System.out.println("Friday");
			break;
		case "6":
			System.out.println("Saturday");
			break;
		case "7":
			System.out.println("Sunday");
			break;
		default:
			System.err.println("Invalid");
			
		}

		
	}

}
