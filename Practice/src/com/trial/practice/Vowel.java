package com.trial.practice;

import java.util.Scanner;

public class Vowel {
	public static void main(String[] args) {
		
		char vowel;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the letter: ");
		vowel=scan.next().charAt(0);
		switch(vowel) {
		case'a':
			System.out.println("Vowel letter");
			break;
		case'e':	
			System.out.println("Vowel letter");
			break;
		case'i':	
			System.out.println("Vowel letter");
			break;
		case 'o':	
			System.out.println("Vowel letter");
			break;
		case'u':	
			System.out.println("Vowel letter");
			break;
		default :	
			System.out.println("Consonent letter");
		}
				
	}

}
