<%@ page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<h1>Hello My name is ${name}</h1>

	<h1>This is help page</h1>
	<h1>my rollNumber is ${rollnumber}</h1>

	<h1>Date And Time is ${time}</h1>

	<hr>
	<ul>
		<c:forEach var="item"
			items="${marks}">
		<%-- <li>${item }</h1> --%>

		<li>
			<c:out value="${item}"></c:out>
		</li>
		</c:forEach>
	I</ul>


</body>
</html>