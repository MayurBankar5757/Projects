<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JSTL Tags Example</h1>

<c:out value="Welcome to JSTL Page"></c:out>
<c:set var="name" value="Sham"></c:set>
<h3>Hello,<c:out value=${name }></c:out></h3>
</body>
</html>