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
	<br>
	<button type = "submit">Delete Loan</button>
	<br>
</form:form>
<a href = "/">Home</a>
<a href = "/showBooks">Show Books</a>
<a href = "/listCustomer">List Customers</a>
<a href = "/listLoan">List Loans</a>
<a href = "/newLoan">New Loan</a>
</body>
</html>