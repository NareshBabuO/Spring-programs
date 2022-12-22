<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Patient Details</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<a class="navbar-brand" href="#"><img
			src="https://upload.wikimedia.org/wikipedia/en/c/c3/Project_Hospital_Poster.jpg"
			class="img-fluid" width="100" height="50"></a> <a
			class="nav-item nav-link active" href="index.jsp"
			style="color: white;">Home </a>
	</nav>

	<br>

	<form action="save" method="get">

		<div class="tech">
			<!-- <pre>
					Name :<input type="text" name="name" placeholder="Enter Name">					
					 AgeGreaterThan  :<input type="number" name="greaterThanAge" placeholder="Enter Age" value="0" />
					 AgeLesserThan  :<input type="number" name="lesserThanAge"
					placeholder="Enter Age" value="0" />
					<input class="btn btn-primary" type="submit" value="Search">
					</pre> -->


			Name : <input type="text" name="name" placeholder="Enter Name" />
			AgeGreaterThan : <input type="number" name="greaterThanAge"
				placeholder="Enter Age" value="0" /> AgeLesserThan : <input
				type="number" name="lesserThanAge" placeholder="Enter Age" value="0" />
			<input class="btn btn-primary" type="submit" value="Search">



		</div>

		<p Class="text-danger">${error}</p>

		<p style="text-align: center; color: green;">${message}</p>
		<table class="table table-striped table-dark">
			<thead>
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Name</th>
					<th scope="col">Email</th>
					<th scope="col">Age</th>
					<th scope="col">Mobile No</th>
					<th scope="col">Gender</th>
					<th scope="col">Id Proof</th>
					<th scope="col">Id Value</th>
					<th scope="col">BPL Card</th>
					<th scope="col">Insurance</th>
				</tr>
			</thead>

			<c:forEach items="${list}" var="entity">
				<tbody>
					<tr>
						<td>${entity.id}</td>
						<td>${entity.name}</td>
						<td>${entity.email}</td>
						<td>${entity.age}</td>
						<td>${entity.mobileNo}</td>
						<td>${entity.gender}</td>
						<td>${entity.idProof}</td>
						<td>${entity.idValue}</td>
						<td>${entity.bplCard}</td>
						<td>${entity.insurence}</td>
					</tr>
				</tbody>
			</c:forEach>

		</table>
	</form>




	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>


</body>
</html>