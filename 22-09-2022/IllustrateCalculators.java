// Write a java program to illustrate Calculator class with addition, subtraction, multiplication methods 
// that can take any number of parameters to perform the operation, without using method/constructor overloading.

package LAB_CLASSES;
import java.util.Scanner;
public class IllustrateCalculators {
	
	 
	 
	 public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	   
	  System.out.print("Input first number: ");
	  int num1 = in.nextInt();
	   
	  System.out.print("Input second number: ");
	  int num2 = in.nextInt();
	   
	 
	  System.out.println(num1 + " + " + num2 + " = " + 
	  (num1 + num2));
	   
	  System.out.println(num1 + " - " + num2 + " = " + 
	  (num1 - num2));
	   
	  System.out.println(num1 + " x " + num2 + " = " + 
	  (num1 * num2));
	   
	 }
	 
	}

