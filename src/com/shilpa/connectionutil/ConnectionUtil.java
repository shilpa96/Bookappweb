package com.shilpa.connectionutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
 public static void main(String[] args) throws SQLException, ClassNotFoundException {
	Connection con = getConnection();
	System.out.println(con);
}

public static Connection getConnection() throws SQLException, ClassNotFoundException {
	Class.forName("com.mysql.jdbc.Driver"); 
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookapp","root","root");
    
	return con;
}
}
