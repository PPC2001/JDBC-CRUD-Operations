package com.jsp.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelperClass {
	// Helperclass is used to load the driver and to estabilsh the connection.

	String url = "jdbc:mysql://localhost:3306/pratik_db";
	String username = "root";
	String password = "8286386524";

	Connection connection = null;

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection established sucessfully....");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;

	}
}
