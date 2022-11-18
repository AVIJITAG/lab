package Lab_17_11_2022;

import java.util.ArrayList;

public class Even_ArrayList {
	
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
		Even_ArrayList obj = new Even_ArrayList();
		System.out.println(obj.storeEvenNumbers(25));
		System.out.println(obj.printEvenNumbers());
		System.out.println(obj.retrieveEvenNumbers(15));
		System.out.println(obj.retrieveEvenNumbers(22));
	}
}
