<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix= "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Employees</title>
<style>
	table,th,td {
		border: 2px solid black;
		padding: 5px;
	}
</style>
</head>
<body>
	<h1 align="center">List of All the Employees</h1>
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
	<c:forEach var="emp" items="${empList}">
		<tr>
			<td><c:out value="${emp.getId()}"></c:out></td>
			<td><c:out value="${emp.getName()}"></c:out></td>
			<td><c:out value="${emp.getGender()}"></c:out></td>
			<td><c:out value="${emp.getDesignation()}"></c:out></td>
			<td><c:out value="${emp.getSalary()}"></c:out></td>
			<td><c:out value="${emp.getCity()}"></c:out></td>
			<td><c:out value="${emp.getEmailId()}"></c:out></td>
			<td><c:out value="${emp.getMobNo()}"></c:out></td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>