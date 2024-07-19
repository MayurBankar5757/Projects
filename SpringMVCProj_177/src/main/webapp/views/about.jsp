<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style= 'color:blue'>This is about page</h1>
<%

int  salary = (Integer)request.getAttribute("Salary");
int marks = (Integer)request.getAttribute("Marks");

%>
<h1>Salary : <%= salary %></h1>
<h1>marks : <%= salary %></h1>


</body>
</html>