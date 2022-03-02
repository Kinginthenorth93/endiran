package com.trial.Association;

public class Pen {
	byte valueofpen;
	String companyname;
	String inktype;
	Note note;
	
	public void writepenproperties() {
		System.out.println("Company name of Pen is  "+ companyname);
		System.out.println("The ink used in the pen is " + inktype);
		System.out.println("The Pen is "+ valueofpen);
	}
	
	public void writenoteproperties() {
		System.out.println("Company of the note is " + note.name);
		System.out.println("The numer of pages in note is " + note.noofpages);
		System.out.println("This note is using for " + note.usingfor);
		System.out.println("This note is " + note.howmuch);

	}

	public Pen() {
		
	}
	
	public Pen(String companyname, String inktype, byte valueofpen, Note note) {
			
		this.companyname = companyname;
		this.inktype = inktype;
		this.valueofpen = valueofpen;
		this.note = note;
	}

	public String pen() {
		return "Pen [valueofpen=" + valueofpen + ", companyname=" + companyname + ", inktype=" + inktype + ", note="
				+ note + "]";
	}
	
	


}
