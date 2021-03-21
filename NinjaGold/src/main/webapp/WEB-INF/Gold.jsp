<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link type ="text/css" href="css/style.css" rel="stylesheet" >
<title>Ninja Gold Game</title>
</head>
<body>
<div id = container>
<h3>Your Gold:${gold}</h3>
<p>
<div class="box">
<form action="/submit" method="POST">
<input type="hidden" name="which_button" value="farm">
<h3>Farm</h3>
<h5>(earns 10-20 gold)</h5>
<button name="farm">Find Gold</button>
</form>
<p>
<div class="box">
<form action="/submit" method="POST">
<input type="hidden" name="which_button" value="cave">
<h3>Cave</h3>
<h5>(earns 5-10 gold)</h5>
<button name="cave">Find Gold</button>
</form>
<p>
<div class="box">
<form action="/submit" method="POST">
<input type="hidden" name="which_button" value="house">
<h3>House</h3>
<h5>(earns 2-5 gold)</h5>
<button name="house">Find Gold</button>
</form>
<p>
<div class="box">
<form action="/submit" method="POST">
<input type="hidden" name="which_button" value="casino">
<h3>Casino!</h3>
<h5>(earns 0-50 gold)</h5>
<button name="casino">Find Gold</button>
</form>
</div>
<div class = "result">
<h3>Activities:</h3>
<c:out value="You entered ${gold} gold."/>
	<%-- <c:set(sesh.getAttribute("activities") != null)>
		<c:if ArrayList<String> activities = (ArrayList<String>) sesh.getAttribute("activities")/>
		<c:out for(int i =0; i< activities.size(); i++){ %>
		<c:if (activities.get(i).contains("lost")){ %>
			<li class = "lost><%= activities.get(i) %></li>
		<% } else { %>
			<li class="earned"><%= activities.get(i) %></li>
			<% } %>	
		<% } %>
		<% } %>
</ul> --%>
</div>
	<a href="/reset">Reset</a>			
</body>
</html>