package HelperClass;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class FetchTable {


	//fetching employee details in the database (display)
			public void fetchMenuDriven() throws SQLException{
				Connection conn = Helper.con();
				Statement stmt = conn.createStatement();
				ResultSet rs=stmt.executeQuery("select * from Admission_Details");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)
					+" "+rs.getDouble(6)+" "+rs.getDouble(7)+" "+rs.getInt(8));			
				}	
			}
}


