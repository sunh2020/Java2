<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link type ="text/css" href="css/style.css" rel="stylesheet" >
<title>Dojo Survey Result</title>
</head>
<body>
<div class="dojo">
	<h3>Submitted Info</h3>
	<h3>Name:<c:out value="${yourName}" /></h3>
	<h3>Dojo Location:<c:out value="${location}" /></h3>
	<h3>Favorite Language:<c:out value="${fav}" /></h3>
	<h3>Comment:<c:out value="${comment}" /></h3>
	<a href="/">Go Back</a>
</div>
</body>
</html>