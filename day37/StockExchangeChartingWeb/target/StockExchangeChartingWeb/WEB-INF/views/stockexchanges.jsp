<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:url var="stockExchangeUrl" value="/stockExchange/save"></c:url>
<form:form action="${stockExchangeUrl }" modelAttribute="stockExchange">

<c:if test="${!empty stockExchange.stockExchangeName }">
	<tr>
	<td><form:label path="stockId">Id</form:label></td>
	<td><form:label path="stockId" readonly="true" disabled="true"/>
	<form:hidden path="stockId" /></td>
	
	</tr>
	</c:if>
	<table>
		<tr>
			<td><form:label path="stockExchangeName">StockExchange Name</form:label></td>
			<td><form:input path="stockExchangeName"></form:input></td>
		</tr>
		<tr>
			<td><form:label path="contactAddress">Contact Address</form:label></td>
			<td><form:input path="contactAddress"></form:input></td>
		</tr>
		<tr>
			<td><form:label path="brief">Brief Description</form:label></td>
			<td><form:input path="brief"></form:input></td>
		</tr>
		<tr>
			<td><form:label path="remarks">Remarks</form:label></td>
			<td><form:input path="remarks"></form:input></td>
		</tr>
		<tr>
			<td>
			<c:if test="${empty stockExchange.stockExchangeName }">
			<input type="submit" value="Register">
			</c:if>
			
			<c:if test="${!empty stockExchange.stockExchangeName }">
			<input type="submit" value="Update">
			</c:if>
			</td>
		</tr>
	</table>
</form:form>
<br>
	<br>
	<div>
	<h2>StockExchange details</h2>
	<table border="1">
	<tr>
		<th>Stock Id</th>
		<th>StockExchange name</th>
		<th>Contact Address</th>
		<th>Brief description</th>
		<th>Remarks</th>
		<th>Actions</th>
	</tr>
	<c:forEach var="stockexchangedemo" items="${list }">
		<tr>
			<td>${stockexchangedemo.stockId}</td>
			<td>${stockexchangedemo.stockExchangeName}</td>
			<td>${stockexchangedemo.contactAddress}</td>
			<td>${stockexchangedemo.brief }</td>
			<td>${stockexchangedemo.remarks}</td>
			<td><a href="<c:url value='/stockExchangeremove/${stockexchangedemo.stockId }'/>">Remove</a>|
				<a href="<c:url value='/stockExchangeupdate/${stockexchangedemo.stockId }'/>">Update</a>
			</td>
		</tr>
	</c:forEach>
	</table>
	</div>

</body>
</html>