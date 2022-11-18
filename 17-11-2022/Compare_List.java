
// Write a Java program to compare two array lists.

package Lab_17_11_2022;

import java.util.ArrayList;

public class Compare_List {                                                                         // class create 

	   public static void main(String[] args) {                                                     // main method
	   
		   ArrayList<String> List1 = new ArrayList<String>();                                              // 1st create array<String> list
	  
	   List1.add("Red");
	   List1.add("Green");
	   List1.add("Black");
	   List1.add("White");
	   List1.add("Pink");

	          ArrayList<String> List2 = new ArrayList<String>();                                        // 2nd create array<String> list
	         
	   List2.add("Red");
	   List2.add("Green");
	   List2.add("Black");
	   List2.add("Pink");

	                                                                                           //Storing the comparison output in ArrayList<String>
	          ArrayList<String> List3= new ArrayList<String>();
	          for (String e : List1)
	        	  List3.add(List2.contains(e) ? "Yes" : "No");
	          System.out.println(List3);
	         
	     }
	}


