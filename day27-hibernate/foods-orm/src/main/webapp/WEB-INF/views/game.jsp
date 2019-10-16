<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Add Food</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/sketchy/bootstrap.min.css" />
<!-- Custom CSS goes below Bootstrap CSS -->
<link rel="stylesheet" href="/style.css" />
</head>
<body>
	<main class="container">
		<h1>Battle Game</h1>
		<form action="/fight">
		<div class="row form-group">
			<div class="col-sm-6">
				<c:forEach items="${ players }" var="player">
					<div class="form-check">
					  <input class="form-check-input" type="radio" name="p1" value="${player.id}" id="checkLeft${player.id}" required>
					  <label class="form-check-label" for="checkLeft${player.id}">
					    ${player.name}
					    <progress value="${player.health}" max="10"></progress>
					  </label>
					</div>
				</c:forEach>
			</div>
			<div class="col-sm-6">
				<c:forEach items="${ players }" var="player">
					<div class="form-check">
					  <input class="form-check-input" type="radio" name="p2" value="${player.id}" id="checkRight${player.id}" required>
					  <label class="form-check-label" for="checkRight${player.id}">
					    ${player.name}
					    <progress value="${player.health}" max="10"></progress>
					  </label>
					</div>
				</c:forEach>
			</div>
		</div>
		<p>
			<button type="submit" class="btn btn-primary">Battle!</button>
			<a href="/reset-health" class="btn btn-secondary">Reset Health</a>
		</p>
		</form>
	</main>
</body>
</html>