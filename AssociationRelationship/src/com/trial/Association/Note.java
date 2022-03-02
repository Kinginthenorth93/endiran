package com.trial.Association;

public class Note {
	String name;
	int noofpages;
	String usingfor;
	int howmuch;
	
	
	public Note() {
		
	}

	public Note(String name, int noofpages, String usingfor, int howmuch) {
		this.name = name;
		this.noofpages = noofpages;
		this.usingfor = usingfor;
		this.howmuch = howmuch;
	}

	public String note() {
		return "Note [name=" + name + ", noofpages=" + noofpages + ", usingfor=" + usingfor + ", howmuch=" + howmuch
				+ "]";
	}
	
	

	

	
	
	

}
