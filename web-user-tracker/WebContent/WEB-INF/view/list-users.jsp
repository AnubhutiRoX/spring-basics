<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Users</title>
<link type="text/css" rel="stylesheet" href="${pageContet.request.contextPath}/resources/css/style.css" />
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>User - Manager</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
		
			<!--  put a new button for creating user -->
			<input type="button" value="Add User" onclick="window.location.href='showFormForAdd'; return false">
		
			<!-- add table -->
			<table>
				<tr>
					<th>Name</th>
					<th>Status</th>
					<th>Update</th>
				</tr>
				<!-- Loop over model users -->
				<c:forEach var="user" items="${users}">
				
					<c:url var="updateLink" value="/user/showFormForUpdate">
						<c:param name="userId" value="${user.id}"/>
					</c:url>
					
					<c:url var="deleteLink" value="/user/delete">
						<c:param name="userId" value="${user.id}"/>
					</c:url>
					<tr>
						<td> ${user.username} </td>
						<td> ${user.status} </td>
						<td> <a href="${updateLink}">Update</a> |
							<a href="${deleteLink}" onclick="if (!(confirm('Sure?'))) return false">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>