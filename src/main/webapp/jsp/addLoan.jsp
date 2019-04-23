<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Loan</title>
</head>
<body>
<h1>New Loan</h1>
<form:form action="/addNewLoan" modelAttribute = "loan1"  method="post">
Customer ID: <form:input path = "cust" required = "true"></form:input>
<br>
Book ID: <form:input path = "book" required = "true"></form:input>
<br>
<button type = "submit">Loan Book</button>
</form:form >
<a href = "/">Home</a>
<a href = "/showBooks">Show Books</a>
<a href = "/listCustomer">List Customers</a>
<a href = "/listLoan">List Loans</a>
</body>
</html>