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
<link rel="stylesheet" href="/WEB-INF/css/style.css">
</head>
<body>
	<div class="sec2">
		<form:form action="registrationsubmit" method="POST"
			modelAttribute="Registration">
			<table>
				<caption>REGISTRATION</caption>
				<tr>
					<td>User Type:</td>
					<td><form:select path="regType">
							<form:option value="NONE" label="--- Select ---" />
							<form:options items="${regType}" />
						</form:select>
					</td>
				</tr>
				<tr>
					<td>Name:</td>
					<td><form:input path="regName" /></td>
					<td><form:errors path="regName" /></td>
				</tr>
				<tr>
					<td>EmailId:</td>
					<td><form:input path="regEmail" /></td>
					<td><form:errors path="regEmail" /></td>
				</tr>
				<tr>
					<td>UserName:</td>
					<td><form:input path="userName" /></td>
					<td><form:errors path="userName" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input path="userPassword" /></td>
					<td><form:errors path="userPassword" /></td>
				</tr>

				<tr>
					<td><input type="submit" name="rg" value="Register"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>