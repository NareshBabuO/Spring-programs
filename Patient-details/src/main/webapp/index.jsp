<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
	background-color: blue;
}

.login-box {
	position: absolute;
	top: 55%;
	left: 85%;
	width: 380px;
	padding: 32px;
	transform: translate(-50%, -50%);
	background: aquamarine;
	box-shadow: 0 15px 25px rgba(143, 124, 236, 0.7);
	border-radius: 10px;
}

body, html {
	height: 100%;
	margin: 0;
}

.bg-img {
	/* The image used */
	background-image:
		url("https://media.istockphoto.com/id/1295301481/photo/modern-empty-temporary-intensive-care-emergency-room-is-ready-to-receive-patients-with.jpg?b=1&s=170667a&w=0&k=20&c=TjIRrPJwgQbI-62_0vCUtmWtpcmtAgeu4QiTLwV16GE=");
	min-height: 690px;
	/* Center and scale the image nicely */
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
	position: relative;
}

/* form {
	display: inline-block;
	float: left;
	clear: left;
	width: 250px;
	text-align: left;
	/*Change to right here if you want it close to the inputs*/
}
input {
	display: inline-block;
	float: right;
}
*
/
</style>

<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Patient Details</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<a class="navbar-brand" href="#"><img
			src="https://www.x-workz.in/Logo.png" class="img-fluid" width="100"
			height="50"></a>
		<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
			<a class="nav-item nav-link active" href="index.jsp"
				style="color: white;">Home </a>
			<div>
				<a href="Search.jsp">Search</a>
			</div>
		</div>
	</nav>

	<div class="bg-img">
		<marquee behavior="scroll" direction="right" scrollamount="12"
			style="color: maroon;">
			<h1>App to Save Patient Details Here</h1>
		</marquee>


		<p class="text-success" align="right" style="left: 60%;
		top: 10%;">
			<b>${message}</b>
		</p>
		<p class="text-warning" align="right" style="left: 60%;
		top: 10%;">
			<b>${error}</b>
		</p>
		<br> <br>

		<form action="save" method="post" enctype="multipart/form-data">

			<div>
				<div class="login-box">
					<div class="user-box">
						<div>
							<b> Name:<input type="text" id="name" name="name"
								placeholder="Enter Name" value="${entity.name}"><br>
							</b>
						</div>
						<br>
						<div>
							<b>Email:</b> <input type="text" id="email" name="email"
								placeholder="Enter email" value="${entity.email}">
						</div>
						<br>

						<div>
							<b> Age: </b><input type="text" id="age" name="age"
								placeholder="Enter age" value="${entity.age}"><br>
						</div>
						<br>
						<div>
							<b> Mobile No: </b><input type="text" id="mobileNo"
								name="mobileNo" placeholder="Enter mobileNo"
								value="${entity.mobileNo}">
						</div>
						<br>
						<div>
							<b> Select Gender :<input type="radio" name="gender"
								value="male"> Male <input type="radio" name="gender"
								value="female"> Female <input type="radio" name="gender"
								value="Other"> Other<br>
							</b>
						</div>
						<br>
						<div>
							<b>Id Proof:</b> <select name="idProof" id="color">
								<option value="select location">select</option>
								<option value="adharCard">AdharCard</option>
								<option value="voterID">VoterID</option>
								<option value="rationCard">RationCard</option>
								<option value="panCard">PanCard</option>
							</select>
						</div>
						<br>
						<div>
							<b> <label for="ID Value">ID Value:</label>
							</b><input type="text" id="idValue" name="idValue"
								placeholder="Enter ID Number" value="${entity.idValue}">
						</div>

						<div>
							<b> BPL Card : <input type="radio" id="Yes" name="bplCard"
								value="true" ${entity.bplCard} /> <label for="Yes">Yes</label>
								<input type="radio" id="No" name="bplCard" value="false"
								${entity.bplCard} /> <label for="No">No</label></b>
						</div>
						<div>

							<b> Insurance : <input type="radio" id="Yes" name="insurence"
								value="true" ${entity.insurence} /> <label for="Yes">Yes</label>
								<input type="radio" id="No" name="insurence" value="false"
								${entity.insurence} /> <label for="No">No</label> <br>
							</b>
						</div>


						<div>
							<b><label>Image:</label> <input type="file" name="file"><br></b>

						</div>
						<input type="submit" value="save"
							style="font-style: italic; font-weight: bolder; background: green; border: thin; opacity: inherit;">
					</div>
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