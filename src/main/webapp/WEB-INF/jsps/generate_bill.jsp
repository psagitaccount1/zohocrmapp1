<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create lead</title>
</head>
<body>
	<h2>Lead | Create</h2>
	<form action="generateBill" method="post">
		<pre>
			First Name<input type="text" name="firstName"/>
			Last Name<input type="text" name="lastName"/>
			Email<input type="email" name="email"/>
			Mobile<input type="text" name="mobile"/>
			Product<input type="text" name="product"/>
			Amount<input type="text" name="amount"/>
			<input type="submit" value="generate bill"/>
		</pre>
	</form>
</body>
</html>