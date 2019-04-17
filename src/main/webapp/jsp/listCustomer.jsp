<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Customer</title>
</head>
<body>
	<h1>List of customers</h1>
	<table>
		<c:forEach items="${customer}" var="customer">
			<tr>
				<td><h1>${customer.id} ${customer.cName}</h1></td>
				<br>
				<td>Loan Period =
					${customer.loanPeriod} days</td>
					<br>
				<td style="font-weight:bold">${customer.cName}'s Loans</td>
				<br>
			</tr>
			<tr>
				<!-- check if null -->

				<c:if test="${empty customer.loans}">
					<td>Loan does not exist</td>
				</c:if>
				<c:if test="${not empty customer.loans}" var="loans">
					<table>
						<tr>
							<td style="border: 2px solid black">Loan ID</td>
							<td style="border: 2px solid black">Book ID</td>
							<td style="border: 2px solid black">Title</td>
							<td style="border: 2px solid black">Author</td>
						</tr>
						<c:forEach items="${customer.loans }" varStatus="loop1">
							<tr>
								<td style="border: 2px solid black">"${customer.loans[loop1.index].id }"</td>
								<td style="border: 2px solid black">"${customer.loans[loop1.index].book.id }"</td>
								<td style="border: 2px solid black">"${customer.loans[loop1.index].book.title }"</td>
								<td style="border: 2px solid black">"${customer.loans[loop1.index].book.author}"</td>
							</tr>
						</c:forEach>
				</c:if>
	</table>
	</tr>
	</c:forEach>
	</table>
	<a href="/">Home</a>
	<a href="/showBooks">List Books</a>
	<a href="/showBooks">List Customers</a>
	<a href="/showBooks">List Loans</a>
	<a href="/login">Logout</a>
</body>
</html>