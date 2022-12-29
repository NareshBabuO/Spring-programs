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

<title>Criminal Details</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<a class="navbar-brand" href="#"><img
			src="https://cdn.dnaindia.com/sites/default/files/styles/full/public/2018/04/10/670519-666678-arrest-new.jpg"
			class="img-fluid" width="100" height="50"></a>
			class="img-fluid" width="100" height="50"></a> <a
			class="nav-item nav-link active" href="index.jsp"
			style="color: white;">Home </a>
	</nav>

	<br>

	<form action="criminal" method="get">

		<div class="tech">



			Name : <input type="text" name="name" placeholder="Enter Name" />
			JailName : <input type="text" name="jailName"
				placeholder="Enter Jail Name" /> <input class="btn btn-primary"
				type="submit" value="Search">



		</div>
		<div class="page" style="width: 30; height: 30">
			<table class="table table-striped table-dark">
				<thead>
					<tr>
						<th scope="col">Id</th>
						<th scope="col">Name</th>
						<th scope="col">Crime</th>
						<th scope="col">Total Years Awarded</th>
						<th scope="col">Alias Name</th>
						<th scope="col">description</th>
						<th scope="col">jailName</th>
						<th scope="col">Image</th>
						<th scope="col">File Name</th>
						<th scope="col">File Size</th>
						<th scope="col">Content Type</th>



					</tr>
				</thead>



				
					<tbody>
					<c:forEach items="${list}" var="entity">
						<tr>
							<td>${dto.id}</td>
							<td>${dto.name}</td>
							<td>${dto.crime}</td>
							<td>${dto.totalYearsAwarded}</td>
							<td>${dto.aliasName}</td>
							<td>${dto.description}</td>
							<td>${dto.jailName}</td>
							<td><img src="criminal/files/${dto.fileName}" width="100"
								height="150"></td>
							<td>${dto.fileName}</td>
							<td>${dto.fileSize}</td>
							<td>${dto.contentType}</td>



						</tr>
						</c:forEach>
					</tbody>
				

			</table>
		</div>
	</form>
	<p style="text-align: center; color: green;">${message}</p>




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