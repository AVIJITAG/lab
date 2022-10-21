/*   Create a class MyCalculator which consists of a single method long power(int, int). 
     This method takes two integers, n and p, as parameters and finds n^p . If either n or 
     p is negative, then the method must throw an exception which says "n or p should 
     not be negative.". Also, if both n and p are zero, then the method must throw an 
     exception which says "n and p should not be zero."
     
     Input Format
      
     Each line of the input contains two integers, n and p.                 */
                                                          
package LAB_CLASSES_20_10_2022;
import java.util.Scanner;

 class Calculator {
	                                                                       // crate power methods with all parameter.
	   public long power(int n, int p) throws Exception {
		   if (n == 0 && p == 0)                                          // checking condition statement 
			   throw new Exception(" n and p should no be Zero ");
		   else if (n<0 || p<0)
			   throw new Exception(" n or p should not be negative. ");
		   else
			    return (long)  (Math.pow(n, p));                         // Casting result in long type;
 	   }
 }

            public class My_Calculators {                               // create main  class
	           public static void main (String ...args) {              // main method
	        	   Calculator calc = new Calculator();
	        	   Scanner sc = new Scanner(System.in);
	        	   while (sc.hasNextInt()) {                         // while loop
	        		   int n = sc.nextInt();
	        		   int p = sc.nextInt();
	        		   
	        		try {
	        			System.out.println(calc.power(n,  p));
	        		} catch (Exception e) {
	        			System.out.println(e);
	        		}
 	        		   sc.close();                                      // closing scanner'
	        	   }
	           }
	           }
