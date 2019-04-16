<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Loan</title>
</head>
<body>
<h1>List of Loans</h1>
<table style="border:2px solid black">
<tr>
<td  style="border:2px solid black">Loan ID</td>
<td style="border:2px solid black">Due Date</td>
<td style="border:2px solid black">BID</td>
<td style="border:2px solid black">CID</td>
</tr>
  <c:forEach items="${loan}" var="loan">
    <tr>
    <td style="border:2px solid black">${loan.id}</td>
  	<td style="border:2px solid black">${loan.dueDate}</td>
  	<td style="border:2px solid black">${loan.book.id}</td>
  	<td style="border:2px solid black">${loan.cust.id}</td>
    </tr>
  </c:forEach>
</table>
<a href = "/">Home</a>
<a href = "/showBooks">Show Books</a>
<a href = "/listCustomer">List Customers</a>
<a href = "/listLoan">List Loans</a>
<a href = "/deleteLoan">Delete Loan</a>
<a href = "/login">Logout</a>
</body>
</html>