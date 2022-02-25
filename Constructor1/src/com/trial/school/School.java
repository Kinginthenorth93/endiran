package com.trial.school;

public class School {
	String schoolname;
	int nooftotalstudents;
	double schooloverallscore;
	int averagefees;
	byte nooftotalteachers;
	
	public School() {
		
	}

	public School(String schoolname) {
		this.schoolname = schoolname;
		}
	
	public School(String schoolname, int nooftotalstudents) {
		this.schoolname = schoolname;
		this.nooftotalstudents = nooftotalstudents;
		}
	public School(String schoolname, int nooftotalstudents, byte nooftotalteachers) {
		this.schoolname = schoolname;
		this.nooftotalstudents = nooftotalstudents;
		this.nooftotalteachers = nooftotalteachers;
		}
	public School(String schoolname, int nooftotalstudents, byte nooftotalteachers, int averagefees) {
		this.schoolname = schoolname;
		this.nooftotalstudents = nooftotalstudents;
		this.nooftotalteachers = nooftotalteachers;
		this.averagefees = averagefees;
		}
	public School(String schoolname, int nooftotalstudents, byte nooftotalteachers, int averagefees, 
				double schooloverallscore) {
		this.schoolname = schoolname;
		this.nooftotalstudents = nooftotalstudents;
		this.nooftotalteachers = nooftotalteachers;
		this.averagefees = averagefees;
		this.schooloverallscore = schooloverallscore;
	}

	public String toString() {
		return "School [schoolname=" + schoolname + ", nooftotalstudents=" + nooftotalstudents + ", schooloverallscore="
				+ schooloverallscore + ", averagefees=" + averagefees + ", nooftotalteachers=" + nooftotalteachers
				+ "]";
	}
	
	
		
}
