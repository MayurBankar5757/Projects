<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style= 'color:red'>This is home page</h1>
<% 
String name = (String)request.getAttribute("name");
int age = (Integer) request.getAttribute("age");
String city = (String)request.getAttribute("city");
 List<String>courses = (List<String>) request.getAttribute("courses");
 %>
<h1>Name : <%=name %></h1>
<h1>age : <%=age %></h1>
<h1>city :<%=city %></h1>
 <% for(String s: courses)
{
 %>
<li> <%= s %></li>
<% }%>


</body>
</html>