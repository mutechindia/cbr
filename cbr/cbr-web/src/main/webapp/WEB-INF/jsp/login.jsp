<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/login.css">

<div class="lang">
	<label>Language :</label> <a href="?language=en">English</a>| <a
		href="?language=fr">French</a>| <a href="?language=hi">Hindi</a>|
	Current Locale :${pageContext.response.locale}
</div>
<div class="log">
	<form:form action="loginsubmit" method="GET" modelAttribute="user">
		<table class="table1">
			<caption>
				<spring:message code="lang.login.caption" />
			</caption>
			<tr>
				<td><label> <spring:message code="lang.email" />
				</label></td>
				<td><form:input path="userEmailID" /></td>
				<td><form:errors path="userEmailID" /></td>
			</tr>
			<tr>
				<td><label><spring:message code="lang.password" /></label></td>
				<td><form:input path="userPassword" /></td>
				<td><form:errors path="userPassword" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="LOGIN" value="LOGIN" /></td>
			</tr>
		</table>
	</form:form>
</div>