<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String u = request.getParameter("UName");
String p = request.getParameter("password");
String e = request.getParameter("email");
response.sendRedirect("https://avatars.githubusercontent.com/u/117765637?v=4");


%>

<h3>User Name : <%=u %></h3>
<h3>Password : <%=p %></h3>
<h3>Email id : <%=e %></h3>

</body>
</html>