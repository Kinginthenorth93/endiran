package com.trial.customs;

public class Movie {
	String Moviename;
	String Protagonist;
	String Antagonist;
	int nooftheatres;
	String BOXOFFICE;
	
	
	public Movie(String moviename, String protagonist, String antagonist, int nooftheatres, String bOXOFFICE) {
		super();
		Moviename = moviename;
		Protagonist = protagonist;
		Antagonist = antagonist;
		this.nooftheatres = nooftheatres;
		BOXOFFICE = bOXOFFICE;
	}


	@Override
	public String toString() {
		return "Movie [Moviename=" + Moviename + ", Protagonist=" + Protagonist + ", Antagonist=" + Antagonist
				+ ", nooftheatres=" + nooftheatres + ", BOXOFFICE=" + BOXOFFICE + "]";
	}
	
	
	
	

}
