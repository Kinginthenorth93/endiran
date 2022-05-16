package com.project.newspaperdao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.newspaperentity.Newspaper;

@Component
public class NewspaperDAOImpl implements NewspaperDAO {
	@Autowired
	private SessionFactory sessionfactory;
	
	public NewspaperDAOImpl() {
		System.out.println("Object created: "+this.getClass().getSimpleName());	
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


	@Override
	public Newspaper getNewspaperEntity(String NewspaperName) {
		System.out.println("Invoked get newspaper entity method....");
		Session session=null;
		try {
			session=sessionfactory.openSession();
			Query<Newspaper> query=session.getNamedQuery("Newspaper.getNewspaperObject");
			query.setParameter("name", NewspaperName);
			Newspaper newspaperEntity=query.uniqueResult();
			System.out.println("Found Newspaper: "+newspaperEntity);
			if(newspaperEntity!=null) {
				return newspaperEntity;
			}
			else {
				System.out.println("Newspaper name is not found");
				return null;
			}
			
		}
			catch(HibernateException e) {
				System.out.println(e.getMessage());
			}
			if(session!=null) {
				System.out.println("Session is closed");
			}
			else {
				System.out.println("Sesssion is not closed");
			}
		
		return null;
	}


	@Override
	public List<Newspaper> getAllNewspaperEntity() {
		System.out.println("Invoked get all newspaperentity method........");
		Session session=null;
		try  {
			session=sessionfactory.openSession();
			Query query=session.getNamedQuery("Newspaper.getAllEntityObject");
			List<Newspaper> list=query.list();
			if(!list.isEmpty() && list !=null) {
				return list;
			}
			else {
				System.out.println("table is empty... Add some data...");
			}
			return null;
		}
		catch(HibernateException e) {
			System.out.println(e.getMessage());
		}
		finally {
			if (session!=null) {
				System.out.println("session is closed");
			} else {
				System.out.println("Session is not closed");
			}
		}
		return null;
	}


	@Override
	public boolean deleteNewspaperEntity(String NewspaperName) {
		System.out.println("Invoked delete Newspaper entity method.....");
		Session session=null;
		try {
			session=sessionfactory.openSession();
			Query query=session.getNamedQuery("deleteNewspaperEntity");
			query.setParameter("name", NewspaperName);
			Newspaper object=(Newspaper) query.uniqueResult();
			System.out.println("Delete is successful "+object);
			session.beginTransaction();
			session.delete(object);
			session.getTransaction().commit();
			return true;
		}
		catch (HibernateException e) {
			session.getTransaction().rollback();
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