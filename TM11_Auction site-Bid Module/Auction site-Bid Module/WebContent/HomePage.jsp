<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<style type="text/css">
.txt {
text-align: right;
}
</style>
</head>
<body bgcolor="#ffe0b3">
<h1 align="center">Welcome to AP Auctions. Please Enter Bid.</h1>
<h2 id="warning" align="center"></h2>
<form onsubmit="return validate()" action="ProcessServlet" method="post" >
<table align="center">
<tr>
	<td class="txt">
	<span id="1"></span>
	<label for="item_id">Item Id:</label>
	</td>
	<td>
	<input type="text" name="item_id" id="id">
	</td>
</tr>
<tr>
	<td class="txt">
	<span id="2"></span>
	<label for="item_name">Item Name:</label>
	</td>
	<td>
	<input type="text" name="item_name" id="itnm">
	</td>
</tr>
<tr>
	<td class="txt">
	<span id="3"></span>
	<label for="name">Your Name:</label>
	</td>
	<td>
	<input type="text" name="name" id="name">
	</td>
</tr>
<tr>
	<td class="txt">
	<span id="4"></span>
	<label for="email">Your Email Address:</label>
	</td>
	<td>
	<input type="email" name="email" id="email">
	</td>
</tr>
<tr>
	<td class="txt">
	<span id="5"></span>
	<label for="bid_amount">Amount Bid:</label>
	</td>
	<td>
	<input type="number" name="bid_amount" id="amount">
	</td>
</tr>
<tr>
	<td class="txt">
	<label for="cbox">Auto-increment bid to match other bidders?:</label>
	</td>
	<td>
	<input type="checkbox" name="cbox" value="yes">
	</td>
</tr>
<tr>
	<td colspan="2" align="center">
	<input type="submit" value="Submit Bid">
	</td>
</tr> 
</table>
</form>
<script type="text/javascript">
console.log("Hello");
	function validate() {
		console.log("adcf");
		let valid = true;
		let itemId = document.getElementById("id").value;
		console.log("abc"+itemId);
		let itemName = document.getElementById("itnm").value;
		let name = document.getElementById("name").value;
		let mail = document.getElementById("email").value;
		let bidAmount = document.getElementById("amount").value;
		if(itemId == "" || itemName == "" || name == "" || mail =="" || bidAmout == "") {
			valid = false;
			document.getElementById("warning").innerHTML = '<span style ="color:red;">Required Field Missing!</span> Enter and Resubmit';
			if(itemId == "") {
				document.getElementById("1").innerHTML = '<span style="color:red; font-weight:bold;">Required Field! </span>';
			}
			if(itemName == "") {
				document.getElementById("2").innerHTML = '<span style="color:red; font-weight:bold;">Required Field! </span>';
			}
			if(name == "") {
				document.getElementById("3").innerHTML = '<span style="color:red; font-weight:bold;">Required Field! </span>';
			}
			if(mail == "") {
				document.getElementById("4").innerHTML = '<span style="color:red; font-weight:bold;">Required Field! </span>';
			}
			if(bidAmount == "") {
				document.getElementById("5").innerHTML = '<span style="color:red; font-weight:bold;">Required Field! </span>';
			}
		}
		return valid;
	}
</script>
</body>
</html>