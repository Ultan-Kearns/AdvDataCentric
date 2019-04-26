<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Loan</title>
</head>
<body>
<h1>Could not create loan</h1>
<h2>No such customer ${loan1.cust.id} No such book ${loan1.book.id}</h2>
<a href = "/">Home</a>
<a href = "/showBooks">Show Books</a>
<a href = "/listCustomer">List Customers</a>
<a href = "/listLoan">List Loans</a>
<a href = "/addLoan">New Loan</a>
</body>
</html>