<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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

<title>Patient Details</title>
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

	<form action="save" method="post">
		<div class="details" style="text-align: center;">
			<pre>

<b><p style="text-align: center; color: green;">${message}</p></b>

<table class="table table-striped table-dark">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Image</th>
      <th scope="col">Name </th>
      <th scope="col">Email</th>
      <th scope="col">Age</th>
      <th scope="col">MobileNo</th>
      <th scope="col">Gender</th>
      <th scope="col">Id Proof</th>
      <th scope="col">BPL Card </th>
      <th scope="col">Insureance</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <!-- <th scope="row">1</th> -->
      <th scope="row">${entity.id}</th>
      <td><img alt="Nothing" src="send/files${entity.fileName}"
								width="100" height="150"> </td>
      <td>${entity.name}</td>
      <td>${entity.email}</td>
       <td>${entity.age}</td>
        <td>${entity.mobileNo}</td>
         <td>${entity.gender}</td>
          <td>${entity.idValue}</td>
           <td>${entity.bplCard}</td>
      <td>@${entity.insurence}</td>
    </tr>
 </tbody> 
 </table>  
</pre>
		</div>



	</form>

</body>
</html>