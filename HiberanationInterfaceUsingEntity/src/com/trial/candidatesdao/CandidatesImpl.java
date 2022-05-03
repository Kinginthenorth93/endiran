package com.trial.candidatesdao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.trial.entity.Candidates;

public class CandidatesImpl implements CandidatesDAO {

	@Override
	public void savedataEntity() {
		System.out.println("Invoked save data started");
		SessionFactory sessionfactory=null;
		Session session=null;
		
		try {
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(Candidates.class);
		cfg.configure("hibernate.cfg.xml");
		sessionfactory=cfg.buildSessionFactory();
		session=sessionfactory.openSession();
		session.beginTransaction();
		Candidates candy=new Candidates(16, "JACKIECHAN", "M", 1950, "Actor", 52352647, "Hong Kong", 2000000000);
		session.save(candy);
		session.getTransaction().commit();
		System.out.println("Data is inserted successfully");
		}
		
		catch(Exception e) {
			System.out.println("Inside catch block exception");
			
			
		}
		
		finally {
			if(session!=null) {
				System.out.println("Session is closed");
			} else {
				System.out.println("Session is not closed");
			}
			if(sessionfactory!=null) {
				System.out.println("session factory is closed");
			} else {
				System.out.println("Session factory is not closed");
			}
		}

	}
	
	
	@Override
	public void readsingledataEntitybyId() {
		System.out.println("Invoked single data to read");
		SessionFactory sessionfactory=null;
		Session session=null;
		
		
		try {
			Configuration cfg=new Configuration();
			cfg.addAnnotatedClass(Candidates.class);
			cfg.configure("hibernate.cfg.xml");
			sessionfactory=cfg.buildSessionFactory();
			session=sessionfactory.openSession();
			session.beginTransaction();
			Candidates candy=session.get(Candidates.class, 7);
			System.out.println("Read is done: "+candy);
			
		}
		catch(Exception e) {
			System.out.println("Inside catch block exception");
		}
		
		finally {
			if(session!=null) {
				System.out.println("Session is closed");
			} else {
				System.out.println("Session is not closed");
			}
			if(sessionfactory!=null) {
				System.out.println("session factory is closed");
			} else {
				System.out.println("Session factory is not closed");
			}
	
		}
		
	}
	
	
	@Override
	public void updatedataEntity() {
		System.out.println("Update the data in Database initialized");
		SessionFactory sessionfactory=null;
		Session session=null;
		Transaction trans=null;
		
		
		try {
			Configuration cfg=new Configuration();
			cfg.addAnnotatedClass(Candidates.class);
			cfg.configure("hibernate.cfg.xml");
			sessionfactory=cfg.buildSessionFactory();
			session=sessionfactory.openSession();
			session.beginTransaction();
			Candidates candy=session.get(Candidates.class, 13);
			System.out.println("Candidates Entity: "+candy);
			
			candy.setAddress("Kochi");
			candy.setName("Ajith");
			trans=session.getTransaction();
			session.update(candy);
			trans.commit();
			System.out.println("Data is updated successfully.....");
			System.out.println("After updated data, Candidates is : "+candy);
			
			}
		
		catch(Exception e) {
			System.out.println("Inside catch block exception.....");
			trans.rollback();
		}
		
		finally {
			if(session!=null) {
				System.out.println("Session is closed");
			} else {
				System.out.println("Session is not closed");
			}
			if(sessionfactory!=null) {
				System.out.println("session factory is closed");
			} else {
				System.out.println("Session factory is not closed");
			}
	
		}

	}
	

	@Override
	public void deletedEntity() {
		System.out.println("Update the data in Database initialized");
		SessionFactory sessionfactory=null;
		Session session=null;
		Transaction trans=null;
			
		
		try {
			Configuration cfg=new Configuration();
			cfg.addAnnotatedClass(Candidates.class);
			cfg.configure("hibernate.cfg.xml");
			sessionfactory=cfg.buildSessionFactory();
			session=sessionfactory.openSession();
			session.beginTransaction();
			Candidates candy=session.get(Candidates.class, 16);
			System.out.println("Candidates Entity: "+candy);
			trans=session.getTransaction();
			session.delete(candy);
			trans.commit();
			System.out.println("Data Entity is deleted successfully.....");
		
		}
		
		catch(Exception e) {
			System.out.println("Inside catch block exception......");
		}
		
		finally {
			if(session!=null) {
				System.out.println();
			}
			else {
				System.out.println("Session is not closed");
			}
			if(sessionfactory!=null) {
				System.out.println("Session is closed");
			}else {
				System.out.println("session factory is not closed");
			}
				
			
		}
	}
}
