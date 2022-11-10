package LAB_10_11_2022;

//Java Program to Write into a File
//using FileOutputStream Class

//Importing java input output classes
import java.io.FileOutputStream;
import java.io.IOException;

public class Input_File  {

	                                                                              // Main driver method
	public static void main(String[] args)
	{

		                                                                         // Assign the file content
		String fileContent = "Welcome to geeksforgeeks";
		FileOutputStream outputStream = null;

		                                                                        // Try block to check if exception occurs
		try {

			                                                                  // Step 1: Create an object of FileOutputStream
			outputStream = new FileOutputStream("C://Text.txt");

			// Step 2: Store byte content from string
			byte[] strToBytes = fileContent.getBytes();

			// Step 3: Write into the file
			outputStream.write(strToBytes);

			// Print the success message (Optional)
			System.out.print(
				"File is created successfully with the content.");
		}

		// Catch block to handle the exception
		catch (IOException e) {

			// Display the exception/s
			System.out.print(e.getMessage());
		}

		// finally keyword is used with in try catch block
		// and this code will always execute whether
		// exception occurred or not
		finally {

			// Step 4: Close the object
			if (outputStream != null) {

				// Note: Second try catch block ensures that
				// the file is closed even if an error
				// occurs
				try {

					// Closing the file connections
					// if no exception has occurred
					outputStream.close();
				}

				catch (IOException e) {

					// Display exceptions if occurred
					System.out.print(e.getMessage());
				}
			}
		}
	}
}
