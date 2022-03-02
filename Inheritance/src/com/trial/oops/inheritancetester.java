package com.trial.oops;

public class inheritancetester {
	public static void main(String[] args) {
		Patient patient = new Patient();
		patient.patientname = "Jon snow";
		patient.patienttreatment = "Heart failure";
		patient.operationtime = "8AM to 2PM";
		patient.doctorname= "Dr.Raja";
		patient.doctordesignation = "Ccardiologyist";
		
		patient.operation();
		patient.hospital();
	}

}
