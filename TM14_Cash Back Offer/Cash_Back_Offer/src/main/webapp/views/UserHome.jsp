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
	<h1 align="center">Your Current Balance is: ${balance}</h1>
	<h2 align="center">Claim your Cash Back here</h2>
	<form action="checkCoupon" method="post">
		<input type="hidden" name="custId" value="${custId}">
		<table align="center">
			<tr>
				<td><label for="couponCode">Enter Coupon Code: </label>
				<td><input type="text" name="couponCode" required></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Claim"></td>		
		</table>
	</form>
</body>
</html>