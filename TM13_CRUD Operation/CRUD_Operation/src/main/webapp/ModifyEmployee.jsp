<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.wipro.bean.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modify Employee</title>
</head>
<body>
<%if(request.getAttribute("msg")!=null) { %>
	<h2 align="center"><%=request.getAttribute("msg") %></h2>
	<%} %>
	<h3 align="center">Enter Employee Id to modify details of the respected Employee: </h3>
	<form action="ModifyEmployeeServlet">
		<table align="center">
		<tr>
			<td>
				<label for="id">Enter Employee Id: </label>
			</td>
			<td>
				<input type="number" name="id" required>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="Show Employee">
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<a href="HomePage.jsp">Go back to Home Page</a>
			</td>
		</tr>
		</table>
	</form>
	<%if(request.getAttribute("employee")!=null) { 
	Employee e = (Employee)request.getAttribute("employee");
	%>
	<form action="ModifyEmployeeServlet" method="post">
	<table align="center">
		<tr>
				<td>
					<label>Name: </label>
				</td>
				<td>
					<input type="text" name="name" value="<%=e.getName() %>">
				</td>
			</tr>
			<tr>
				<td>
					<label>ID: </label>
				</td>
				<td>
					<input type="text" name="id" value="<%=e.getId() %>" readonly>
				</td>
			</tr>
			<tr>
				<td>
					<label>Gender: </label>
				</td>
				<td>
					<input type="text" name="gender" value="<%=e.getGender() %>" readonly>
				</td>
			</tr>
			<tr>
				<td>
					<label>Designation: </label>
				</td>
				<td>
					<input type="text" name="designation" value="<%=e.getDesignation() %>">
				</td>
			</tr>
			<tr>
				<td>
					<label>Salary: </label>
				</td>
				<td>
					<input type="number" name="salary" value="<%=e.getSalary() %>">
				</td>
			</tr>
			<tr>
				<td>
					<label>City: </label>
				</td>
				<td>
					<input type="text" name="city" value="<%=e.getCity() %>">
				</td>
			</tr>
			<tr>
				<td>
					<label>Email ID: </label>
				</td>
				<td>
					<input type="email" name="emailId" value="<%=e.getEmailId() %>">
				</td>
			</tr>
			<tr>
				<td>
					<label>Mobile Number: </label>
				</td>
				<td>
					<input type="tel" name="mobno" value="<%=e.getMobno() %>">
				</td>
			</tr>
			<tr>
				<td colspan="7" align="center" method="post">
						<input type="submit" value="Modify Employee">
				</td>
			</tr>
	</table>
	</form>
	<%} %>
</body>
</html>