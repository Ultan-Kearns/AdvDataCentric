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
Customer ID: <input></input>
<br>
Book ID: <input></input>
<br>
<button type = "submit">Loan Book</button>
</form:form >
<a href = "/">Home</a>
<a href = "showBooks">Show Books</a>
<a href = "listCustomers">List Customers</a>
<a href = "listLoans">List Loans</a>
</body>
</html>