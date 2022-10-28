// a Java program to find all pairs of elements in an array whose sum is 
// equal to a specified number


package LabClass2909;
public class FindPairs {
	
	
	    public static void main(String[] args) 
	    {
	        int[] arr = new int[] {2, 7, 5, 4, 3, 9, 15};
	                                                                    //Anumber specified
	        int sum = 9;
	                                                     //calling findPairs() user defined method
	        findPairs(arr, sum);

	    }
	    
	    //findPairs() method
	    //it will find all the pairs whose sum is equal to a specified number
	    static void findPairs(int inputArray[], int sum) 
	    {
	        System.out.println("The pairs whose sum are equal to "+ sum+" are : ");
	        for (int i = 0; i < inputArray.length; i++) 
	        {
	            for (int j = i + 1; j < inputArray.length; j++) 
	            {
	                if (inputArray[i] + inputArray[j] == sum) 
	                {
	                    System.out.println(inputArray[i] + " " + inputArray[j]);
	                }
	            }
	        }
	    }
}
	       
	                
	    
	

	
	   
