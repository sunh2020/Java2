<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link type ="text/css" href="css/style.css" rel="stylesheet" >
<script type ="text/javascript" src="js/app.js"></script>
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<title>Date</title>
</head>
<body>
	<h2><fmt:formatDate type = "date" value = "${date}" /></h2>
</body>
</html>