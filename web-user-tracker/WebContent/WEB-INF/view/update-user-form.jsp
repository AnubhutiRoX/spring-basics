<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save User</title>
</head>
<body>
	<div>
		<div>
			<h2>User Manager</h2>
		</div>
	</div>
	
	<div>
		<h3>Save User</h3>
		<form:form action="updateUser" modelAttribute="user" method="POST">
		
			<form:hidden path="id" />
			<table>
				<tbody>
					<tr>
						<td><label>Username</label></td>
						<td><form:input path="username" /></td>
					</tr>
					<tr>
						<td><label>Password</label></td>
						<td><form:input path="password" /></td>
					</tr>
					<tr>
						<td><label>Status</label></td>
						<td><form:input path="status" /></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Update" /></td>
					</tr>
				</tbody>
			</table>
		</form:form>
		
		<p>
			<a href="${pageContext.request.contextPath}/user/list">Back to List</a>
		</p>
	</div>
</body>
</html>