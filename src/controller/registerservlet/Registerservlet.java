package com.shilpa.controller.registerservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shilpa.userdao.UserDAO;
import com.shilpa.users.Users;

/**
 * Servlet implementation class Registerservlet
 */
@WebServlet("/Registerservlet")
public class Registerservlet extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out = response.getWriter();
			out.println("Register Servlet");

			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
		// out.println( "Name:"+name);
			// out.println( "Email:"+email);
			 //out.println( "Password:"+password);

			Users user = new Users();

			user.setName(name);
			user.setEmail(email);
			user.setPassword(password);
			out.println(user);

			UserDAO userdao = new UserDAO();


				try {
					userdao.register(user);
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

	
		}

