<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Person with license</title>
</head>
<body>

	<p>
        <h1><c:out value="${person.firstName} ${person.lastName}"/></h1>
    </p>
    <p>
        <h3>License Number:<c:out value="${person.license.number}"/></h3>
    </p>
    <p>
        <h3>State:<c:out value="${person.license.state}"/></h3>
    </p>
    <p>
		<h3>Expiration Date:<c:out value="${person.license.expirationDate}"/></h3>    
    </p>
   
</body>
</html>