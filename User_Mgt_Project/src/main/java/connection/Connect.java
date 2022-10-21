package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// for reducing redundancy of code
public class Connect {
	public static Connection dbConn() throws SQLException
	{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/User_Mgt_Project","root","123456");
	}
}
