
// Write a Java program to insert the specified element at the front of a linked lis

package Lab_17_11_2022;

import java.util.LinkedList;

public class Insert_LinkedList_example {                                                                        // class create
       
	         public static void main(String[] args) {                                                           // main method 
	                                                                                                           // create an empty linked list
	     LinkedList<String> l_list = new LinkedList<String>();
	                                                                                                          // use add() method to add values in the linked list
	          l_list.add("AVI");
	          l_list.add("JIT");
	          l_list.add("GARAI");
	     System.out.println("Original linked list:" + l_list);    
	                                                                                                          // Add an element to front of LinkedList
	     l_list.offerFirst("Mr");
	     System.out.println("Insert the linked list:" + l_list);  
	 }	
	}


