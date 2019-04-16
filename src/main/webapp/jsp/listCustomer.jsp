<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Customer</title>
</head>
<body>
<h1>List of customers</h1>
<table style="border:2px solid black">
<tr>
<td  style="border:2px solid black">Book ID</td>
<td style="border:2px solid black">Title</td>
<td style="border:2px solid black">Author</td>
</tr>
  <c:forEach items="${customer}" var="customer">
    <tr>
    <td style="border:2px solid black">${customer.loans.id}</td>
  	<td style="border:2px solid black">${customer.cName}</td>
  	<td style="border:2px solid black">${customer.loanPeriod}</td>
    </tr>
  </c:forEach>
</table>
<a href="/">Home</a>
<a href = "/showBooks">List Books</a>
<a href = "/showBooks">List Customers</a>
<a href = "/showBooks">List Loans</a>
<a href = "/login">Logout</a>
</body>
</html>