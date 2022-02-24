package com.study.operator;

public class Bitwise {
	public static void main(String[] args) {
		int a = 9;
		int b = 12;
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~a);
		System.out.println(~b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a+b+"a");
		System.out.println(a+"b"+10);
		System.out.println(5+a+10+b);
		System.out.println(a+10);
		System.out.println(a+b+20);
		System.out.println("number is "+  a+b);
		System.out.println("number is " + (a+b));
		
		int d= 10+a-b*0;
		System.out.println(d);
	
		
	}

}
