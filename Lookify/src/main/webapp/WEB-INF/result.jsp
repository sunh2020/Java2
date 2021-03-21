<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link type ="text/css" href="css/style.css" rel="stylesheet" >
<title>Lookify!</title>
</head>
<body>

	<h3><a href="/songs/new">Add New</a></h3>
	<h3><a href="/search/topTen">Top Songs</a></h3>
	<input type="text"/>
	<button type="create">Search Artists</button>
<table>
	<thead>
		<tr>
			<th>Name</th>
			<th>Rating</th>
			<th></th>		
				
		</tr>
	</thead>
	<tbody>
		<td><a href="/song/{id}"><c:out value="${song.name}"/></a></td>
	</tbody>

</table>	
	
</body>
</html>