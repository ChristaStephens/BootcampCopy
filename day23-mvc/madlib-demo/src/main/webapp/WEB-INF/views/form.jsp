<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Story Form</title>
</head>
<body>
	<p>Enter some words, please.</p>
	<form action="/story" method="post">
		<p>
			Noun: <input name="noun"/>
		</p>
		<p>
			Adj: <input name="adj" />
		</p>
		<p>
			<button>Submit</button>
		</p>
	</form>
</body>
</html>