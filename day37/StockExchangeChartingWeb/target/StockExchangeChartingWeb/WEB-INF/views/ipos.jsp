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
	<c:url var="ipoUrl" value="/ipo/save"></c:url>
<form:form action="${ipoUrl }" modelAttribute="ipo">
	<table>
		<tr>
			<td><form:label path="id">Company Id</form:label></td>
			<td><form:input path="id"></form:input></td>
		</tr>
		<tr>
			<td><form:label path="companyName">Company Name</form:label></td>
			<td><form:input path="companyName"></form:input></td>
		</tr>
		<tr>
			<td><form:label path="pricepershare">Price per share</form:label></td>
			<td><form:input path="pricepershare"></form:input></td>
		</tr>
		<tr>
			<td><form:label path="stockExchange">Stock Exchange</form:label></td>
			<td><form:input path="stockExchange"></form:input></td>
		</tr>
		<tr>
			<td><form:label path="totalnoofshares">Total no of shares</form:label></td>
			<td><form:input path="totalnoofshares"></form:input></td>
		</tr>
		<tr>
			<td><form:label path="remarks">Remarks</form:label></td>
			<td><form:input path="remarks"></form:input></td>
		</tr>
		<tr>
			<td><input type="submit" value="Register"></td>
		</tr>
	</table>
	</form:form>
	<br>
	<br>
	<div>
	<h2>Ipo details</h2>
	<table border="1">
		<tr>
		<th>Company Id</th>
		<th>Company name</th>
		<th>Price per share</th>
		<th>Total no of shares</th>
		<th>Stock exchange</th>
		
		<th>Remarks</th>
		<th>Actions</th>
	</tr>
	<c:forEach var="ipodemo" items="${list }">
		<tr>
			<td>${ipodemo.id }</td>
			<td>${ipodemo.companyName }</td>
			<td>${ipodemo.pricepershare }</td>
			<td>${ipodemo.totalnoofshares}</td>
			<td>${ipodemo.stockExchange}</td>
			<td>${ipodemo.remarks}</td>
			<td><a href="<c:url value='/iporemove/${ipodemo.id }'/>">Remove</a></td>
		</tr>
	</c:forEach>
	</table>
	</div>
</body>
</html>