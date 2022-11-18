
//  Write a Java program to extract a portion of an array list.


package Lab_17_11_2022;

import java.util.ArrayList;
import java.util.List;

public class Extractportion_example {                                                  // create class

	    public static void main(String[] args) {                                       // main method 
	                                                                                 
	    	                                                                           // Creae a list 
	  
	  List<String> ListName = new ArrayList<String>();
	  ListName.add("Red");
	  ListName.add("Green");
	  ListName.add("Orange");
	  ListName.add("White");
	  ListName.add("Black");
	  System.out.println("Original list: " + ListName);                                 // print Original list
	  List<String> sub_List = ListName.subList(0, 3);                                   // extract of the list
	  System.out.println("final list : " + sub_List);                 // final list
	 }
	}


