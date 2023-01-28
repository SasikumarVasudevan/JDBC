package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.CommunicationException;

public class Employees {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","9791915458" );
//		String s = "Select * from studentdetails";
//		PreparedStatement prepareStatement = connection.prepareStatement(s);
//		ResultSet executeQuery = prepareStatement.executeQuery();
//		while (executeQuery.next()) {
////			String string = executeQuery.getString("first_name");
////			System.out.println(string);
//			String string2 = executeQuery.getString("sname");
//			System.out.println(string2);

		// }
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "9791915458");
		String s = "select * from StudentDetails";
		PreparedStatement prepareStatement = connection.prepareStatement(s);
		ResultSet executeQuery = prepareStatement.executeQuery();
		while (executeQuery.next()) {
			String string = executeQuery.getString("sname");
			System.out.println(string);

		}
		System.out.println("sasi");
		System.out.println("done");

	}

}
