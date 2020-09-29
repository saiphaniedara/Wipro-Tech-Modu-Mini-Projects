<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
<style>
body {
background-color: hotpink;
}
h1 {
color: darkblue;
}
td {
padding: 5px;
}
</style>
</head>
<body>
	<h1 align="center">Registration Page</h1>
	<% if(request.getAttribute("msg")!=null) { %>
	<h3 align="center"><%=request.getAttribute("msg") %></h3>
	<%} %>
	<h3 align="center" id="war"></h3>
	<form action="RegisterServlet" method="post" onsubmit="return validate()">
	<table align="center">
		<tr>
			<td>
				<label for="username">Username: </label>
			</td>
			<td>
				<input type="text" name="username">
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
			<td>
				<label for="repwd">Retype Password: </label>
			</td>
			<td>
				<input type="password" name="repwd" id="repwd">
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="Add User">
			</td>
		</tr>
	</table>
	</form>
	<script type="text/javascript">
		function validate() {
			let pwd = document.getElementById("pwd").value;
			let repwd = document.getElementById("repwd").value;
			let valid = false;
			if(pwd === repwd) {
				valid = true;
			}
			else {
				document.getElementById("war").innerHTML = '<span style="color:red;">Password and Retype Password must be same</span>';
			}
			return valid;
		}
	</script>
</body>
</html>