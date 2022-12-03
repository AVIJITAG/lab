package Lab_1_12_2022;

import java.util.Scanner;

public class Main_EmployeeUploader {
	public static void main (String ...args) {
		Employee_Uploader emp = new Employee_Uploader();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int choice;
		int id;
		
		System.out.println("[1 --> Insert],[2 --> Retrieve],[3 --> Calculate PF]");
		choice=sc.nextInt();
		
   if (choice == 1) {	
	 try {
	   System.out.println("[Press 1 for Department],[Press 2 for Employee]");
       choice=sc.nextInt();
     if (choice == 1) {
    	 emp.storeDepartmentDetails();
     } else if(choice == 2) {
    	 emp.storeEmployeeDetails();
     }
   }  catch(InvalidSalaryException e) {
	   System.out.println(e.getMessage());
   }  catch(Exception e) {
	   System.out.println(e.getMessage());
	   }
	}  else if (choice == 2) {
		try {
			System.out.println("Enter id of the Employee : ");
			id=sc.nextInt();
			emp.retrieveEmployeedetails(id);
		} catch (ID_Not_Found_Exception e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	} else if (choice ==3) {
		 try {
			 System.out.println("Enter ID of the Employee : ");
			 id=sc.nextInt();
			 emp.calculate(id);
		 } catch (ID_Not_Found_Exception e) {
			 System.out.println(e.getMessage());
		 } catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
	}}
	}
   