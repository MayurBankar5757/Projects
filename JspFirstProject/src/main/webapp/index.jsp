<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.* , java.util.Random"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to JSP page</h1>
	<%!int a = 20;
	int b = 30;
	String msg = "welcome to JSP";
	float c = 34.45f;
	int sum;

	public String fun() {
		return "Hello";
	}%>
	<h2>
		Todays Date<%=new Date().toString()%></h2>

	<%
	sum = a + b;
	out.println("sum of 2 numbers : " + sum);
	out.println(msg);
	Random rd = new Random();
	int n = rd.nextInt(1000);
	%>
	<h3>
		Value of c :
		<%=c%></h3>
	<h2 style='color: red'><%=fun()%></h2>
	<h3>
		Random number :
		<%=n%></h3>


</body>
</html>