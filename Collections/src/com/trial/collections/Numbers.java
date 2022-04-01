package com.trial.collections;

import java.awt.List;
import java.util.ArrayList;

public class Numbers {
	public static void main(String[] args) {
		java.util.List<String> number=new ArrayList<String>();
		number.add("2526l");
		number.add("2635p");
		
		
		System.out.println(number);
		
		System.out.println("\n");
		
		for(String s:number) {
			System.out.println(s);
		}
		
		
		
	}

}
