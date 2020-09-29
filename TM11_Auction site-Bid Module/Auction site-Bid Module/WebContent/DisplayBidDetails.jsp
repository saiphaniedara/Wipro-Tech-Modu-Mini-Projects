<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.wipro.bean.BidDetails" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submission Details</title>
<style type="text/css">
body {
background-color: #cdd408;
font-size: 20px;
}
th {
border: 2px solid white;
background-color: black;
color: white;
font-weight: bold;
}
td {
border: 2px solid white;
font-weight: bold;
}
</style>
</head>
<body>
<h1 align="center">Bid Submitted</h1>
<h4 align="center">Your bid is now active. If your bid is successful, you will be notified within 24 hours of the close of bidding.</h4>
<%
	BidDetails bd = (BidDetails)request.getAttribute("details");
%>
	<table align="center">
	<tr>
		<th>
			<%=bd.getItemName() %>
		</th>
	</tr>
	<tr>
		<td>
			Item ID: <%=bd.getItemId() %>
		</td>
	</tr>
	<tr>
		<td>
			Name: <%=bd.getName() %>
		</td>
	</tr>
	<tr>
		<td>
			Email address: <%=bd.getEmail() %>
		</td>
	</tr>
	<tr>
		<td>
			Bid price: <%=bd.getAmount() %>
		</td>
	</tr>
	<tr>
		<td>
			Auto-increment price: <%=bd.isChecked() %>
		</td>
	</tr>	
	</table>
</body>
</html>