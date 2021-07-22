<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		FirtName: <form:input path="firstName" />
		<br><br>
		LastName: <form:input path="LastName" />
		
		<br><br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>