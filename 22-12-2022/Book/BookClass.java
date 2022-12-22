package com.Book.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Getter
//@Setter
@Entity
@Table(name = "Book_Details")

public class BookClass {
	
	// pojo data mambers with persistance table annotations
	
	@Id // primary key
	
	@Column(name="book_ID")
	private int book_ID;
	
	@Column (name= "title",length=20,nullable=false)
	private String title;
	
	@Column (name="author",length= 20,nullable=false)
	private String author;
	
	@Column (name="price",length =5, nullable=false,unique=true)
	private double price;
	
	
	// Getter and Setters


	public int getBook_ID() {
		return book_ID;
	}

	public void setBook_ID(int book_ID) {
		this.book_ID = book_ID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
