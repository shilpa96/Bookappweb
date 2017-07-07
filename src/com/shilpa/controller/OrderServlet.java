package com.shilpa.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shilpa.order.Order;
import com.shilpa.orderdao.OrderDAO;

/**
 * Servlet implementation class OrderServlet
 */
@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			PrintWriter out = response.getWriter();
			// out.println("Register Servlet");
			String userId = request.getParameter("user_id");
			String bookId = request.getParameter("book_id");		
			String quantity = request.getParameter("quantity");
			

			int uId = Integer.parseInt(userId);
			int bId = Integer.parseInt(bookId);
			int quatity = Integer.parseInt(quantity);

			Order order = new Order();
			order.setUsersId(uId);
		order.setBookId(bId);
			order.setStatus("ORDERED");
			order.setQuantity(quatity);
			order.setOrderDate(LocalDate.now());
			out.println(order);
			
			
			OrderDAO orderdao = new OrderDAO();
			try {
				orderdao.add(order);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
