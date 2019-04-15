<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Books</title>
</head>
<body>
<h1>List of Books</h1>
<table>

  <c:forEach items="${book}" var="book">
    <tr>
    <td>${book.id}</td>
  	<td>${book.title}</td>
  	<td>${book.author}</td>
    </tr>
  </c:forEach>
</table>
<a href = "/">Home</a>
<a href = "addBook">Add a book</a>
<a href = "addCustomer">Add Customers</a>
<a href = "listLoan">List Loans</a>
<a href = "login">Logout</a>
</body>
</html>