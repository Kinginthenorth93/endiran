package com.trial.candidatesdao;

import java.util.List;

import java.util.Objects;

import org.hibernate.query.Query;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.trial.entity.Candidates;

public class CandidatesImpl implements CandidatesDAO {

	@Override
	public void getalldataEntity() {
		System.out.println("Invoked all data entity.......");
		SessionFactory sessionfactory=null;
		Session session=null;
		
		try {
			sessionfactory=com.trial.sessionfactory.SessionFactory.getsessionfactory();
			session=sessionfactory.openSession();
			String hqlquery="from com.trial.entity.Candidates";
			Query query=session.createQuery(hqlquery);
			
			List candy=query.list();
			System.out.println(candy);
			
		}
		catch(HibernateException e) {
			System.out.println("Inside catch block exception.......");
			
		}
		finally {
			if(sessionfactory!=null) {
				System.out.println("Session Factory is closed");
			}
			else {
				System.out.println("Session Factory is not closed|");
			}
			if(session!=null) {
				System.out.println("session is closed"); 
			}
			else {
				System.out.println("session is not closed");
			}
		}
		
		
	}

	@Override
	public void getdataEntitybyId() {
		System.out.println("Invoked data entity by Id.......");
		SessionFactory sessionfactory=null;
		Session session=null;
		
		try {
			sessionfactory=com.trial.sessionfactory.SessionFactory.getsessionfactory();
			session=sessionfactory.openSession();
			Candidates candy=session.get(Candidates.class, 5);
			System.out.println("Read Data by Id: " + candy);
			
		}
		
		catch(HibernateException e) {
			System.out.println("Inside block exception......");
			
		}
		
		finally {
			if(sessionfactory!=null) {
				System.out.println("Session Factory is closed");
			}
			else {
				System.out.println("Session Factory is not closed|");
			}
			if(session!=null) {
				System.out.println("session is closed"); 
			}
			else {
				System.out.println("session is not closed");
			}
		}
		
		
	}
	
	
	
		
}
