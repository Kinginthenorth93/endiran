package com.trial.customs;

public class Movielist {
	public static void main(String[] args) {
		
		Movie TheAvengersEndGame=new Movie("Avengers EndGame", "Robert Downey jr", "Josh Breslin", 5000, "2.57Billion");
		Movie Titanic=new Movie("Titanic", "Leonardo Dicarpio", "James McChellan", 5000, "2.49Billion");
		
		Movie[] movies= {TheAvengersEndGame,Titanic};
		
				
		for(Movie m:movies) {
			System.out.println(m.toString());
		}
		
	}

}
