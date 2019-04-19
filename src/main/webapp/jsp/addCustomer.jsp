<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Customer</title>
</head>
<body>
<h1>Add New Customer</h1>
 <form:form action="/addNewCustomer" modelAttribute = "customer1"  method="post">
Customer Name: <form:input path = "cName"></form:input>
<br>
Loan Period(days)<form:input path = "loanPeriod"></form:input>
<br>
<button type = "submit">Add</button>
</form:form> 
<br>
<a href = "/">Home</a>
<a href = "addBook">Add Book</a>
<a href = "addCustomer">Add Customer</a>
<a href = "addLoan">New Loan</a>
</body>
</html>