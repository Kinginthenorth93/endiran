package hashandTreemap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Chapter {
	public static void main(String[] args) {
		Map<Integer, String> java=new TreeMap<Integer, String>();
		
		java.put(1, "Basics");
		java.put(2, "Data Variables");
		java.put(3, "Operator");
		java.put(4, "Decision making statement");
		java.put(5, "Flow Control loop");
		java.put(6, "JVM");
		java.put(7, "Inheritance");
		java.put(7, "Oops");
	
		for(Map.Entry<Integer, String> entry:java.entrySet()) {
			System.out.println("Key "+entry.getKey()+" = "+ entry.getValue()+ " class");
		}
		
	}
	
	

}
