<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <table border="1">
	<tr>
		<th>Company Id</th>
		<th>Company name</th>
		<th>Board Member</th>
		<th>CEO Name</th>
		<th>Brief description</th>
		<th>IPO date</th>
		<th>Turn over</th>
	</tr>
	<c:forEach var="companydemo" items="${list }">
		<tr>
			<td>${companydemo.idNumber }</td>
			<td>${companydemo.companyName }</td>
			<td>${companydemo.boardMember }</td>
			<td>${companydemo.ceoName}</td>
			<td>${companydemo.briefDescription }</td>
			<td>${companydemo.ipoDate}</td>
			<td>${companydemo.turnOver }</td>
		</tr>
	</c:forEach>
	</table>
 --%></body>
</html>