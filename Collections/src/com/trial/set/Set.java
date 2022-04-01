package com.trial.set;

import java.util.HashSet;
import java.util.Iterator;

public class Set {
	public static void main(String[] args) {
		java.util.Set<String> csk=new HashSet<String>();
		csk.add("Mahendra Singh Dhoni");
		csk.add("Rudwaj Godwada");
		csk.add("Ambati Rayudu");
		csk.add("Suresh Raina");
		csk.add("Ravindra Jadeja");
		csk.add("Robin Uttappa");
		csk.add("Mitchell satner");
		csk.add("Ravindra Jadeja");
		
		
		//for(String str:csk) {
		//	System.out.println(str);
		//}
		
		Iterator<String> itr=csk.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}

}
