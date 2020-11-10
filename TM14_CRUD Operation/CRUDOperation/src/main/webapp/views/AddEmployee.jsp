<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
	<h1 align="center">Add New Employee</h1>
	<form:form action="insertEmployee" modelAttribute="emp">
		<table align="center">
			<tr>
				<td><form:label path="id">Employee Id:</form:label>
				<td><form:input path="id" readonly="true"/></td>
			</tr>
			<tr>
				<td><form:label path="name">Employee Name:</form:label>
				<td><form:input path="name"/></td>
			</tr>
			<tr>
				<td><form:label path="gender">Gender</form:label></td>
				<td><form:radiobutton path="gender" value="Male" checked="true"/>Male
				<form:radiobutton path="gender" value="Female"/>Female</td>
			</tr>
			<tr>
				<td><form:label path="designation">Designation:</form:label>
				<td><form:input path="designation"/></td>
			</tr>
			<tr>
				<td><form:label path="salary">Salary:</form:label>
				<td><form:input path="salary"/></td>
			</tr>
			<tr>
				<td><form:label path="city">City:</form:label>
				<td><form:input path="city"/></td>
			</tr>
			<tr>
				<td><form:label path="emailId">Email Id:</form:label>
				<td><form:input path="emailId"/></td>
			</tr>
			<tr>
				<td><form:label path="mobNo">Mobile Number:</form:label>
				<td><form:input path="mobNo"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><form:button>Submit</form:button></td>
			</tr>
		</table>
	</form:form>
</body>
</html>