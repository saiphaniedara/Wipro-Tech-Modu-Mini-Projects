<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<h1 align="center">Welcome to Registration Page</h1>
	<form action="RegisterUser" method="post" onsubmit="return validate()">
	<table align="center">
		<tr>
			<td><label for="uname">Username: </label></td>
			<td><input type="text" id="uname" name="uname" required></td>
		</tr>
		<tr>
			<td><label for="pwd">Password: </label></td>
			<td><input type="password" id="pwd" name="pwd" required></td>
		</tr>
		<tr>
			<td><label for="empno">Employee Number: </label></td>
			<td><input type="text" id="empno" name="empno" required></td>
		</tr>
		<tr>
			<td><label for="email">Email Id: </label></td>
			<td><input type="email" id="email" name="email" required></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="Register"></td>
		</tr>
		</table>
	</form>
	<table align="center">
		<tr>
			<td><a href="/CRUDOperation/"><button>Go Back To Home Page</button></a></td>
		</tr>
	</table>
	<script>
		function validate() {
			let uname = document.getElementById("uname").value;
			let pwd = document.getElementById("pwd").value;
			let empNo = document.getElementById("empno").value;
			let empid = /[a-zA-Z]{1}[0-9]{4}/;
			let formValid = true;
			console.log(uname+" "+pwd+" "+empNo);
			if(uname.length<6) {
				formValid = false;
				alert("Username should be of atleast 6 characters");
			}
			else if(pwd.length!=6) {
				console.log("ab");
				formValid = false;
				alert("Password should be exactly of 6 characters")
			}
			else if(!empid.test(empNo) || empNo.length!=5) {
				console.log("ab");
				formValid = false;
				alert("Employee Id should have a single alphabet followed by exactly 4 digits");
			}
			return formValid;
		}
	</script>
</body>
</html>