package Lab_17_11_2022;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


class InvalidBookException extends Exception {
	InvalidBookException(String msg){
		super(msg);
	}
}

class Book {
	String bookID, title, author, category; Float price;
	public Book(String bookID, String title, String author, String category, Float price) throws
	Exception {
		this.bookID = bookID; this.title = title; this.author = author; this.category = category; this.price = price;
		if ((!Objects.equals(category,"Science")&& !Objects.equals(category,"Fiction")&& !Objects.equals(category,"Technology") && 
				!Objects.equals(category, "Others")) || (price < 0) || (bookID.charAt(0)!= 'B') || (bookID.length() !=4))
			throw new InvalidBookException("");
	}
}

 class BookStore {
	 List<Book> list = new ArrayList<>();
	 void addBook(Book b) { list.add(b); }
	 public void searchByTitle(String title) {
		 for (Book book : list)
			 if (book.title.contains(title))
				 System.out.println("RESULT FOUND \n" +"BookId: " + book.bookID +" Title: " + book.title + 
						 " AUTHOR : " + book.author + " category " + book.category + " PRICE : " + book.price + "\n");
	 }
	  
	 void searchByAuthor(String author) {
		 for (Book book : list)
			 if (book.author.contains(author))
				 System.out.println("RESULT FOUND \n" +"BookId: " + book.bookID +" Title: " + book.title + 
						 " AUTHOR : " + book.author + " category " + book.category + " PRICE : " + book.price + "\n");
	 }
	     
	 void displayAll() {
		 System.out.println(list);
		 for (Book book : list)
			 System.out.println("RESULT FOUND \n" +"BookId: " + book.bookID +" Title: " + book.title + 
					 " AUTHOR : " + book.author + " category " + book.category + " PRICE : " + book.price + "\n");
	 }
 }
public class BookUtil {
	public static void main (String ...args)  throws Exception {
		BookStore bookStore = new BookStore();
		bookStore.addBook(new Book("B100", "The Elegant Universe", "Brian Green", "Science", 2070.0f));
		bookStore.addBook(new Book("B101", "THE TAO of PHYSICS", "Fritjof Capra", "Science", 1550.0F));
		
		bookStore.addBook(new Book("B102", "Artifical Intelligence by Example", "Denis Rothman", "Science", 1770.0f));
		 
		bookStore.searchByTitle("The Elegant Universe");
		bookStore.searchByAuthor("Fritjof capra");
		bookStore.displayAll();
		
	}

}
