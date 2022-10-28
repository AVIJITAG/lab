package Hack;

import java.util.Scanner;
class InvalidException extends ArithmeticException { 									//sub class of exception
	public InvalidException(String str) {
		super(str);
	}
}
class Sum{ 														//class with addTwoPositive method
	public int addTwoPositive(int x, int y) throws InvalidException{ 						//method addTwoPositive to calculate result
		if(x<0 && y<0) {											// checking if any of the input is negative
			throw new 
			InvalidException("java.lang.ArithmeticException: x and y both should not be negative");}
		else { 													// calculating result
		return x+y; 												// logic to return the result 
		}
	}
}
public class ProvideData { 												// class with main method
	public static void main(String[] args) throws InvalidException { 						//main method
		Sum p = new Sum(); 											// creating object of the previous class
		Scanner sc = new Scanner(System.in); 									//Scanner class
		System.out.println("Enter two integers to get the sum : "); 						//print line to ask inputs from user
		int x = sc.nextInt(); 											//storing 1st integer
		int y = sc.nextInt(); 											//storing 2nd integer
		
		//calling addTwoPositive method with user inputs
		{try{System.out.println(p.addTwoPositive(x,y));}  
		catch(InvalidException u) {
			System.out.println(u.getMessage());}
		 
		finally{System.out.println("The operation or exception handling is executed succesfully");}} 		//finally block executed	
	}
}