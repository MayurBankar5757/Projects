<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        
<%@page import="org.hibernate.Query"%>
<%@page import="com.connection.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.model.*"%>
<%@page import="java.util.*" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="all_css.html" %>
<br><br>
<div class="container w-50 text-center">

<table class="table table-bordered bg-info text-white " style="width:700px;font-weight:bold">
<h3 class="text-success text-center">All Blogs</h3>
<thead>
<tr>
<th>Blog Titile</th>
<th>Author</th>
<th>Description</th>
<th colspan=2>Action</th>
</tr>
</thead>
<%
Session session1 = FactoryProvider.getFactory().openSession();
Query q = session1.createQuery("from Blog");

List<Blog> list = q.list();

for(Blog b : list)
{
%>
<tbody>
<tr>
<td><%=b.getTitle()%></td>
<td><%=b.getAuthor() %></td>
<td><%=b.getDescription() %></td>
<td><a href="edit.jsp?id=<%=b.getBlogid()%>" >Edit</a></td>
<td><a href="DeleteServlet?id=<%=b.getBlogid() %>" >Delete</a></td>

</tr>
</tbody>
<%	
}
%>
</table>
</div>
</body>
</html>