<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>calculation</h1>
	<%
	int n = 10;
	int a =12;
	int c = 15;
	
	int cube1 = (int) Math.pow(n,3);
	int cube2= (int) Math.pow(a,3);
	int cube3 = (int) Math.pow(c,3);
	if(n>a){
		out.println("greater number is "+n);
	}
	else if (a>c){
		out.println("greater number is "+a);
	}else
	{
		out.println("greater number is "+c);
	}
	%>
	<h2>cube of first number  <%=cube1 %></h2>
	<h2>cube of second number <%=cube2 %></h2>
	<h2>cube of third number <%=cube3 %></h2>
</body>
</html>