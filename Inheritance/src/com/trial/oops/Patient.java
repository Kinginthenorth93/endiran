package com.trial.oops;

public class Patient extends Doctor {
	String patientname;
	String patienttreatment;
	String operationtime;
	
	public void operation() {
		System.out.print(patientname + " have operation for " + patienttreatment + " at " + operationtime + " . " );
	}

	public void hospital() {
		System.out.print("His doctor is " + doctorname + " who specialised in " + doctordesignation );
	}
}
