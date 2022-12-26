<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bike Details</title>
<h> Bike Details</h>
</head>
<body>
	</nav>
	<!-- Just an image -->
	<nav class="navbar navbar-Success bg-warning">
		<a class="navbar-brand" href="#"> <img
			src="https://e7.pngegg.com/pngimages/310/332/png-clipart-computer-icons-home-house-desktop-service-home-blue-logo.png"
			width="40" height="40" alt="">
		</a>

	</nav>


	<h1>Search Results Found</h1>


	<c:forEach items="${list}" var="dto">
Name : ${dto.name} 
Brand  : ${dto.god}
</br>
	</c:forEach>

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>



</body>
</html>