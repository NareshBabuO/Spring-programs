<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bus Stand</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<style type="text/css">
body {
	background-image:
		url("https://i0.wp.com/asiatimes.com/wp-content/uploads/2017/05/iStock-458575577.jpg?fit=1254%2C836&ssl=1");
	background-repeat: no-repeat;
	background-size: 100%;
}

form {
	text-align: center;
}

pre {
	color: black;
	font-weight: bold;
	font-size: large;
}

body {
	background-color: yellow;
}

.login-box {
	position: absolute;
	top: 60%;
	left: 20%;
	width: 400px;
	padding: 15px;
	transform: translate(-50%, -50%);
	background: skyblue;
	box-shadow: 0 15px 25px rgba(142, 124, 236, 0.7);
	border-radius: 10px;
}
</style>

</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">

		<a class="navbar-brand" href="#"><img
			src="https://www.x-workz.in/Logo.png" class="img-fluid" width="100"
			height="50"></a> <a class="navbar-brand" href="#">MyBusApp</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>




		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
			<div class="navbar-nav">
				<a class="nav-item nav-link active" href="#">Home</a>
			</div>
			<div>
				<a href="Search.jsp">Search</a>
			</div>
		</div>
	</nav>
	<div class="bg-img">
		<marquee behavior="scroll" direction="right" scrollamount="12"
			style="color: red;">
			<h1>Bus Stand Details Here</h1>
		</marquee>
		<p class="text-primary">
			<b>${message}</b>
		</p>
		<p class="text-danger">
			<b>${error}</b>
		</p>


		<form action="send" method="post">
			<div class="login-box">
				<div class="user-box">
					<label for="cars" style="color: black; font-size: x-large;">Name:</label>
					<input type="text" name="name" value="${dto.name}"> <br>
					<label for="cars" style="color: black; font-size: x-large;">
						No of Busses:</label><input type="text" name="noOfBusses"
						value="${dto.noOfBusses}"> <br> <label for="cars"
						style="color: black; font-size: x-large;">Location:</label> <input
						type="text" name="location" value="${dto.location}"><br>
					<label for="cars" style="color: black; font-size: x-large;">No
						Of Platform:</label> <input type="text" name="noOfPlatform"
						value="${dto.noOfPlatform}"> <br> <label for="cars"
						style="color: black; font-size: x-large;">No Of Shop:</label> <input
						type="text" name="noOfShop" value="${dto.noOfShop}"><br>


					<b> <label for="cars">City:</label></b> <select name="city"
						id="city" value="${dto.city}">
						<option value="select City">select</option>
						<option value="Bangalore">Bangalore</option>
						<option value="Hassan">Hassan</option>
						<option value="Davanagere">Davanagere</option>
						<option value="Tumkur">Tumkur</option>
						<option value="Others">Others</option>
					</select> <br> <br> <input type="submit" value="send"
						class="btn btn-success btn-lg" />
				</div>
			</div>

		</form>
	</div>
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