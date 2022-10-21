/* Problem: 2
 
   Write a program in Java to create a file in Java using Exception Handling.  */

package LAB_CLASSES_20_10_2022;
import java.io.File;
import java.io.IOException;

public class CreateFile {                           // create a class
	public static void main (String ...args) {      // main method 
		try {
			File file = new File("Avijit");        // creating file class object 
			if (file.createNewFile()) {            // checking file exist or  not
				System.out.println("File " +file.getName() + "  is create successfully.");
			} else {
				 System.out.println("FILE IS ALREADY EXIST");
			}}
			 catch(IOException exception) {     // Handling exception;-
				 System.out.println("An error is occurred");
			     exception.printStackTrace();
			 }
			}
		}
			