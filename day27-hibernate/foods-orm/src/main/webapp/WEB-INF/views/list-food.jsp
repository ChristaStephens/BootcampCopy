<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Foods</title>
<!-- Link the bootstrap CSS -->
<!-- <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous"> -->
<!-- Or in this case, a variation theme... -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/sketchy/bootstrap.min.css" />
<!-- Custom CSS goes below Bootstrap CSS -->
<link rel="stylesheet" href="/style.css" />
</head>
<body>
	<!-- With boostrap, pages should generally be surrounded with a container element. -->
	<main class="container">
		<h1>Foods</h1>
		
		<form class="form-inline" action="/food" autocomplete="off">
		  <label class="sr-only" for="keyword">Keyword</label>
		  <input type="text" value="${param.keyword}" class="form-control mb-2 mr-sm-2" id="keyword" name="keyword" placeholder="Keyword">
		  
		  <label class="sr-only" for="category">Category</label>
		  <select class="form-control mb-2 mr-sm-2" id="category" name="category">
		  	<option value="">Category</option>
		  	<c:forEach items="${ categories }" var="cat">
		  		<option <c:if test="${ cat eq param.category }">selected</c:if>>${ cat }</option>
		  	</c:forEach>
		  </select>
		
		  <button type="submit" class="btn btn-primary mb-2 mr-2">Search</button>
		  <c:if test="${not empty param.keyword or not empty param.category}">
		    <%-- c:if determines whether its contents should show or not --%>
		  	<a href="/food" class="btn btn-secondary mb-2">Clear</a>
	  	  </c:if>
		</form>
		
		<table class="table">
			<thead>
			<tr>
				<th>Food</th><th>Category</th><th>Description</th><th>Action</th>
			</tr>
			</thead>
			<tbody>
			<%-- c:forEach is loops through the items and repeats the content for each one.
			     Think of this as:   for (Food food : foods) { ... }
			--%>
			<c:forEach items="${foods}" var="food">
				<tr>
					<%-- Access properties of the java bean using simple . notation.
					     This actually calls the getters behind the scenes. --%>
					<td>${food.name}</td><td>${food.category}</td><td>${food.description}</td>
					<td>
						<a href="/food/update?id=${ food.id }" class="btn btn-light btn-sm">Edit</a>
						<a href="/food/delete?id=${ food.id }" class="btn btn-light btn-sm">Delete</a>
					</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
		
		<a class="btn btn-secondary" href="/food/create">Add</a>
	</main>
</body>
</html>