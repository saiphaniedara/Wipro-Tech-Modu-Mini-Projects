<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<style>
div {
margin-right:30%;
margin-left:30%;
}
h4 {
text-align:center;
}
</style>
</head>
<body>
	<h1 align="center">Home Page</h1>
	<%if(request.getAttribute("msg")!=null) { %>
	<h3 align="center"><%=request.getAttribute("msg") %></h3>
	<%} %>
	<h3 align="center">Select any option in the menu to perform its related operation</h3>
	<div>
	<h4>MENU</h4>
		<ul>
			<li><a href="AddEmployee.jsp">ADD Employee</a></li>
			<li><a href="DeleteEmployee.jsp">DELETE Employee</a></li>
			<li><a href="ModifyEmployee.jsp">MODIFY Personal Details</a></li>
			<li><a href="SelectEmployee.jsp">SELECT Employee by Id</a></li>
			<li><a href="DisplayEmployeeServlet">SELECT ALL Employee</a></li>
		</ul>
	</div>
</body>
</html>