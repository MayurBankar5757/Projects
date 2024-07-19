<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="Header.html" %>
<h3 style='color:red'>Sorry an Exception occured</h3>
<p>Exceptin : <%=exception %>
<%@ include file="Footer.html" %>


</body>
</html>