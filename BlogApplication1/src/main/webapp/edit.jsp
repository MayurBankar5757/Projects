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
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ include file="all_css.html" %>
<%
int id = Integer.parseInt(request.getParameter("id"));
Session session1 = FactoryProvider.getFactory().openSession();
Blog b = session1.get(Blog.class,id);
%>

<br><br>
<div class="container w-50 ">
<form action="UpdateServlet" method="POST">

 <div class="form-group">
   
     <input type="hidden" 
           class="form-control" 
           id="bid" 
           value=<%=b.getBlogid()%>
           name="blogid"
           >
  </div>

  <div class="form-group">
     <label for="title">Blog Title</label>
     <input type="text" 
           class="form-control" 
           id="title" 
           value = <%= b.getTitle() %>
           name="title"
           >
  </div>
  <div class="form-group">
     <label for="title">Blog Author</label>
     <input type="text" 
           class="form-control" 
           id="author" 
           value = <%= b.getAuthor()%>
           name="author"
           >
  </div>
  <div class="form-group">
   <label for="description"> Blog Description:-</label>
   
    <textarea 
				name="description"
				required 
				id="description"
				class="form-control" 
				style="height: 300px;"		
					><%=b.getDescription()%>
	</textarea>
  </div>
 
 <div class="container text-center">
  <button type="submit" class="btn btn-success">Update Blog</button>
  </div>
</form>




</div>

</body>
</html>