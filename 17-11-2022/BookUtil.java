//Problem Statement 1

package Lab_17_11_2022;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


class InvalidBookException extends Exception {                           // extendes
	InvalidBookException(String msg){
		super(msg);
	}
}

class Book {                                                            // class create
	String bookID, title, author, category; Float price;           // value
	public Book(String bookID, String title, String author, String category, Float price) throws                // exception throws
	Exception {
		this.bookID = bookID; this.title = title; this.author = author; this.category = category; this.price = price;
		if ((!Objects.equals(category,"Science")&& !Objects.equals(category,"Fiction")&& !Objects.equals(category,"Technology") && 
				!Objects.equals(category, "Others")) || (price < 0) || (bookID.charAt(0)!= 'B') || (bookID.length() !=4))
			throw new InvalidBookException("");
	}
}

 class BookStore {                             // another class
	 List<Book> list = new ArrayList<>();   // create arraylist
	 void addBook(Book b) { list.add(b); }
	 public void searchByTitle(String title) {     // method create
		 for (Book book : list)                                 // for loop
			 if (book.title.contains(title))            // statement
				 System.out.println("RESULT FOUND \n" +"BookId: " + book.bookID +" Title: " + book.title +                      // print value
						 " AUTHOR : " + book.author + " category " + book.category + " PRICE : " + book.price + "\n");
	 }
	  
	 void searchByAuthor(String author) {                                // method
		 for (Book book : list)                                  // for loop
			 if (book.author.contains(author))
				 System.out.println("RESULT FOUND \n" +"BookId: " + book.bookID +" Title: " + book.title + 
						 " AUTHOR : " + book.author + " category " + book.category + " PRICE : " + book.price + "\n");
	 }
	     
	 void displayAll() {                                         // method displayAll(0)
		 System.out.println(list);                          // print list
		 for (Book book : list)
			 System.out.println("RESULT FOUND \n" +"BookId: " + book.bookID +" Title: " + book.title + 
					 " AUTHOR : " + book.author + " category " + book.category + " PRICE : " + book.price + "\n");
	 }
 }
public class BookUtil {                                                   // main class
	public static void main (String ...args)  throws Exception {           // main method throws exception 
		BookStore bookStore = new BookStore();                        // object create 
		bookStore.addBook(new Book("B100", "The Elegant Universe", "Brian Green", "Science", 2070.0f));
		bookStore.addBook(new Book("B101", "THE TAO of PHYSICS", "Fritjof Capra", "Science", 1550.0F));
		
		bookStore.addBook(new Book("B102", "Artifical Intelligence by Example", "Denis Rothman", "Science", 1770.0f));
		 
		bookStore.searchByTitle("The Elegant Universe");
		bookStore.searchByAuthor("Fritjof capra");
		bookStore.displayAll();   // call method
		
	}

}
