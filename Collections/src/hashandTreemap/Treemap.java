package hashandTreemap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Treemap {
	public static void main(String[] args) {
		Map<Lesson, String> java=new TreeMap<Lesson, String>();
		
		java.put(new Lesson("S01", "1"), "Basics");
		java.put(new Lesson("S01", "2"), "Data Variables");
		java.put(new Lesson("S02", "1"), "Operator");
		java.put(new Lesson("S02", "2"), "Decision making statement");
		java.put(new Lesson("S03", "1"), "Flow Control loop");
		java.put(new Lesson("S04", "1"), "JVM");
		java.put(new Lesson("S05", "1.1"), "Inheritance");
		java.put(new Lesson("S05", "1"), "Oops");
	
		for(Map.Entry<Lesson, String> entry:java.entrySet()) {
			System.out.println(entry.getKey()+" = "+ entry.getValue()+ " class");
		}
		
	}

}
