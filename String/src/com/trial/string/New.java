package com.trial.string;

public class New {
	public static void main(String[] args) {
		String raa=new String("Doctor");
		StringBuffer ra=new StringBuffer("doctor");
		raa.concat("Surgeon");
		ra.append(" mahi");
		
		System.out.println(raa);
		System.out.println(ra);
		System.out.println(ra.equals(raa));
		System.out.println(raa.equals(ra));
		System.out.println(ra.hashCode());
		System.out.println(raa.endsWith(raa));
		
		
		
		
		
	
		
	}

}
