package com.trial.mobile;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.awt.List;       
import java.util.ListIterator;

public class MobileTester {
	public static void main(String[] args) {
		
	
	Mobile m=new Mobile();
	m.setBrand("SONY");
	m.setRAM("8GB");
	m.setProcessor("Snapdragon 866 with octacore processor");
	m.setLocation("Chennai");
	m.setPrice(19999);
	
	Mobile m1=new Mobile();
	m1.setBrand("Oppo Iseries");
	m1.setRAM("8GB");
	m1.setProcessor("Snapdragon 900 with hectacore processor");
	m1.setLocation("Chennai");
	m1.setPrice(24999);
	
	
	java.util.List<Mobile> abc=new ArrayList<Mobile>();
	abc.add(m1);
	abc.add(m);
	
	System.err.println(abc.set(0, m));

	
/*	ListIterator<Mobile> itr=abc.listIterator();
	System.out.println("Forward edition: ");
	while(itr.hasNext()) {
		System.out.println(itr.next());
		}
	
	System.out.println("Backward Edition: ");
	while (itr.hasPrevious()) {
		System.out.println(itr.previous());
	}
	
		
  java.util.List<String> list=new ArrayList<String>();
		list.add("All");
		list.add("IS");
		list.add("WELL");
		list.add("Never");
		list.add("be");
		list.add("fear");
		list.add("All");
		list.add("are");
		list.add("hear");
		System.out.println("Before sorting");
		System.out.println(list);
		System.out.println("After sorting");
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println("Reversed sorting");
		System.out.println(list);
		
	*/}
	
}	


