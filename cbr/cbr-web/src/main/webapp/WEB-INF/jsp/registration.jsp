<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>registration</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div class="sec2">
		<form:form action="registrationsubmit" method="POST"
			modelAttribute="RegistrationDTO">
			<table>
				<caption>REGISTRATION</caption>
				<tr>
					<td>Name</td>
					<td><form:input path="name" /></td>
					<td><form:errors path="name" /></td>
				<tr>
					<td>EmailId</td>
					<td><form:input path="email" /></td>
					<td><form:errors path="email" /></td>
				</tr>
				<tr>
					<td>UserName</td>
					<td><form:input path="userName" /></td>
					<td><form:errors path="userName" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input path="password" /></td>
					<td><form:errors path="password" /></td>
				</tr>
		 	
				<tr>
					<td><input type="submit" name="rg" value="Register"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>