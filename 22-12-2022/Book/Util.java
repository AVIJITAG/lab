package com.Book.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
public class Util { // util class
	
	public static Session activeSession() { // creating and returning session method
		Configuration config = new Configuration().configure();
		SessionFactory sFactory = config.buildSessionFactory();
		Session session = sFactory.openSession();
		return session; // returing the session
		
	}
}
	
