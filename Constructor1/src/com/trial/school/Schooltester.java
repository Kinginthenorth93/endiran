package com.trial.school;

public class Schooltester {
	public static void main(String[] args) {
		
		School Highersecondary1 = new School("ABC School");
		System.out.println(Highersecondary1.schoolname);
		System.out.println("--------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------");
		
		School Highersecondary2 = new School("CDE School", 12001);
		System.out.println(Highersecondary2.schoolname);
		System.out.println(Highersecondary2.nooftotalstudents);
		System.out.println("--------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------");
		
				
		
		School Highersecondary3 = new School("FGI School", 12002, (byte)20);
		System.out.println(Highersecondary3.schoolname);
		System.out.println(Highersecondary3.nooftotalstudents);
		System.out.println(Highersecondary3.nooftotalteachers);
		System.out.println("--------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------");
		
		
		School Highersecondary4 = new School("JKL School", 12003, (byte)19, 40000);
		System.out.println(Highersecondary4.schoolname);
		System.out.println(Highersecondary4.nooftotalstudents);
		System.out.println(Highersecondary4.nooftotalteachers);
		System.out.println(Highersecondary4.averagefees);
		System.out.println("--------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------");
		
		
		
		School Highersecondary5 = new School("MNO School", 12004 , (byte)19, 30000, 89.45);
		System.out.println(Highersecondary5.schoolname);
		System.out.println(Highersecondary5.nooftotalstudents);
		System.out.println(Highersecondary5.nooftotalteachers);
		System.out.println(Highersecondary5.averagefees);
		System.out.println(Highersecondary5.schooloverallscore);
		System.out.println("--------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------");
		
		School Highersecondary6 = new School("MNO School", 12004 , (byte)19, 30000, 89.45);
		
		System.out.println(Highersecondary6);
		
		
		
	
		
	}
	

}
