<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.wipro.bean.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Employee</title>
</head>
<body>
	<h1 align="center">Delete Employee</h1>
	<%if(request.getAttribute("employee")==null) { %>
	<%if(request.getAttribute("msg")!=null) { %>
	<h2 align="center"><%=request.getAttribute("msg") %></h2>
	<%} %>
	<form action="DeleteEmployeeServlet" method="post">
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
	<%}
	else {
		Employee e = (Employee)request.getAttribute("employee");
		session.setAttribute("employee", e);
		%>
		<table align="center">
			<tr>
					<td>
						<label>Name: </label>
					</td>
					<td>
						<%=e.getName() %>
					</td>
				</tr>
				<tr>
					<td>
						<label>ID: </label>
					</td>
					<td>
						<%=e.getId() %>
					</td>
				</tr>
				<tr>
					<td>
						<label>Gender: </label>
					</td>
					<td>
						<%=e.getGender() %>
					</td>
				</tr>
				<tr>
					<td>
						<label>Designation: </label>
					</td>
					<td>
						<%=e.getDesignation() %>
					</td>
				</tr>
				<tr>
					<td>
						<label>Salary: </label>
					</td>
					<td>
						<%=e.getSalary() %>
					</td>
				</tr>
				<tr>
					<td>
						<label>City: </label>
					</td>
					<td>
						<%=e.getCity() %>
					</td>
				</tr>
				<tr>
					<td>
						<label>Email ID: </label>
					</td>
					<td>
						<%=e.getEmailId() %>
					</td>
				</tr>
				<tr>
					<td>
						<label>Mobile Number: </label>
					</td>
					<td>
						<%=e.getMobno() %>
					</td>
				</tr>
				<tr>
				<td colspan="7" align="center">
					<form action="DeleteEmployeeServlet">
						<input type="submit" value="Delete Employee">
					</form>
				</td>
			</tr>
			<tr>
			<td colspan="2" align="center">
				<a href="HomePage.jsp">Go back to Home Page</a>
			</td>
			</tr>
		</table>
		<%} %>
</body>
</html>