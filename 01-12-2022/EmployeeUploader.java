package Lab_1_12_2022;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmployeeUploader{

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 1. registering
			// 2.connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vs_studio","root","root*#");
			// 3.create statement
			java.sql.Statement stmt= con.createStatement();
			// 4.inserting data into database table
			stmt.executeUpdate("insert into Department values(1,'ACCOUNTS','RAMESH','ACCOUNTS DEPT')");
			stmt.executeUpdate("insert into Department values(2,'ADMIN','VIJAY','ADMIN DEPT')");
			stmt.executeUpdate("insert into Department values(3,'SALES','VINOD','SALES DEPT')");
			stmt.executeUpdate("insert into Department values(4,'HR','MAHESH','HR DEPT')");
			
			stmt.executeUpdate("insert into D_Employee values(087,'VIKRAM','ADRESSS1',12000,9878761,2)");
			stmt.executeUpdate("insert into D_Employee values(110,'AJAY','ADRESSS2',18000,96543763,1)");
			stmt.executeUpdate("insert into D_Employee values(098,'RAJESH','ADRESSS3',11000,99622212,4)");
			stmt.executeUpdate("insert into D_Employee values(067,'RAM','ADRESSS4',19000,80783732,3)");
			stmt.executeUpdate("insert into D_Employee values(045,'VIMAL','ADRESSS5',27000,32113221,4)");
			stmt.executeUpdate("insert into D_Employee values(987,'KIRAN','ADRESSS6',12000,78761212,2)");
			stmt.executeUpdate("insert into D_Employee values(087,'VIKRAM','ADRESSS1',21000,76337238,2)");
		
			
			System.out.println("inserted successfully.");
			// 5.closing connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
