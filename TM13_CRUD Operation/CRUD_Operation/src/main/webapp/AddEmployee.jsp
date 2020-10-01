<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
<style type="text/css">
td {
padding:5px;
}
</style>
</head>
<body>
	<h3 align="center">Enter Employee Details to Add Employee</h3>
	<form action="AddEmployeeServlet" method="post">
		<table align="center">
			<tr>
				<td>
					<label for="name">Name: </label>
				</td>
				<td>
					<input type="text" name="name" required>
				</td>
			</tr>
			<tr>
				<td>
					<label for="id">ID: </label>
				</td>
				<td>
					<input type="number" name="id" required>
				</td>
			</tr>
			<tr>
				<td>
					<label>Gender: </label>
				</td>
				<td>
					<input type="radio" name="gender" value="Male" checked>
					<label>Male</label>
					<input type="radio" name="gender" value="Female">
					<label>Female</label>
				</td>
			</tr>
			<tr>
				<td>
					<label for="designation">Designation: </label>
				</td>
				<td>
					<input type="text" name="designation" required>
				</td>
			</tr>
			<tr>
				<td>
					<label for="salary">Salary: </label>
				</td>
				<td>
					<input type="number" name="salary" required>
				</td>
			</tr>
			<tr>
				<td>
					<label for="city">City: </label>
				</td>
				<td>
					<input type="text" name="city" required>
				</td>
			</tr>
			<tr>
				<td>
					<label for="emailId">Email ID: </label>
				</td>
				<td>
					<input type="email" name="emailId" required>
				</td>
			</tr>
			<tr>
				<td>
					<label for="mobno">Mobile Number: </label>
				</td>
				<td>
					<input type="tel" name="mobno" required>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="Add Employee">
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<a href="HomePage.jsp">Go back to Home Page</a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>