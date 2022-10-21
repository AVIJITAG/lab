 /* Problem: 1
        
        You are given a piece of Java code. */


package LAB_CLASSES_20_10_2022;
import java.util.Scanner;
import java.util.InputMismatchException;


class MyException extends Exception {    // creating myException class
	MyException(String looks) {
		super(looks);
	}
}
    public class Exception_Handling {
    	private static Object countinue;
    	
    	public static void main (String ...args) {     // main method 
    		String Str = "Avi";
    		Scanner S = new Scanner(System.in);
    		try {                                          // throw an exception 
    			 System.out.println("Enter 1st no ");
    			 int num1 = S.nextInt();                   // user input 
    			 System.out.println("Enter 2nd no ");
    			 int num2 = S.nextInt();
    			 System.out.println("THE DIVISION IS " + (num1 / num2));
    			 System.out.println(Str.charAt(4));
    			 int Array[] = {5 , 4, 8, 7, 3, 1, 2 };
    		    System.out.println(Array[9]);
    		    throw new MyException("Exception Encounter");
    		}
    		catch (ArithmeticException e) {                         // handling possible exception 
    			    System.out.println(" INVALID DIVISION ");
     		} catch(InputMismatchException ex) {
     			System.out.println("     FORMATE MISMATCH   ");
     		}  catch (StringIndexOutOfBoundsException e) {
     			System.out.println("   ARRAY INDEX IS INVALID   ");
     		} catch (Exception e) {
     			System.out.println("EXCEPTION ENCOUNTER");
     		} finally {
     			System.out.println("EXCEPTION HEANDLING COMPLETED");
     		}
    	}
    }

