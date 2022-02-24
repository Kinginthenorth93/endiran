package com.study.operator;

public class Bitwell3 {
	public static void main(String[] args) {
		int a=1;
		
		int b= a++  + ++a  *  --a  - a--;
		System.out.println(b);
	}

}
