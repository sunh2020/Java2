<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Dojo</title>
</head>
<body>
	<h1>New Dojo</h1>
<form:form action="/dojos/new" method="post" modelAttribute="dojo">
    <p>
        <form:label path="name">Name: </form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
    <button type="submit" value="create"/>Create</button>
</form:form>  
</body>
</html>