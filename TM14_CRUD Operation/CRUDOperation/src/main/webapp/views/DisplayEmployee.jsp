<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
<style>
	table,th,td {
		border: 2px solid black;
		padding: 5px;
	}
</style>
</head>
<body>
	<h1 align="center">Employee Details</h1>
	<table align="center">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Gender</th>
			<th>Designation</th>
			<th>Salary</th>
			<th>City</th>
			<th>Email Id</th>
			<th>Mobile No</th>
		</tr>
		<tr>
			<td>${emp.getId()}</td>
			<td>${emp.getName()}</td>
			<td>${emp.getGender()}</td>
			<td>${emp.getDesignation()}</td>
			<td>${emp.getSalary()}</td>
			<td>${emp.getCity()}</td>
			<td>${emp.getEmailId()}</td>
			<td>${emp.getMobNo()}</td>
		</tr>
	</table>
</body>
</html>