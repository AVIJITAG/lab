package com.Book.Dao_Implement;

import javax.swing.JOptionPane;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Book.UserBook;
import com.Book.Dao.Dao;
import com.Book.Entity.BookClass;
import com.Book.HibernateUtil.Util;

// concrete class of DAO:-  implementation of CRUD operations;

      public class Userimplement implements Dao{
// implementing CRUD methods	

	
	public void add(BookClass b) {
		// Logic For adding 
		
	try {
		Session session = Util.activeSession(); // getting session connection established
		Transaction tr = session.beginTransaction();// starting transaction
		session.save(b);                            // saving obj. data to DB
		tr.commit();                                // saving changes to DB permanently
		session.close();                            // closing the session
		 // dealing with SQL Exception
	}
		catch(HibernateException he) {
			System.out.println(he);
	 }
	     // dealing with General Exception
	
	    catch(Exception e) {                            
		System.out.println(e);
	}
}


	public void fetch(int book_ID) {
// Logic for fetching book details
		
	try {
		Session session = Util.activeSession();
		BookClass bookfetch = session.get(BookClass.class,book_ID);
		
// Displaying output
		
		JOptionPane.showMessageDialog(null," Book ID : ' "+bookfetch.getBook_ID()+" ' "
				                      +" Book Title : ' " +bookfetch.getTitle()+" ' "
				                      +" Book Author : ' "+bookfetch.getAuthor()+" ' "
				                      +" Book Price : ' "+bookfetch.getPrice()+" ' ");
		 session .close();                             		
	}
	
// Dealing with SQL Exceptions
	catch(HibernateException he) {
		System.out.println(he);
	}
// Dealing with General Exception
	catch(Exception e) {
		System.out.println(e);
	}
	}
	
}
