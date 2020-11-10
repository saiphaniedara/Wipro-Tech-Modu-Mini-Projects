<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Menu</title>
<style>
	li {
		padding: 5px;
	}
</style>
</head>
<body>
	<h1 align="center">Welcome to Menu Page</h1>
	<h3 align="center">${msg}</h3>
	<form method="post">
	<ul>
		<li><input type="submit" value="Add Employee" formaction="addEmployee"></li>
		<li><input type="submit" value="Delete Employee" formaction="deleteEmployee"></li>
		<li><input type="submit" value="Update Employee" formaction="updateEmployee"></li>
		<li><input type="submit" value="Search Employee" formaction="searchEmployee"></li>
		<li><input type="submit" value="Display All Employees" formaction="displayAllEmployees"></li>
	</ul>
	</form>
</body>
</html>