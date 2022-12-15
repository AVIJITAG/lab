package HelperClass;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class FetchTable {


	//fetching students details in the database (display)
			public void fetchMenuDriven() throws SQLException{  // methods 
				Connection conn = Helper.con();  // connection create
				Statement stmt = conn.createStatement();  // statement
				ResultSet rs=stmt.executeQuery("select * from Admission_Details"); // select from Database
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)
					+" "+rs.getDouble(6)+" "+rs.getDouble(7)+" "+rs.getInt(8));		// print all data	
				}	
			}
}


