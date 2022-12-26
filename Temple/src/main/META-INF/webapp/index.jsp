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
	top: 55%;
	left: 80%;
	width: 400px;
	padding: 30px;
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
		url("https://static.toiimg.com/thumb/msid-70460167,width-1280,height-720,resizemode-4/.jpg");
	min-height: 650px;
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

<title>Temple Details</title>
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
					<br> <a href="Search.jsp">Search</a>
				</div>
			</div>
		</div>
	</nav>


	<div class="bg-img">
		<marquee behavior="scroll" direction="right" scrollamount="12">
			<h1>App to Save Temple Details Here</h1>
		</marquee>

		<p class="text-success" align="right">
			<b>${message}</b>
		</p>
		<p class="text-warning" align="right">
			<b>${error}</b>
		</p>
		<form action="send" method="post">

			<div>
				<div class="login-box">
					<div class="user-box">
						<b style="color: black; font-size: x-large;">Name :</b> <input
							type="text" name="name" placeholder="Enter God name"
							value="${dto.name}" />
					</div>

					<div>
						<b> <label for="cars"
							style="color: black; font-size: x-large;">Location:</label></b> <select
							name="location" id="color">
							<option value="select location">select</option>
							<optgroup label="North India">

								<option value="Kedharnath">Kedharnath</option>
								<option value="Somnath">Somnath</option>
								<option value="Puri">Puri</option>
								<option value="Guwahati">Guwahati</option>
							</optgroup>
							<optgroup label="South India">
								<option value="Kailasanathar">Karuppadithattadai</option>
								<option value="Ekambaranathar">Kilambi</option>
								<option value="Mallikarjuna Swamy">Srisailam</option>
								<option value="Shivoham Shiva">Bengaluru</option>
							</optgroup>
						</select>
					</div>
					<b> <label for="cars" style="color: black; font-size: x-large;">Pincode
							:</label></b> <select name="pincode" id="color" value="${dto.location}">

						<option value="select location">select Pincode</option>
						<optgroup label="North India" value="${dto.pincode}">
							<option value="246445">246445</option>
							<option value="364005">364005</option>
							<option value="752001">752001</option>
							<option value="781035">781035</option>
						</optgroup>
						<optgroup label="South India">
							<option value="631601">631601</option>
							<option value="631551">631551</option>
							<option value="518101">518101</option>
							<option value="560004">560004</option>
						</optgroup>
					</select> <br> <b> <label for="cars"
						style="color: black; font-size: x-large;">MainGod:</label></b> <select
						name="mainGod" id="color" value="${dto.mainGod}" >
						<option value="select location">select</option>
						<option value="Shiva">Shiva</option>
						<option value="Parvathi">Parvathi</option>
						<option value="Ganesha">Ganesha</option>
						<option value="Subramanya">Subramanya</option>
					</select> <br> <b style="color: black; font-size: x-large;">Entry
						Fee :</b> <input type="text" name="fee" placeholder="entry fee"
						value="${dto.fee}" /> <br>
					<%-- <b
						style="color: black; font-size: x-large;">Open Time :</b> <input
						type="number" name="openTime" placeholder="open time"
						value="${dto.openTime}" /><br> <b
						style="color: black; font-size: x-large;">Close Time :</b> <input
						type="number" name="closeTime" placeholder="close time"
						value="${dto.closeTime}" />  --%>
					<b style="color: black; font-size: x-large;"> Open Time:</b><input
						type="text" name="openTime" placeholder="open time"
						value="${dto.openTime}"><br> <b
						style="color: black; font-size: x-large;"> Close Time:</b><input
						type="text" name="closeTime" placeholder="close time"
						value="${dto.closeTime}"><br> <br> 
						<input
						type="submit" value="submit"
						style="font-style: italic; font-weight: 
						bolder; background: green; border: thin; 
						opacity: inherit;">
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