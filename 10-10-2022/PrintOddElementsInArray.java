package Lab10;

//Java program to print the elements at odd positions 
 
public class PrintOddElementsInArray { 

	public static void main(String[] args) 
	{ 
		// Initialized array 
		int inputArray[] = new int[] { 1,2,3,4, 
						1000, -213, 750 }; 

		System.out.println("Existing array elements .."); 
		
		for (int i = 0; i < inputArray.length; i++) { 
			
			System.out.println(inputArray[i]); 
		} 
		
		System.out.println( 
			"Array elements at odd position.."); 
		for (int i = 0; i < inputArray.length; i++) { 
			if (i % 2 == 0) { 
				
				System.out.println(inputArray[i]); 
			} 
		} 
	} 
}
