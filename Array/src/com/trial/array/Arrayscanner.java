package com.trial.array;

import java.util.Scanner;

public class Arrayscanner {
	public static void main(String[] args) {
		System.out.println("Enter the serial number: ");
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		
		String[] name=new String[x];
		System.out.println("Enter the Name: ");
		for(int i=0;i<name.length;i++) {
			name[i]=scan.next();	
		}
		System.out.println("Arrange the order");
		for(int i=0;i<name.length; i++) {
			System.out.println(i+"-"+name[i]);
		}
		
	}

}
