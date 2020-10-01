<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="com.wipro.bean.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display all Employees</title>
<style type="text/css">
th,td {
border: 2px solid black;
padding:2px;
}
</style>
</head>
<body>
	<h1 align="center">All Employee Details</h1>
	<%if(request.getAttribute("msg")!=null) { %>
	<h2 align="center"><%=request.getAttribute("msg") %></h2>
	<%} 
	else {
	Object o = request.getAttribute("employeeList");
	List<Employee> l = (List<Employee>)o;%>
	<table align="center">
	<tr>
		<th>Name</th>
		<th>ID</th>
		<th>Gender</th>
		<th>Designation</th>
		<th>Salary</th>
		<th>City</th>
		<th>Email ID</th>
		<th>Mobile No</th>
	</tr>
	<%
	for(Employee e: l) {
	%>
	<tr>
		<td><%=e.getName() %></td>
		<td><%=e.getId() %></td>
		<td><%=e.getGender() %></td>
		<td><%=e.getDesignation() %></td>
		<td><%=e.getSalary() %></td>
		<td><%=e.getCity() %></td>
		<td><%=e.getEmailId() %></td>
		<td><%=e.getMobno() %></td>
	</tr>
	<%
	}
	}
	%>
	</table>
	<table align="center">
	<tr>
			<td align="center">
				<a href="HomePage.jsp">Go back to Home Page</a>
			</td>
		</tr>
	</table>
</body>
</html>