package com.trial.sessionfactory;

import java.util.Objects;

import org.hibernate.cfg.Configuration;

public class SessionFactory {
private static org.hibernate.SessionFactory sessionfactory=null;
	

	static {
		sessionfactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}
	
	public static org.hibernate.SessionFactory getsessionfactory() {
		System.out.println("Invoked read all entity");
		if(Objects.nonNull(sessionfactory)) {
			return sessionfactory;
		}
		else {
			System.out.println("Session Factory is not created");
			return sessionfactory;
		}
		
		
	}
		public static void closesessionfactory() {
			System.out.println("Invoked close session factory.......");
			try {
				if(sessionfactory!=null) {
					System.out.println("Session Factory is closes");
				}
				else {
					System.out.println("Session Factory is not closed");
				}
				
			}
			catch(Exception e) { 
				System.out.println(e.getMessage());
				e.printStackTrace();
		}
			
			
		}

	}
