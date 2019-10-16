<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ping Pong</title>
<link rel="stylesheet" href="/pong.css" />
<link rel="stylesheet" href="/theme.css" />
</head>
<body class="pong theme-${ theme }">
	<header>	
		<nav>
			<a href="/">Home</a>
			<a href="/edit-profile">Edit Profile</a>
		</nav>
		<form id="theme-changer" action="/change-theme">
			Select Theme:
			<select name="theme-choice" onchange="document.getElementById('theme-changer').submit()">
				<option value="light" ${ theme eq 'light' ? 'selected' : '' }>Light</option>
				<option value="dark" ${ theme eq 'dark' ? 'selected' : '' }>Dark</option>
			</select>
		</form>
	</header>
	<main>
		<div class="row">
			<div class="ball"></div>
		</div>
	</main>
</body>
</html>