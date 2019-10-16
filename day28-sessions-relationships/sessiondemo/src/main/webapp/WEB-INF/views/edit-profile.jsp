<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit Profile</title>
<link rel="stylesheet" href="/theme.css" />
</head>
<body class="theme-${ theme }">
	<form action="/edit-profile" method="post">
		<p>
			<label for="firstName">First Name:</label>
			<input id="firstName" name="firstName" value=${ user.firstName }>
		</p>
		<p>
			<label for="lastName">Last Name:</label>
			<input id="lastName" name="lastName" value=${ user.lastName }>
		</p>
		<p>
			<button type="submit">Save Changes</button>
			<a href="/">Cancel</a>
		</p>
	</form>
</body>
</html>