<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>add book</h4>
	<form action="AddBookServlet">
		name:<input type="text" name="name" required autofocus><br/>
		price:<input type="number" name="price" required><br/>
		publishedDate:<input type="date" name="published_date" required ><br/> 


		<button type="submit">create book</button>

	</form>
</body>
</html>