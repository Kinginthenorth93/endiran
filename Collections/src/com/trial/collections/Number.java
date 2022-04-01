package com.trial.collections;


import java.util.Stack;

public class Number {
	public static void main(String[] args) {
		Stack<Integer> demo=new Stack<Integer>()      ;
		demo.push(45);
		demo.push(63);
		demo.push(2);
		demo.push(12);
		demo.push(59);
		demo.push(98);
		demo.push(2);
		demo.pop();
		demo.pop();
		demo.pop();
		demo.pop();
		//demo.pop();
		demo.pop();
		demo.pop();
		
		
		
		//System.out.println(demo.peek());
		
		for(Integer temp:demo) {
			System.out.println(temp);
		}
	}

}
