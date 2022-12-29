<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Criminal Details</title>

<style>
body {
	text-align: center;
	padding-top: 15px;
}

label {
	display: inline-block;
	width: 80px;
}

body {
	background-size: 100%;
	background-position: center;
	background-repeat: no-repeat;
}
</style>



</head>
<body>


	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<a class="navbar-brand" href="#"><img
			src="https://upload.wikimedia.org/wikipedia/en/c/c3/Project_Hospital_Poster.jpg"
			class="img-fluid" width="100" height="50"></a> <a
			class="nav-item nav-link active" href="index.jsp"
			style="color: white;">Home </a>
		<div>
			<a href="Search.jsp">Search</a>
		</div>
	</nav>

	<form action="criminal" method="post">
		<div class="details" style="text-align: center;">
			

<%-- <b><p style="text-align: center; color: green;">${message}</p></b>
 --%>

	 <div class="page">
		<table class="table table-striped table-dark">
			<thead>
				<tr>
					<th scope="col">ID</th>
				 	<th scope="col">Image</th> 
					<th scope="col">Name</th>
					<th scope="col">Crime</th>
					<th scope="col">totalYearAward</th>
					<th scope="col">AliaName</th>
					<th scope="col">Description</th>
					<th scope="col">JailName</th>
					 <th scope="col">FileName</th>
					<th scope="col">FileSize</th>
					<th scope="col">ContentType</th> 
    </tr>
  </thead>
    
  <tbody>
	
    <tr>
      <th scope="row">${entity.id}</th>
					 <td><img src="criminal/files/${entity.fileName}" width="100"
									height="150"> </td> 
					<td>${entity.name}</td>
					<td>${entity.crime}</td>
					<td>${entity.totalYearsAwarded}</td>
					<td>${entity.aliasName}</td>
					<td>${entity.description}</td>
					<td>${entity.jailName}</td>
					 <td>${entity.fileName}</td>
					<td>${entity.fileSize}</td>
					<td>${entity.contentType}</td> 
    </tr>
    
 </tbody> 
 
 </table>  

			
			
			
			
			 </div>
			
			
			
		</div>


	</form>

</body>
</html>