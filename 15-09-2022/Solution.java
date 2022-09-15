/* 1… Write the following code:

1. A class named Arithmetic with a method named add that takes integers as parameters and 
   returns an integer denoting their sum.

2. A class named Adder that inherits from a superclass named Arithmetic.


Input Format
test your submission by calling the add method on an Adder object and passing it integer parameters  */

package MyPackage;

    class Arithmetic {
}
       class Adder extends Arithmetic {
    	   public int add(int a, int b) {
    		   return a+b;
    	   }
       }
   public  class Solution  {
	   public static void main(String args[]) {
		   Adder a = new Adder();
		    
		   System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
	   }
   }