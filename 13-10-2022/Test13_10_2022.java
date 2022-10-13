//    Write a Java program to find sequences of
//    lowercase letters joined with a underscore.


package LAB13_10_2022;
public class Test13_10_2022 {                            // create class
	
	
	 
	   public static void main(String[] args) {          // main method 
		   
		    System.out.println(validate("java_exercises"));          // print declare 
			System.out.println(validate("Java_exercises"));
			System.out.println(validate("java_Exercises"));		
			System.out.println(validate("Java_Exercises"));	
	        }

	   public static String validate(String text) {
		   if (text.matches("^[a-z]+_[a-z]+"))                  // conditional statement 
	                return "Found a match!";
	       else
	                return "Not matched!";
	   }
	}


