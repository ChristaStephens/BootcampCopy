<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Rooms</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Rooms at Grand Circus</h1>
		<table class="table">
			<thead>
				<tr>
					<th>Room</th><th>Capacity</th><th>Available</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="classroom" items="${rooms}">
				<tr>
					<td><a href="/rooms/${classroom.id}">${classroom.name}</a></td>
					<td>${classroom.capacity}</td>
					<td>${classroom.available ? "Yes" : "No" }</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="/rooms/add" class="btn btn-secondary">Add Room</a>
	</div>
</body>
</html>