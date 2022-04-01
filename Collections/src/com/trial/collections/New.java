package com.trial.collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ArrayList;

public class New {
	public static void main(String[] args) {
		java.util.List<String> listofplayers=new ArrayList<String>();
		listofplayers.add("Mahendira Singh Dhoni");
		listofplayers.add("Virat Kohli");
		listofplayers.add("Rohit Sharma");
		listofplayers.add("Ravindra Jadeja");
		listofplayers.add("Rishabh Pant");
		listofplayers.add("Shreyas Iyer");
		listofplayers.add("Ravindra Ashwin");
		listofplayers.add("Muhammed Shami");
		listofplayers.add("Bhuvanesh Kumar");
		listofplayers.add("Axel Patel");
		listofplayers.add("Axel Patel");
		
		System.out.println(listofplayers);
		
		System.out.println("\n");
		Iterator<String> players=listofplayers.iterator();
		while(players.hasNext()) {
			System.out.println(players.next());
		}
				
	}

}
