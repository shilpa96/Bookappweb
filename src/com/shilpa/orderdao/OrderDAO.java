package com.shilpa.orderdao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.shilpa.connectionutil.ConnectionUtil;
import com.shilpa.order.Order;

public class OrderDAO {

	//public static void main(String[] args) throws ClassNotFoundException, SQLException {
	public void add(Order order) throws SQLException, ClassNotFoundException {

	
		Connection conn=ConnectionUtil.getConnection();
		LocalDate date=LocalDate.parse( "2017-10-09");
		String sql="insert into orders(users_id,book_id,status,quantity,order_date)values(?,?,?,?,?)";
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setInt(1,order.getUsersId());
		pst.setInt( 2,order.getBookId());
		pst.setString(3,order.getStatus());
		pst.setInt(4,order.getQuantity());
		pst.setDate(5,Date.valueOf(date));
		
		int row=pst.executeUpdate();
		System.out.println(row);
	}
	//public static void main(String[] args) throws ClassNotFoundException, SQLException {
	public List<Order> login() throws ClassNotFoundException, SQLException

	{
		Connection conn=ConnectionUtil.getConnection();
		String sql="select id,users_id,book_id,status,quantity,order_date from orders ";
		PreparedStatement pst = conn.prepareStatement(sql);
		List<Order>orderList=new ArrayList<Order>();
		
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			int id1 = rs.getInt("id");
			int userId = rs.getInt("users_id");
			int bookId = rs.getInt("book_id");
			String status=rs.getString("status");
			int quantity=rs.getInt( "quantity");
			Date orderDate = rs.getDate("order_date");

			Order order=new Order();
	order.setId(id1);
	order.setUsersId(userId);
	order.setBookId(bookId);
	order.setStatus(status);
	order.setQuantity(quantity);
	  order.setOrderDate(orderDate.toLocalDate());
	orderList.add(order);

		
		}
		//return bookList;
		System.out.println(orderList);
		
		return orderList;

	}


	


}
