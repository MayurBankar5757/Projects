<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page errorPage="ErrorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="Header.html" %>
<h3>This is my home page</h3>
<%
 int a =10;
 int b = 10;
 out.println(a/b);
%>
<%@ include file="Footer.html" %>

</body>
</html>