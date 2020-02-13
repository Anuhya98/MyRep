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
	<c:url var="companyUrl" value="/company/save"></c:url>
<form:form action="${companyUrl }" modelAttribute="company">
	<table>
	<c:if test="${!empty company.companyName }">
	<tr>
	<td><form:label path="idNumber">Id</form:label></td>
	<td><form:label path="idNumber" readonly="true" disabled="true"/>
	<form:hidden path="idNumber" /></td>
	
	</tr>
	</c:if>
		<tr>
			<td><form:label path="companyName">Company Name</form:label></td>
			<td><form:input path="companyName"></form:input></td>
		</tr>
		<tr>
			<td><form:label path="ceoName">Company CEO</form:label></td>
			<td><form:input path="ceoName"></form:input></td>
		</tr>
		<tr>
			<td><form:label path="briefDescription">Brief Description</form:label></td>
			<td><form:input path="briefDescription"></form:input></td>
		</tr>
		<tr>
			<td><form:label path="boardMember">Board member</form:label></td>
			<td><form:input path="boardMember"></form:input></td>
		</tr>
		<tr>
			<td>
			<c:if test="${empty company.companyName }">
			<input type="submit" value="Register">
			</c:if>
			
			<c:if test="${!empty company.companyName }">
			<input type="submit" value="Update">
			</c:if>
			</td>
		</tr>
	</table>
	</form:form>
	<br>
	<br>
	<div>
	<h2>Company details</h2>
	<table border="1">
	<tr>
		<th>Company Id</th>
		<th>Company name</th>
		<th>Board Member</th>
		<th>CEO Name</th>
		<th>Brief description</th>
		
		<th>Turn over</th>
		<th>Actions</th>
	</tr>
	<c:forEach var="companydemo" items="${list }">
		<tr>
			<td>${companydemo.idNumber }</td>
			<td>${companydemo.companyName }</td>
			<td>${companydemo.boardMember }</td>
			<td>${companydemo.ceoName}</td>
			<td>${companydemo.briefDescription }</td>
			<td>${companydemo.turnOver }</td>
			<td><a href="<c:url value='/companyremove/${companydemo.idNumber }'/>">Remove</a>|
				<a href="<c:url value='/companyupdate/${companydemo.idNumber }'/>">Update</a>
			</td>
		</tr>
	</c:forEach>
	</table>
	</div>
</body>
</html>