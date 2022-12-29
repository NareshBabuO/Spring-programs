
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		url("https://ca-times.brightspotcdn.com/dims4/default/0c3128e/2147483647/strip/true/crop/3840x2560+0+0/resize/1200x800!/quality/80/?url=https%3A%2F%2Fcalifornia-times-brightspot.s3.amazonaws.com%2F57%2F99%2F80d9236e4693a020629da5b0d920%2Fla-photos-1staff-467110-la-me-mens-central-jail-25-als.JPG");
	min-height: 600px;
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

<title>Criminal Details here</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<a class="navbar-brand" href="#"><img
			src="https://cdn1.vectorstock.com/i/1000x1000/32/95/red-shopping-bag-retail-logo-design-template-vector-21283295.jpg"
			class="img-fluid" width="100" height="50"></a>
		<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
			<br> <br>
			<div>
				<a href="Search.jsp">Search</a>
			</div><div>
				<a href="Search.jsp">Search</a>
			</div>
		</div>
	</nav>
	<div class="bg-img">
		<marquee behavior="scroll" direction="right" scrollamount="12"
			style="color: blue;">
			<h1>App to Save Criminals Details Here</h1>
		</marquee>


		<form action="criminal" method="post" enctype="multipart/form-data">
			<div class="login-box">
				<div class="user-box">
					<div>
						<b> Name :<input type="text" id="name" name="name"
							placeholder="Enter Name" required="required"
							value="${entity.name}"></b>
					</div>
					<br>
					<div>
						<b> Crime :<input type="text" id="crime" name="crime"
							placeholder="Enter Crime" required="required"
							value="${entity.crime}">
						</b>
					</div>
					<!-- <div>
						<b>Crime :</b> <select name="crime" id="crime">
							<option value="select Crime">select</option>
							<option value="murder">Murder</option>
							<option value="half-Murder">Half-Murder</option>
							<option value="rape">Rape</option>
							<option value="pick-Pocket">Pick-Pocket</option>
						</select>
					</div> -->

					<!-- <div class="form-group row">
						<label for="inputPassword3" class="col-sm-2 col-form-label">Crime:</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="crime"
								id="inputPassword3" placeholder="Crime" required="required">
						</div>
					</div> -->
					<br>
					<div>
						<b> TotalYearAward :<input type="number" name="totalYearAward"
							placeholder="total Year" value="${entity.totalYearAward}"></b>
					</div>
					<br>
					<div>
						<b> AliasName : <input type="text" name="aliasName"
							placeholder="Enter AliasName" value="${entity.aliasName}"></b>
					</div>

					<div>
						<b> Description:<br> <textarea rows="4" cols="40"
								name="description" form="usrform"
								placeholder="Enter Criminal description..."></textarea></b>
					</div>

					<div>
						<b> JailName : <input type="text" name="jailName"
							placeholder="Enter Jail Name" value="${entity.jailName}"></b>
					</div>

					<div>
						<b><label>Image:</label> <input type="file" name="file" /><br></b>
					</div>
					<br> <input type="submit" value="save"
						style="font-style: italic; font-weight: bolder; background: green; border: thin; opacity: inherit;">

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