package HelperClass;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class UpdateTable {

	Scanner sc = new Scanner(System.in);
	//updating employee details in database
    public void updateMenuDriven()throws SQLException{
    	Connection conn=Helper.con();
		Statement stmt=conn.createStatement(); 
		System.out.println("enter employee S_Name : ");
		String S_Name=sc.nextLine();
		System.out.println("enter employee Address: ");
		String Address=sc.next();
		stmt.executeUpdate("update Admission_Details set S_Name='"+S_Name+"' where Address="+Address);
		ResultSet rs=stmt.executeQuery("select * from Admission_Details");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)
			+" "+rs.getDouble(6)+" "+rs.getDouble(7)+" "+rs.getInt(8));				
		}	
    }
	

	public void deleteMenuDriven() throws SQLException{
		Connection conn = Helper.con();
		Statement stmt = conn.createStatement();
		System.out.println("Enter RegistrationID : ");
		int RegistrationID = sc.nextInt();
		stmt.executeUpdate("delete from Admission_Details where RegistrationID="+RegistrationID);	
		ResultSet rs=stmt.executeQuery("select * from Admission_Details");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)
			+" "+rs.getDouble(6)+" "+rs.getDouble(7)+" "+rs.getInt(8));		
		}	
	
	}

}
