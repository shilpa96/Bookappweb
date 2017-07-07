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

import com.shilpa.bookdao.BookDAO;
import com.shilpa.books.Books;

/**
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				PrintWriter out = response.getWriter();
				out.println("Register Servlet");
				//String id=request.getParameter("id");
				String name = request.getParameter("name");
				String price = request.getParameter("price");
				String publishedDate=request.getParameter("published_date");
				
				//int id1=Integer.parseInt(id);
				int p=Integer.parseInt(price);
				LocalDate date=LocalDate.parse(publishedDate);
				
		Books book=new Books();
		//book.setId( id1);
		book.setName(name);
		book.setPrice(p);
		book.setPublishedDate(date);
		out.println(book);
		BookDAO bookdao=new BookDAO();

		try {
			bookdao.register(book);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}


	}

	
