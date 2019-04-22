<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Books</title>
</head>
<body>
<h1>Add New Book</h1>
 <form:form action="/addNewBook" modelAttribute = "book1"  method="post">
Title:<form:input path="title"></form:input>
<br>
Author:<form:input path = "author"></form:input>
<br>
<button type = "submit">Add</button>
</form:form>
<a href = "/">Home</a>
<a href = "showBooks">Show Books</a>
<a href = "addCustomer">Add Customers</a>
<a href = "addLoan">New Loan</a>
</body>
</html>