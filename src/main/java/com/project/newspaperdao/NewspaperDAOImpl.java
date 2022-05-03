package com.project.newspaperdao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.newspaperentity.Newspaper;

@Component
public class NewspaperDAOImpl implements NewspaperDAO {
	@Autowired
	private SessionFactory sessionfactory;
	
	public NewspaperDAOImpl() {
		System.out.println("Object created"+this.getClass().getSimpleName());	
		}
	@Override
	public boolean savenewspaperentity(Newspaper newspaper) {
		System.out.println("Invoked save Newspaper Entity......");
		Session session=null;
		
		try {
			session=sessionfactory.openSession();
			session.beginTransaction();
			session.save(newspaper);
			session.getTransaction().commit();
			System.out.println("Neswpaper Entity is saved.....");
			return true;
			
		}
		catch(HibernateException e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(session!=null) {
				System.out.println("Session is closed");
			} else {
				System.out.println("session is not closed");
			}
		}
		return false;
	}
	}

	
		

	

