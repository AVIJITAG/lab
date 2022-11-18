//Write a Java program to replace an element in a linked list


package Lab_17_11_2022;

import java.util.LinkedList;

public class Replaced_LinkedList_example {                                                              // class create 
	
	public static void main(String[] args) {                                                           // main method
	  
	       LinkedList<String> l = new LinkedList<String>();                                          // create LinkedList object
		      l.add(" I ");
		      l.add(" Love ");
		      l.add(" My ");
		      l.add(" Life ");
		      l.add(" $ ");
		      System.out.println("The LinkedList is: " + l);
		      l.set(2, " Human");                                                                   // replace method 
		      System.out.println("The  Replace an LinkedList is: " + l);
		   }
		}