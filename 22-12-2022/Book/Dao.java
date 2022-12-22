package com.Book.Dao;

import com.Book.Entity.BookClass;

public interface Dao { // data access obj.class
	// declaring CRUD operation
	
	// for adding book entity
	 void add(BookClass  b);   // create
	 
	 
	// for fetching data of employee entity
	public void fetch(int book_ID);  // read

}
