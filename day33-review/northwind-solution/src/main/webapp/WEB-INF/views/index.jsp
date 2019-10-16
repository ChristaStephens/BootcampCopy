<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Suppliers</title>
</head>
<body>
	<main class="container">
		<h1>Suppliers</h1>
		
		<table class="table">
			<thead>
			<tr>
				<th>Company</th><th>City</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach var="supplier" items="${suppliers}">
				<tr>
					<%-- Access properties of the java bean using simple . notation.
					     This actually calls the getters behind the scenes. --%>
					<td>${supplier.companyName}</td><td>${supplier.city}</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</main>
</body>
</html>