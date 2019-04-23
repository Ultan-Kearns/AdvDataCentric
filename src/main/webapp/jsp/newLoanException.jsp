<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Loan</title>
</head>
<body>
<h1>Could not create new loan</h1>
<h2>Book: ${ loan1.book.id } (${ loan1.book.title }) already on loan to Customer: ${loan1.cust.id } (${ loan1.cust.cName})</h2>
</body>
</html>