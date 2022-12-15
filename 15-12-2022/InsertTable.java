package HelperClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



public class InsertTable {
	
	Scanner sc = new Scanner(System.in);
	int RegistrationID ,PhoneNo,e_salary,Yearof_Passing12th ;
	String S_Name, Address,Course_Dept;
	double Marks_10th,Marks_12th;

       //saving employee details in database
		public void saveMenuDriven()throws SQLException{
	    	System.out.println("Enter RegistrationID  :");
	    	RegistrationID =sc.nextInt();
	    	System.out.println("enter S_Name :");
	    	S_Name=sc.next();
	    	System.out.println("Enter Address :");
	    	Address=sc.next();
	    	System.out.println("enter PhoneNo:");
	    	PhoneNo=sc.nextInt();
	    	System.out.println("Enter Course_Dept :");
	    	Course_Dept=sc.next();
	    	System.out.println("Enter Marks_10th :");
	    	Marks_10th=sc.nextDouble();
	    	System.out.println("Enter Marks_12th :");
	    	Marks_12th=sc.nextDouble();
	    	System.out.println("Enter Yearof_Passing12th :");
	    	Yearof_Passing12th=sc.nextInt();
	    	
	    	System.out.println("DONE");
	    	
	    	Connection conn=Helper.con();
	    	
	     	PreparedStatement stmt=conn.prepareStatement("insert into Admission_Details(?,?,?,?,?,?,?,?)");
	    	stmt.setInt(1, RegistrationID);
	    	stmt.setString(2, S_Name);
	    	stmt.setString(3, Address);
	    	stmt.setInt(4, PhoneNo);
	    	stmt.setString(5, Course_Dept );
	    	stmt.setDouble(6, Marks_10th);
	    	stmt.setDouble(7, Marks_12th);
	    	stmt.setInt(8, Yearof_Passing12th );
	    	
	    	stmt.executeUpdate();
	    	ResultSet rs=stmt.executeQuery("select * Admission_Details");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)
				+" "+rs.getDouble(6)+" "+rs.getDouble(7)+" "+rs.getInt(8));		
			}	
		
	}

}
