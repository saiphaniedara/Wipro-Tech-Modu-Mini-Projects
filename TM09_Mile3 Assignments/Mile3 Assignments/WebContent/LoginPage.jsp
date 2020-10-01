<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h1 align="center">Login Page</h1>
	<%if(request.getAttribute("msg")!=null) { %>
	<h3 align="center"><%=request.getAttribute("msg") %></h3>
	<%} %>
	<form action="LoginServlet" method="post" onsubmit="return validate()">
	<table align="center">
	<tr>
		<td>
			<label for="username">Enter UserName: </label>
		</td>
		<td>
			<input type="text" name="username" id="uname">
		</td>
	</tr>
	<tr>
		<td>
			<label for="password">Enter Password: </label>
		</td>
		<td>
			<input type="password" name="password" id="pwd">
		</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="Login">
			</td>
		<tr>
		<tr>
			<td colspan="2" align="center">
				<a href="RegisterPage.jsp">New User</a>
			</td>
		</tr>	
	</table>
	</form>
	<script type="text/javascript">
		function validate() {
			let pwd = document.getElementById("pwd").value;
			let verPwd = /((?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])).{6,}/;
			let pwdValid = verPwd.test(pwd);
			if(!pwdValid) {
				alert("Password is Invalid. It must contain at least 6 characters including One Number and One Upper Case character.")
			}
			else {
				alert("Valid Password.");
			}
			return pwdValid;
		}
	</script>
</body>
</html>