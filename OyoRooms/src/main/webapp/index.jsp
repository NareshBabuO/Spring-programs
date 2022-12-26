<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
body {
	background-color: blue;
}

.login-box {
	position: absolute;
	top: 40%;
	left: 80%;
	width: 400px;
	padding: 45px;
	transform: translate(-50%, -50%);
	background: skyblue;
	box-shadow: 0 15px 25px rgba(142, 124, 236, 0.7);
	border-radius: 10px;
}

.bg-img {
	/* The image used */
	background-image:
		url("https://www.oyorooms.com/officialoyoblog/wp-content/uploads/2017/10/OYO_Naming_7600x400.jpg");
	min-height: 600px;
	/* Center and scale the image nicely */
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
	position: relative;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>OYO Rooms Details</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
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
				<a class="nav-item nav-link active" href="#" style="color: white;">Home</a>
			</div>
		</div>
	</nav>

	<div class="bg-img">
		<marquee behavior="scroll" direction="right" scrollamount="12"
			style="color: blue;">
			<h1>App to Save OYO Rooms Details Here</h1>
		</marquee>

		<p class="text-success" align="center">${message}</p>
		<p class="text-danger" align="center">${error}</p>
		<br> <br>
		<form action="send" method="post">
		
	<div class="login-box">
				<div class="user-box">
				
 <b style="color: Block; font-size: x-large;">Area     :</b><input
							type="text" name="area" placeholder="Enter Area"
							value="${dto.area}" /><br>
<b style="color: Block; font-size: x-large;">TotalRoom :</b><input
							type="text" name="totalRoom" placeholder="Enter room"
							value="${dto.totalRoom}" /><br>
						<label for="cars"><b>IdProof  :</b></label> 
						<select name="idProof" id="color" value="${dto.idProof}">
						<option value="select id">select</option>
						<option value="AdharCard">AdharCard</option>
						<option value="Voter-id">Voter-id</option>
						<option value="Pan-Card">Pan-Card</option>
						<option value="Others">Others</option>	
						</select><br>
<b style="color: Block; font-size: x-large;">Cost      :</b>
<input type="text" name="cost" placeholder="Enter cost"
							value="${dto.cost}" /><br>
<input type="submit" value="send" class="btn btn-success btn-lg" />
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