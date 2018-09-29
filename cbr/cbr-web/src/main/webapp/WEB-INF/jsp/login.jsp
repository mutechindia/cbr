<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<style type="text/css">
.log {
	margin-top: 60px;
	margin-left: 20px;
	width: 80%;
	min-height: 100px;
}
</style>
</head>
<body>
	Language :
	<a href="?language=en">English</a>|
	<a href="?language=fr">French</a>|
	<a href="?language=hi">Hindi</a>|
	 Current Locale :${pageContext.response.locale}
	 
	 
	<div class="log">
		<form:form action="loginsubmit" method="GET" modelAttribute="UserDTO">
			<table class="table1">
				<caption><spring:message code="lang.login.caption"/></caption>
				<tr>
					<td><label> <spring:message code="lang.email"/>
					</label></td>
					<td><form:input path="email" /></td>
					<td><form:errors path="email" /></td>
				</tr>
				<tr>
					<td><label><spring:message code="lang.password"/></label></td>
					<td><form:input path="password" /></td>
					<td><form:errors path="password" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" name="LOGIN" value="LOGIN" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>