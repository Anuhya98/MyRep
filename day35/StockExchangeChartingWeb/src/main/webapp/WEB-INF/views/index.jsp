<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>Hello World!</h2>
<hr>
${message }
<hr>
<%-- <ol>
<c:forEach var="name" items="${list }">
	
		<li>${name }</li>
	
</c:forEach>
</ol> --%>

<table border="1">
	<tr>
		<th>Id</th>
		<th>Email</th>
		<th>User name</th>
		<th>Phone</th>
		<th>Password</th>
		<th>Confirm Password</th>
	</tr>
	<c:forEach name="user" items="${list }">
		<tr>
			<td>${user.id }</td>
			<td>${user.email }</td>
			<td>${user.username }</td>
			<td>${user.phoneno }</td>
			<td>${user.password }</td>
			<td>${user.confirmpassword }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>
