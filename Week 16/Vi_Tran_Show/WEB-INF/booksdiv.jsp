<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
<c:forEach items="${books}" var="book">
	<div>
		<c:out value="${book.title}"/>
		<c:out value="${book.description}"/>
		<c:out value="${book.language}"/>
		<c:out value="${book.numberOfPages}"/>
	</div>
</c:forEach>	
</div>
</body>
</html>