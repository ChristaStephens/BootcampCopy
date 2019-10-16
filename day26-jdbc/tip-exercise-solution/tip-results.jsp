<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tip</title>
</head>
<body>
	<h3>Result</h3>
	<p>
		Tip: <fmt:formatNumber type="currency" value="${ tip }" />
	</p>
	<p>
		<a href="/tip">Calculate another tip.</a>
	</p>
</body>
</html>