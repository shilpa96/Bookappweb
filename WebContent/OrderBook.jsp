<%@page import="com.shilpa.order.Order"%>
<%@page import="java.util.List"%>
<%@page import="com.shilpa.orderdao.OrderDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ordered List</title>
</head>
<body><h3>list of books</h3>
	<%
		OrderDAO orderdao = new OrderDAO();
		List<Order> orderList = orderdao.login();
		//out.println("books:" + bookList);
	%>
	<table border="1">
		<thead>
			<tr>
				<th>userid</th>
				<th>bookid</th>
				<th>status</th>
				<th>quantity</th>
				<th>orderdate</th>
			</tr>
		</thead>
		
	<%
		for (Order o : orderList) {
			out.println("<tr>");
			out.println("<td>" + o.getUsersId()+ "</td>");
			out.println("<td>" + o.getBookId()+ "</td>");
			out.println("<td>" + o.getStatus()+ "</td>");
			out.println("<td>" + o.getQuantity()+ "</td>");
			out.println("<td>" + o.getOrderDate()+ "</td>");
			out.println("</tr>");
		}
	%>

</body>
</html>