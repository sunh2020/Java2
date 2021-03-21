<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Person</title>
</head>
<body>	
<h1>New Person</h1>
<form:form action="/persons/new" method="post" modelAttribute="person">
    <p>
        <form:label path="firstName">First Name: </form:label>
        <form:errors path="firstName"/>
        <form:input path="firstName"/>
    </p>
    <p>
        <form:label path="LastName">Last Name:</form:label>
        <form:errors path="LastName"/>
        <form:input path="LastName"/>
    </p>
    <p>
    <button type="submit" value="create"/>Create</button>
</form:form>  
</body>
</html>