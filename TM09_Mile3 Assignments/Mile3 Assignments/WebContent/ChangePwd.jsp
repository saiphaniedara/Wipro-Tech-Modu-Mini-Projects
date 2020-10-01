<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>
</head>
<body>
	<h1 align="center">Change Password Details</h1>
	<%if(request.getAttribute("msg")!=null) { %>
	<h3 align="center"><%=request.getAttribute("msg") %></h3>
	<%} %>
	<form action="ChangePwdServlet" method="post" onsubmit="return validate()">
	<table align="center">
		<tr>
			<td>
				<label for="oldpwd">Old Password: </label>
			</td>
			<td>
				<input type="password" name="oldpwd" id="oldpwd">
			</td>
		</tr>
		<tr>
			<td>
				<label for="newpwd">New Password: </label>
			</td>
			<td>
				<input type="password" name="newpwd" id="newpwd">
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
				<input type="submit" value="Change Password">
			</td>
		</tr>
	</table>
	</form>
	<script type="text/javascript">
	function validate() {
		let oldpwd = document.getElementById("oldpwd").value;
		let newpwd = document.getElementById("newpwd").value;
		let repwd = document.getElementById("repwd").value;
		let pwdValid = false;
		if(oldpwd.length>=6 && newpwd===repwd) {
		let verPwd = /((?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])).{6,}/;
		pwdValid = verPwd.test(newpwd);
		}
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