<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<h1 align="center">Registration Page</h1>
	<%if(request.getAttribute("msg") != null) { %>
	<h3 align="center"><%=request.getAttribute("msg") %></h3>
	<%} %>
	<form action="RegisterServlet" method="post" onsubmit="return validate()">
	<table align="center">
		<tr>
			<td>
				<label for="uid">UserID: </label>
			</td>
			<td>
				<input type="text" name="uid" id="uid">
			</td>
		</tr>
		<tr>
			<td>
				<label for="pwd">Password: </label>
			</td>
			<td>
				<input type="password" name="pwd" id="pwd">
			</td>
		</tr>
		<tr>
			<td>
				<label for="dob">Date of Birth: </label>
			</td>
			<td>
				<input type="date" name="dob" id="dob">
			</td>
		</tr>
		<tr>
			<td>
				<label>Gender: </label>
			</td>
			<td>
				<input type="radio" name="gender" value="male" checked>
				<label>Male</label>
				<input type="radio" name="gender" value="female">
				<label>Female</label>
			</td>
		</tr>
		<tr>
			<td>
				<label for="state">State: </label>
			</td>
			<td>
				<select name="state">
					<option value="Karnataka">Karnataka</option>
					<option value="Telangana">Telangana</option>
					<option value="Maharashtra">Maharashtra</option>
					<option value="Goa">Goa</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>
				<label for="cont">Contact Number: </label>
			</td>
			<td>
				<input type="number" name="cont" id="cont">
			</td>
		</tr>
		<tr>
			<td>
				<label for="add">Address: </label>
			</td>
			<td>
				<textarea name="add" id="add"></textarea>
			</td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="Submit">
			</td>
			<td>
				<input type="reset" value="Reset">
			</td>
		</tr>
	</table>
	</form>
	<script type="text/javascript">
		function validate() {
			console.log("Hello");
			let userID = document.getElementById("uid").value;
			let pwd = document.getElementById("pwd").value;
			let dob = document.getElementById("dob").value;
			let cont = document.getElementById("cont").value;
			let password = /((?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])).{6,}/;
			let pwdValid = password.test(pwd);
			let valid = false;
			if(userID.length>=4 && userID.length<=8) {
				if(pwdValid) {
					if((new Date()).getTime()>=(new Date(dob)).getTime()) {
						if(cont.length == 10) {
							valid = true;
						}
						else {
							alert("Contact number must be of 10 digits");
						}
					}
					else {
						alert("Date of Birth must be less than today's date");
					}
				}
				else {
					alert("Password should be of at least 6 characters including One Digit and One UpperCase");
				}
			}
			else {
				alert("User Id should be of min 4 characters and max 8 characters");
			}
			if(valid) {
				alert("Form Submitted");
			}
			return valid;
		}
	</script>
</body>
</html>