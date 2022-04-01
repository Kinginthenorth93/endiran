package com.trial.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class Map {
	public static void main(String[] args) {
		java.util.Map<Integer, String> hi=new HashMap<Integer, String>();
		hi.put(5, "ABC");
		hi.put(8, "abc");
		hi.put(6, "kln");
		hi.put(9, "gty");
		hi.put(3, "kmn");
		
	//	for(java.util.Map.Entry<Integer, String> set:hi.entrySet()) {
			//System.out.println(set);
			
	//		System.out.println("Key "+set.getKey()+" = "+set.getValue()+" value");
	//	}
		
		Iterator<Entry<Integer, String>> set=hi.entrySet().iterator();
		while(set.hasNext()) {
			System.out.println(set.next());
		}
		
	}
		
	
}
