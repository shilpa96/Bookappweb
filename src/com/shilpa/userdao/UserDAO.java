package com.shilpa.userdao;

import java.nio.charset.MalformedInputException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.shilpa.connectionutil.ConnectionUtil;
import com.shilpa.users.Users;


public class UserDAO {
	//public static void main(String[] args){

	public void register(Users user) throws ClassNotFoundException, SQLException{
Connection con=ConnectionUtil.getConnection();
String sql="insert into users2(name,email,password)values(?,?,?)";
PreparedStatement pst=con.prepareStatement(sql);
pst.setString( 1,user.getName());
pst.setString(2, user.getEmail());
pst.setString(3, user.getPassword());
int rows = pst.executeUpdate();
System.out.println(rows);
}
	public Users login(String email, String password) throws SQLException, ClassNotFoundException {
		// public static void main(String[] args) throws ClassNotFoundException,
		// SQLException {

		Connection conn = ConnectionUtil.getConnection();

		String selectQuery = "select user_id,name, email, password from users2 where email=? and password=?";
		PreparedStatement pst = conn.prepareStatement(selectQuery);
		pst.setString(1,email);
		pst.setString(2,password);
		ResultSet rs = pst.executeQuery();
		Users user = null;
		if (rs.next()) {
			System.out.println("User exists");
			int id = rs.getInt("user_id");
			String name = rs.getString("name");
			String email1 = rs.getString("email");
			String password1 = rs.getString("password");

			 user=new Users();
			user.setId(id);
			user.setName(name);
			user.setEmail(email1);
			user.setPassword(password1);
			System.out.println(user);
		}
		return user;
	

	}

		
}
