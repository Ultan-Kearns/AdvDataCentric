<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Loan</title>
</head>
<body>
<form:form modelAttribute = "loan1"  method="post">
	Loan ID:<form:input path = "id"></form:input>
	<button type = "submit">Delete Loan</button>
</form:form>
</body>
</html>