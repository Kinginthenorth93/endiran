package com.trial.usingscannerif;

import java.util.Scanner;

public class Usingscannerfist {
		public static void main(String[] args) {
		int m;
		Scanner scan=new Scanner(System.in);
			
			
		System.out.println("Enter the number from 1 to 100");
		m = scan.nextInt();
					
		if (m>90) {
			System.out.println("Grade A");
		}else if(m>80) {
			System.out.println("Grade B");
		} else if(m>70) {
			System.out.println("Grade C");
		} else if(m>60) {
			System.out.println("Grade D");
		} else {
			System.out.println("Grade E");
			}
		}

	}

