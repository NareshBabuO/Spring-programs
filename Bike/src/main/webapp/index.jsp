<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
	background-color: yellow;
}

.login-box {
	position: absolute;
	top: 50%;
	left: 82%;
	width: 400px;
	padding: 40px;
	transform: translate(-50%, -50%);
	background: aquamarine;
	box-shadow: 0 15px 25px rgba(143, 124, 236, 0.7);
	border-radius: 10px;
}

p {
	color: navy;
	text-indent: 30px;
	left: 72%;
	text-transform: uppercase;
}

.bg-img {
	/* The image used */
	background-image: url("https://pbs.twimg.com/media/Ee1Z-x7UwAA6LcY.jpg");
	min-height: 670px;
	/* Center and scale the image nicely */
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
	position: relative;
}
</style>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Bike details</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<a class="navbar-brand" href="#"><img
			src="https://www.x-workz.in/Logo.png" class="img-fluid" width="100"
			height="50"></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
			<div class="navbar-nav">
				<a class="nav-item nav-link active" href="#" style="color: white;">Home
					<span class="sr-only">(current)</span>
				</a>
				<div>
					<a href="Search.jsp">Search</a>
				</div>
			</div>
		</div>
	</nav>


	<div class="bg-img">
		<marquee behavior="scroll" direction="right" scrollamount="12"
			style="color: red;">
			<h1>Bike Details Here</h1>
		</marquee>

		<p class="text-success" align="right">
			<b>${message}</b>
		</p>
		<p class="text-danger" align="right">
			<b>${error}</b>
		</p>


		<form action="send" method="post">
			<div>
				<div class="login-box">
					<div class="user-box">

						<div>
							<b> <label for="cars"
								style="color: black; font-size: x-large;">Brand:</label></b> <select
								name="brand" id="brand" value="${dto.brand}">
								<option value="pulsar-200">NS-200</option>
								<option value="enfield">Royal Enfield</option>
								<option value="mt-15">FZ</option>
							</select>
						</div>

						<b style="color: black; font-size: x-large;">Owner :</b><input
							type="text" name="ownerName" placeholder="Enter brand"
							value="${dto.ownerName}" />
					</div>

					<b style="color: black; font-size: x-large;">Location :</b> <input
						type="text" name="location" placeholder="Enter location"
						value="${dto.location}" /> <br>
					<div>
						<b style="color: black; font-size: x-large;">Ambassador:</b><input
							type="text" name="ambassador" placeholder="Enter ambassador"
							value="${dto.ambassador}" />
					</div>
					<br> <input type="submit" value="send"
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