<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<div align="center">
		<h2>Spring MVC Login Form</h2>
		<table border="0" width="90%">
		<form:form action="login" commandName="userForm">
				<tr>
					<td align="left" width="20%">Login: </td>
					<td align="left" width="40%"><form:input path="login" size="30"/></td>
				</tr>
				<tr>
					<td>Password: </td>
					<td><form:password path="password" size="31"/></td>
				</tr>
				<tr>
					<td></td>
					<td align="center"><input type="submit" value="Login"/></td>
					<td></td>
				</tr>
		</form:form>
		</table>
	</div>
</body>
</html>