<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Donuts API Demo</title>
<style>
	label {
		font-weight: bold;
	}
</style>
</head>
<body>
	<a href="/">Back to List</a>
	<h1>Donut</h1>
	<p><label>Name:</label> ${ donut.name }</p>
	<p><label>Calories:</label> ${ donut.calories }</p>
	<p><label>Extras:</label>
		<ul>
		<c:forEach var="extra" items="${ donut.extras }">
			<li>${ extra }</li>
		</c:forEach>
		</ul>
	</p>
</body>
</html>