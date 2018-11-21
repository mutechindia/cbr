<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="base" value="${pageContext.request.contextPath}" />
<link href="${pageContext.request.contextPath}/resources/css/base.css"
	rel="stylesheet" />
</head>
<body>
	<div class="wrapper">
		<div class="header">
			<tiles:insertAttribute name="header" />
		</div>
		<div class="menu">
			<tiles:insertAttribute name="menu" />
		</div>
		<div class="wrap">
			<div class="subwrap1">
				<tiles:insertAttribute name="body" />
			</div>

			<%-- <div class="sclassebar">
			<tiles:insertAttribute name="body" />
	         	</div> --%>
		</div>
		<div class="footer">
			<tiles:insertAttribute name="footer" />
		</div>
	</div>
</body>
</html>