<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
    
<!DOCTYPE html>
<html xmlns:th="https://www.thymeleaf.org/">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<table border="2" >

<tr>
<td>SID</td>

<td>SNAME</td>

<td>SPHONE</td>



</tr>
<c:forEach items="${hello}" var="ob">
<tr>

<td><c:out value="${ob.sid}"/></td>

<td><c:out value="${ob.sname}"/></td>

<td><c:out value="${ob.sphone}"/></td>

</tr>
</c:forEach>






</body>
</html>