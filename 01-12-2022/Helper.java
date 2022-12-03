package Lab_1_12_2022;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Helper {

	
// register mysql driver
	
            static {	
            	try {
            		Class.forName("com.mysql.cj.jdbc.Driver");
            	}  catch (Exception e) {
            		e.printStackTrace();
            	}
            }
            
// Connection Mysql driver
            
            public static Connection con() throws SQLException{
            	return DriverManager.getConnection("jdbc:mysql://localhost:3306/class","root","root*#");
            }
}
