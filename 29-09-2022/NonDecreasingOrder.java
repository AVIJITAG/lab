/* Problem 5. 

Write a Java program to find common elements from three sorted (in 
non-decreasing order) arrays */


package LabClass2909;

import java.util.ArrayList;

public class NonDecreasingOrder {                                       // class crate 
	public static void main(String[] args) {                            // main method 
		ArrayList<Integer> common = new ArrayList<Integer>();           // array object created 
	   int array1[] = {2, 77, 8};
	   int array2[] = {2, 3, 77, 8, 10, 16};
	   int array3[] = {77, 8, 14, 40};
		int x = 0, y = 0, z = 0;
		while (x < array1.length && y < array2.length && z < array3.length){             // while loops
			if (array1[x] == array2[y] && array2[y] == array3[z]){                       // if statement 
				common.add(array1[x]);
				x++;
				y++;
				z++;
			}                                                                           // conditional statement 
			else if (array1[x] < array2[y])
				x++;
			else if (array2[y] < array3[z])
				y++;
			else
				z++;
		}
		System.out.println("Common elements from three sorted (in non-decreasing order ) arrays: ");        // print statement 
	System.out.println(common);                                     // calling object
	}
	}


