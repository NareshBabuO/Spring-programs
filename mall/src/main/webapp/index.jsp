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
	left: 55%;
	width: 380px;
	padding: 32px;
	transform: translate(-50%, -50%);
	background: LightSalmon;
	box-shadow: 0 15px 25px rgba(143, 124, 236, 0.7);
	border-radius: 10px;
}

body, html {
	height: 100%;
	margin: 0;
}

.bg-img {
	/* The image used */
	background-image: url("https://wallpaper.dog/large/5447432.jpg");
	min-height: 600px;
	/* Center and scale the image nicely */
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
	position: relative;
}

}
input {
	display: inline-block;
	float: right;
}

* {
	padding: 0;
	margin: 0;
	text-decoration: none;
	list-style: none;
	box-sizing: border-box;
}

body {
	font-family: montserrat;
}

nav {
	background: #0082e6;
	height: 80px;
	width: 100%;
}

/* label.logo {
	color: white;
	font-size: 35px;
	line-height: 80px;
	padding: 0 100px;
	font-weight: bold;
} */
nav ul {
	float: right;
	margin-right: 20px;
}

nav ul li {
	display: inline-block;
	line-height: 80px;
	margin: 0 5px;
}

nav ul li a {
	color: white;
	font-size: 17px;
	padding: 7px 13px;
	border-radius: 3px;
	text-transform: uppercase;
}

a.active, a:hover {
	background: #1b9bff;
	transition: .5s;
}

.checkbtn {
	font-size: 30px;
	color: white;
	float: right;
	line-height: 80px;
	margin-right: 40px;
	cursor: pointer;
	display: none;
}

#check {
	display: none;
}

@media ( max-width : 952px) {
	label.logo {
		font-size: 30px;
		padding-left: 50px;
	}
	nav ul li a {
		font-size: 16px;
	}
}

@media ( max-width : 858px) {
	.checkbtn {
		display: block;
	}
	ul {
		position: fixed;
		width: 100%;
		height: 100vh;
		background: #2c3e50;
		top: 80px;
		left: -100%;
		text-align: center;
		transition: all .5s;
	}
	nav ul li {
		display: block;
		margin: 50px 0;
		line-height: 30px;
	}
	nav ul li a {
		font-size: 20px;
	}
	a:hover, a.active {
		background: none;
		color: #0082e6;
	}
	#check:checked ~ ul {
		left: 0;
	}
}
</style>

<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Mall Details here</title>
</head>
<body>
	<nav>
		<a class="navbar-brand" href="#"><img
			src="https://cdn1.vectorstock.com/i/1000x1000/32/95/red-shopping-bag-retail-logo-design-template-vector-21283295.jpg"
			class="img-fluid" width="100" height="50"></a> <input
			type="checkbox" id="check"> <label for="check"
			class="checkbtn"> <i class="fas fa-bars"></i>
		</label>
		<ul>
			<li><a class="active" href="#">Home</a></li>
			<li><a href="#">About</a></li>
			<li><a href="#">Contact</a></li>
			<li><a href="admin.jsp">Admin</a></li>
		</ul>
	</nav>
	<div class="bg-img">
		<marquee behavior="scroll" direction="right" scrollamount="12"
			style="color: blue;">
			<h1>welcome to mall</h1>
		</marquee>


		<%-- 	<form action="criminal" method="post" enctype="multipart/form-data">
			<div class="login-box">
				<div class="user-box">

					<div>
						<b> AdminID :<input type="number" name="adminid"
							placeholder="Enter id""></b>
					</div>
					<br>
					<div>
						<b> Password : <input type="text" name="password"
							placeholder="Enter AliasName" value="${entity.password}"></b>
					</div>

					<br> <input type="submit" value="save"
						style="font-style: italic; font-weight: bolder; background: green; border: thin; opacity: inherit;">

				</div>
			</div>
		</form> --%>
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