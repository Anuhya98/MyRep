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
<c:url var="userUrl" value="/user/save"></c:url>
<form:form action="${userUrl }" modelAttribute="user">
	<table>
	<c:if test="${!empty user.username }">
	<tr>
	<td><form:label path="id">Id</form:label></td>
	<td><form:label path="id" readonly="true" disabled="true"/>
	<form:hidden path="id" /></td>
	</tr>
	</c:if>
		<tr>
			<td><form:label path="username">Username</form:label></td>
			<td><form:input path="username"></form:input></td>
		</tr>
		<tr>
			<td><form:label path="password">Password</form:label></td>
			<td><form:input path="password"></form:input></td>
		</tr>
		<tr>
			<td><form:label path="email">Email</form:label></td>
			<td><form:input path="email"></form:input></td>
		</tr>
		<tr>
			<td><form:label path="phoneno">Phone</form:label></td>
			<td><form:input path="phoneno"></form:input></td>
		</tr>
		<tr>
			<td>
			<c:if test="${empty user.username }">
			<input type="submit" value="Register">
			</c:if>
			
			<c:if test="${!empty user.username }">
			<input type="submit" value="Update">
			</c:if>
			</td>
		</tr>
	</table>
	</form:form>
	<br>
	<br>
	<div>
	<h2>User details</h2>
	
<table border="1">
	<tr>
		<th>Id</th>
		<th>Email</th>
		<th>User name</th>
		<th>Phone</th>
		<th>Password</th>
		<th>Confirm Password</th>
		<th>Actions</th>
	</tr>
	<c:forEach var="userdemo" items="${list }">
		<tr>
			<td>${userdemo.id }</td>
			<td>${userdemo.email }</td>
			<td>${userdemo.username }</td>
			<td>${userdemo.phoneno }</td>
			<td>${userdemo.password }</td>
			<td>${userdemo.confirmpassword }</td>
			<td><a href="<c:url value='/remove/${userdemo.id }'/>">Remove</a>|
				<a href="<c:url value='/update/${userdemo.id }'/>">Update</a></td>
		</tr>
	</c:forEach>
</table>
</div>
</body>
</html>