/*  Problem: 3
  
    Write a program to create custom exception in java.*/

package LAB_CLASSES_20_10_2022;
 
  class ZException extends Exception {
	   public ZException(String msg) {
		                                                 // pass the message parent class constructor -
		   super(msg);
	   } }

public class Create_Custom_Exception {                   // main class

	public static void main(String[] args) {             // main method 
		try {
			throw new ZException("My z Exception ");     // throw an object of ZException  -
		} catch (ZException ex) {
			System.out.println("ex.getMessage()");
			
			
			                                             // print the message form ZException object 
			System.out.println(ex.getMessage());
		

	}

}}
