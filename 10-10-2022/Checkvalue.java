//  Write a Java program to test if an array contains a specific value.


package Lab10;

public class Checkvalue {                                            // create class
	
		  public static void main(String[] args) {           // main method

		    int[] num = {1789, 2035 ,1899 ,1456, 2013};
		    int toFind = 2013;
		    boolean found = false;

		    for (int n : num) {                           // for loop 
		      if (n == toFind) {
		        found = true;
		        break;
		      } 
		    }
		    
		    if(found)                                   // if statement 
		      System.out.println(toFind + "  true");
		    else
		      System.out.println(toFind + " false ");
		  }
		}

