<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Success</title>
</head>
<body bgcolor="yellow">
	<h1 align="center" style="color: green;">Login Successful!</h1>
	<h3 align="center" style="color: darkblue;">Welcome <%=request.getAttribute("username") %></h3>
</body>
</html>