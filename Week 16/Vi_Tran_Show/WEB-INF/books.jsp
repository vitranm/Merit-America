<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Books</title>
</head>
<body>
<c:forEach items="${books}" var="book" varStatus="loop">
<ul>    
    <li><c:out value="${book.title}"/></li>
    <li><c:out value="${book.description}"/></li>
    <li><c:out value="${book.language}"/></li>
    <li><c:out value="${book.numberOfPages}"/></li>
    <li><a href="/books/delete/${loop.index}">Delete</a></li>
</ul>
</c:forEach>

</body>
</html>




