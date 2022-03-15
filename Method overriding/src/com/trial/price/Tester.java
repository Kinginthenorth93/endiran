package com.trial.price;

public class Tester {
	public static void main(String[] args) {
		Vehicle v1=new Vehicle();
		Vehicle v2=new Vehicle();
		boolean type1=v1.equals(v2);
		System.out.println(type1);
		System.out.println("_____________________________________________________");
		
		
		BMW m1=new BMW();
		BMW m2=new BMW();
		boolean type2=m1.equals(m2);
		System.out.println(type2);
		
		Vehicle x1=new BMW();
		Vehicle x2=new Vehicle();
		boolean type=x1.equals(x2);
		System.out.println(type);
		System.out.println(x2.priceforthismodel());
		
		Vehicle a=new Vehicle();
		BMW b=new BMW();
		boolean type4=b.equals(a);
		System.out.println(type4);
		System.out.println((a.brakesize)<(b.brakesize));
	}

}
