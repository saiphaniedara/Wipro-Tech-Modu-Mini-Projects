<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h1 align="center">Welcome to Login Page</h1>
	<form action="VerifyLogin" method="post">
	<table align="center">
		<tr>
			<td><label for="uname">Username :</label></td>
			<td><input type="text" name="uname"></td>
		</tr>
		<tr>
			<td><label for="pwd">Password :</label></td>
			<td><input type="password" name="pwd"></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" name="Login"></td>
		</tr>
		</table>
		</form>
		<table align="center">
		<tr>
			<td><label>Don't Have an Account?</label>&nbsp;
			<a href="Register"><button>Create One</button></a></td>
		</tr>
		<tr>
			<td><a href="/CRUDOperation/"><button>Go to Home Page</button></a></td>
		</tr>
	</table>
</body>
</html>