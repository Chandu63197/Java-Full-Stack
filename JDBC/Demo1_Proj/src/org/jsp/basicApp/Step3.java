package org.jsp.basicApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Step3 {
	public static void main(String[] args) {
	    Connection con=null;
	    Statement st=null;
	    try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class is loaded and Registered");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_practice?user=root&password=admin");
			System.out.println("Connection Established between the Java application and the Databse Server...!!!");
			st = con.createStatement();
			System.out.println("Platform is created...!!!");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Closed all costly resources");
		}
	}
}
