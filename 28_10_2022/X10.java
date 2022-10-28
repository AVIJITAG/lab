/*Take two numbers x and y. Throw the exception if the two numbers are negative else
  print the product of x and y */
  
package Hack;
import java.util.Scanner;                                          // scanner class import


class MyOwnExampleException extends Exception
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	MyOwnExampleException(String s)
    {
        super(s);
    }
}
class X10
{
    static private String posInteger(String input) throws MyOwnExampleException 
    {
        if (Integer.valueOf(input) >= 0)
            {
                return input;
            }
        else 
            {
                throw new MyOwnExampleException("Error, number can't be negative.");
            }
    }
    public static void main(String[] args)
    {
       String h;
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
       try
       {
           h=X10.posInteger(s);
       }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
           return;
       }
       System.out.println(h);
    }
}