package Lab_1_12_2022;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;


public class Employee_Uploader {
	   Scanner sc = new Scanner(System.in);
	  
// saving department details ------
	   
	   public void storeDepartmentDetails() throws SQLException {
		   
		   System.out.println("Enter Department ID: ");
		   int Department_ID=sc.nextInt();
		   
		   System.out.println("Enter Department Name: ");
		   String Department_Name=sc.next();
		   
		   System.out.println("Enter Department Head: ");
		   String Department_Head=sc.next();
		   
		   System.out.println("Enter Department Description: ");
		   String Department_Desc=sc.next();
		   
// connection to helper ------
		   
	   Connection conn=Helper.con();

// statement 
	   
	   PreparedStatement stmt =conn.prepareStatement("insert into Department values(?,?,?,?)");
	   
	   stmt.setInt(1, Department_ID);
	   stmt.setString(2, Department_Name);
	   stmt.setString(3, Department_Head);
	   stmt.setString(4, Department_Desc);
	   
	   stmt.executeUpdate();
	   
	   System.out.println("DATA inserted sucessfully*********");
	   
	}
	   
	   //   Storing EMPLOYEE Data ___________
	   
	   public void storeEmployeeDetails() throws SQLException,InvalidSalaryException {
		   
		   System.out.println("Enter Employee ID : ");
		   int Emp_ID=sc.nextInt();
		   
		   System.out.println("Enter Employee Name : ");
		   String Emp_Name=sc.next();
		   
		   System.out.println("Enter Employee Address : ");
		   String Emp_Address=sc.next();
		   
		   System.out.println("Enter Employee Salary : ");
		   double Emp_Salary=sc.nextDouble();
		   
		   System.out.println("Enter Employee Number : ");
		   long Emp_Number=sc.nextLong();
		   
		   System.out.println("Enter Department ID : ");
		   int Department_ID=sc.nextInt();
		   
	 if (Emp_Salary <1000) {
		                   throw new InvalidSalaryException("Salary can't be less then 1000 ");
  }  else   {
	                       Connection conn = Helper.con();
	                       PreparedStatement stmt = conn.prepareStatement("insert into Employee values (?,?,?,?,?,?)");
	                       
	                       
	                       stmt.setInt(1, Emp_ID);
	                       stmt.setString(2, Emp_Name);
	                       stmt.setString(3, Emp_Address);
	                       stmt.setDouble(4, Emp_Salary);
	                       stmt.setLong(5, Emp_Number);
	                       stmt.setInt(6, Department_ID);
	                       
	                       stmt.executeUpdate();
	                       
	                 System.out.println("DATA inserted Successfully");
  }
	   }
	   
// fetching data -
	   
	   public void retrieveEmployeedetails (int id) throws ID_Not_Found_Exception, SQLException {
		   
		   Connection conn=Helper.con();
		   Statement stmt=conn.createStatement();
		   
// execute query fetch data from database 
		   
	   ResultSet rs = stmt.executeQuery
("select Emp_ID,Emp_Name,Emp_Number,Emp_Address,Department_Name,Department_Head from Employee inner join Department on Employee.Department_ID=Department.Department_ID where Emp_ID= " +id);
	   
		   if (!rs.next()) {
			   throw new ID_Not_Found_Exception("Employee ID not present");
		}  else {
			
System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getLong(3)+","+rs.getString(4)+","+rs.getString(5)+","
		           +rs.getString(6));			
		}
		   
	   }
	   
// calculating PF
	   
	   public void calculate (int id) throws SQLException,ID_Not_Found_Exception {
		   double Salary = 0;
		   Connection conn = Helper.con();
		   Statement stmt = conn.createStatement();
		   ResultSet rs = stmt.executeQuery("select Emp_Salary from Employee where Emp_ID="+id);
		   
		if (!rs.next()) {
			throw new ID_Not_Found_Exception("Employee ID not Present'''''");
	}   else {
		      Salary = rs.getDouble(1);
		   if(Salary>= 1000 && Salary <=10000) { 
			     System.out.println("Employee PF amount is : "+(Salary*5)/100);
		   }else if (Salary > 10000 && Salary <= 100000) {
			      System.out.println("Employee PF amount is : "+(Salary*6)/100);
		   }else if (Salary>100000) {
			   System.out.println("Employee PF amount is : "+(Salary*7)/100);
		   }
		      
	}
	   }
}
