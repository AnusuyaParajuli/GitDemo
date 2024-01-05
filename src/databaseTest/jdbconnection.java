package databaseTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String host = "localhost";
		String port = "3306";
		
		Connection con =DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/Qadbt", "root", "root");
		
		Statement s = con.createStatement();
		
		ResultSet rs = s.executeQuery("select * from Employeeinfo where name = 'sam';");
		
		while(rs.next());
		{
		System.out.println(rs.getString("name"));
		System.out.println(rs.getString("location"));
		}
	}

}


