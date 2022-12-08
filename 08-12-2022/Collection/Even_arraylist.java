/*  Problem Statement 1:
 

1.	Develop a java class with a method storeEvenNumbers(int N) using ArrayList to store even numbers from 2 to N, 
    where N is a integer which is passed as a parameter to the method storeEvenNumbers().  
    The method should return the ArrayList (A1) created. 
    
2.	In the same class create a method printEvenNumbers()which iterates through the arrayList A1 in step 1,  
    and It should multiply each number with 2 and display it in format 4,8,12….2*N. 
    and add these numbers in a new ArrayList (A2). The new ArrayList (A2) created needs to be returned.
    
3.	Create a method retrieveEvenNumber(int N)  parameter is a number N. 
    This method should search the arrayList (A1) for the existence of the number ‘N’ passed.  
    If exists it should return the Number else return zero.
    
          ***** Hint:  Use instance variable for storing the ArrayList A1 and A2.
          ***** NOTE: You can test the methods using a main method.*/


package LAB_____08_12_2022;

import java.util.ArrayList;



public class Even_arraylist {

	ArrayList<Integer> num1 = new ArrayList<Integer>();      // 1st arraylist create
	ArrayList<Integer> num2 = new ArrayList<Integer>();      // 2nd arrarylist create
  
	
	public ArrayList<Integer>   storeEvenNumbers(int N){      // 1st method to store
		for (int i = 2; i<N ; i = i+2)
			num1.add(i);                                     
		return num1;
		
	}
	public ArrayList<Integer> printEvenNumbers()  {          // 2nd array method store
		for(int i : num1)
			num2.add(i*2);
		return num2;
	}
	
	public int retrieveEvenNumbers(int N) {                    // 3rd method 
		int n = 0;
		for (int i : num1) {
			if(i==N)
				n = N;
		}
		return n;
	}
	public static void main (String ...args) {                       // main method
		Even_arraylist obj = new Even_arraylist();
		System.out.println(obj.storeEvenNumbers(25));
		System.out.println(obj.printEvenNumbers());
		System.out.println(obj.retrieveEvenNumbers(50));
		System.out.println(obj.retrieveEvenNumbers(20));
	}
}
