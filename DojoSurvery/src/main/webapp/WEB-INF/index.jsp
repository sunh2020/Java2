<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link type ="text/css" href="css/style.css" rel="stylesheet" >
<title>Dojo Survey</title>
</head>
<body>
<div id = container>
<form action="/result" method="POST">
	<p>
	<h2>Dojo Survey</h2>
	<h3>Your Name: <input type="text" name="yourName"></h3>
	<h3>Dojo Location: <select class="formfields" name="location" ></h3>
	<option value="Los Angeles">Los Angeles</option>
	<option value="Burbank">Burbank</option>
	<option value="Sanjose">Sanjose</option>
	<option value="Seattle">Seattle</option>
	</select>
	<h3>Favorite Language: <select class="formfields" name="fav" ></h3>
	<option value="Python">Python</option>
	<option value="Java">Java</option>
	<option value="JavaScript">JavaScript</option>
	<option value="C#">C#</option>
	</select>		
    <h3>Comment (optional):
    <input type="textarea" name="comment"  ></h3>
    <input type="submit" value="Submit">
</form>
</div>
</body>
</html>