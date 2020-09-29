<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style>
body {
background-color: cyan;
}
h2 {
color: green;
}
h3 {
color: red;
}
td {
padding: 5px;
}
</style>
</head>
<body>
	<h2 align="center">Login Page</h2>
	<% if(request.getAttribute("msg") != null) {%>
		<h3 align="center"><%=request.getAttribute("msg") %></h3>
	<%} %>
	<form action="LoginServlet" method="post">
		<table align="center">
			<tr>
				<td>
					<label for="username">UserName: </label>
				</td>
				<td>
					<input type="text" name="username" id="uname">
				</td>
			</tr>
			<tr>
				<td>
					<label for="password">Password: </label>
				</td>
				<td>
					<input type="password" name="password" id="pwd">
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="Login">
				</td>
			</tr>
			<tr>
				<td>
					<a href="RegisterUser.jsp">Register User</a>
				</td>
				<td>
					<a href="ChangePassword.jsp">Change Password</a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>