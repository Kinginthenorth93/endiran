package com.project.tvremoteDAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.entity.TvRemote;

@Component
public class TvRemoteDAOImpl implements TvRemoteDAO {
	
	@Autowired
	private SessionFactory sessionfactory;
	
	public TvRemoteDAOImpl() {
		System.out.println("Tv reomte DAO object is created");
	}
	@Override
	public void addTvRemoteEntity(TvRemote tvremote) {
		System.out.println("Invoked Tv Remote entity method......");
		Session session=null;
	 try{
		session=sessionfactory.openSession();
		session.beginTransaction();
		session.save(tvremote);
		session.getTransaction().commit();
		System.out.println("Tv Remote Entity is saved");

	}
	catch(HibernateException e) {
		System.out.println("Transaction is failed.... roll back....");
		session.getTransaction().rollback();
	}
	finally {
		if(session!=null) {
			System.out.println("session is closed");
		} else {
			System.out.println("session is not closed");
		}
		
	}

}

	
}	