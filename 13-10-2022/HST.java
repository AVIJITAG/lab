
/*  Write a class called MyRegex which will contain a string pattern. 
You need to write a regular expression and assign it to the pattern
such that it can be used to validate an IP address.    */


package LAB13_10_2022;
import java.util.Scanner;                                  // import scanner class

class HST{                                               // create class
	 public static void main(String[] args){             // main method
	        Scanner in = new Scanner(System.in);         // scanner object   
	        while(in.hasNext()){
	            String IP = in.next();                                // IP scanner object create 
	            System.out.println(IP.matches(new AGO().pattern));           // print statement 
	        }

	    }
	}

	
	class AGO {                                                         // another class 
	    String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
	    String pattern = num + "." +  num + "." +  num + "." + num;
	
}

   