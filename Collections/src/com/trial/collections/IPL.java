package com.trial.collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class IPL {
	public static void main(String[] args) {
		java.util.List<String> teams= new ArrayList<String>();
		teams.add("CSK");
		teams.add("RCB");
		teams.add("MI");
		teams.add("KKR");
		teams.add("SRH");
		teams.add("DC");
		teams.add("GT");
		teams.add("LSK");
		teams.add("KP");
		
		//System.out.println(teams);
		
	/*	Iterator<String> itr=teams.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		*/
		
		for(String str:teams) {
			System.out.println(str);
		}
	}

}
