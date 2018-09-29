
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<style type="text/css">
.log ,.table1{
	margin: auto;
	width: 80%;
	min-height: 100px;
	border: 1px solid grey;
	width: 80%;
	text-align: left;
}
.product,table,tr,td,th{
	margin: auto;
	width: 80%;
	min-height: 100px;
	border: 1px solid grey;
	text-align: center;
}
</style>
</head>
<body>
	<div class="log">
		<form:form action="product" method="POST" modelAttribute="ProductDTO">
			<table class="table1">
				<caption>ENTER PRODUCT DETAIL</caption>
				<tr>
					<td>PRODUCT NAME</td>
					<td><form:input path="productName" /></td>
				</tr>
				<tr>
					<td>PRODUCT DESCRIPTION</td>
					<td><form:input path="productDec" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" name="LOGIN" value="Enter" /></td>
				</tr>
			</table>
		</form:form>
	</div>
	<div class="product" >
		<table>
			<tr>
				<th>Id</th>
				<th>Product Name</th>
				<th>Product Description</th>
			</tr>

			<c:forEach items="${key}" var="ab" >

				<tr>
					<td><c:out value="${ab.productId}"></c:out></td>
					<td><c:out value="${ab.productName}"></c:out></td>
					<td><c:out value="${ab.productDec}"></c:out></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>