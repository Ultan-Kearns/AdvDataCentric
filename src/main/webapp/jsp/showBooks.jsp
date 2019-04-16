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
<table style="border:2px solid black">
<tr>
<td  style="border:2px solid black">Book ID</td>
<td style="border:2px solid black">Title</td>
<td style="border:2px solid black">Author</td>
</tr>
  <c:forEach items="${book}" var="book">
    <tr>
    <td style="border:2px solid black">${book.id}</td>
  	<td style="border:2px solid black">${book.title}</td>
  	<td style="border:2px solid black">${book.author}</td>
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