<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Successful</title>
</head>
<body>
	<h1 align="center">Home Page</h1>
	<%if(request.getAttribute("msg")!=null) { %>
	<h3 align="center"><%=request.getAttribute("msg") %></h3>
	<%} %>
	<% session.setAttribute("username", request.getAttribute("user")); %>
	<h3 align="center">Welcome <%=request.getAttribute("user") %> <a href="ChangePwd.jsp">Change Password</a></h3>
</body>
</html>