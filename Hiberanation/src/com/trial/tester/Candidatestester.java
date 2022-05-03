package com.trial.tester;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.trial.entity.Candidates;

public class Candidatestester {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(Candidates.class);
		cfg.configure("hibernate.cfg.xml");
		SessionFactory ses=cfg.buildSessionFactory();
		Session session=ses.openSession();
		session.beginTransaction();
		Candidates candy=new Candidates(15, "XYZ", "F", 1990, "Teacher", 950095002, "Hosur", 60000);
		session.save(candy);
		System.out.println("Data is inserted successfully");
		session.getTransaction().commit();
		session.close();
		ses.close();
	}

}
