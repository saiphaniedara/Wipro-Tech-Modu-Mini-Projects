<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Legion Bank</title>
<style>
	body {
		background-color: coral;
	}
</style>
</head>
<body>
	<h1 align="center">Enter your Login Details</h1>
	<h2 align="center">${message}</h2>
	<form action="verifyLogin" method="post">
	<table align="center">
		<tr>
			<td><label for="custId">Customer ID: </label></td>
			<td><input type="text" name="custId" required></td>
		</tr>
		<tr>
			<td><label for="password">Password: </label></td>
			<td><input type="password" name="password" required></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="Login"></td>
		</tr>
	</table>
	</form>
</body>
</html>