<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Donuts API Demo</title>
</head>
<body>
	<h1>Donuts</h1>
	<ul>
	<c:forEach var="donut" items="${ donuts }">
		<li><a href="/donut/${ donut.id }">${ donut.name }</a></li>
	</c:forEach>
	</ul>
</body>
</html>