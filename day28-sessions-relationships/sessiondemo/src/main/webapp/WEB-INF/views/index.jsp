<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Session &amp; Cookie Demo</title>
<link rel="stylesheet" href="/theme.css" />
</head>
<body class="theme-${ theme }">
	<header>
		<nav>
			<a href="/pong">Try Pong</a>
			<a href="/edit-profile">Edit Profile</a>
		</nav>
		<span>
			Hello ${ profile.firstName } ${ profile.lastName } (stored in session)
		</span>
	</header>

	<p>
		Count (stored in cookie): <b>${ countFromCookie }</b>
	</p>
	<p>
		<a href="/count">Add</a>
		<a href="/clear">Clear</a>
	</p>
</body>
</html>