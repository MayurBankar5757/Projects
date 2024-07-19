<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ include file="all_css.html" %>

<br><br>
<div class="container w-50">
<form action="AddBlog" method="POST">
  <div class="form-group">
     <label for="blogname">Blog Title</label>
     <input type="text" 
           class="form-control" 
           id="blogname" 
           placeholder="Enter blog title"
           name="title"
           >
  </div>
  
  <div class="form-group">
     <label for="author">Author</label>
     <input type="text" 
           class="form-control" 
           id="author" 
           placeholder="Enter Author"
           name="author"
           >
  </div>
  
  <div class="form-group">
   <label for="content"> Blog Description:-</label>
   
    <textarea 
				name="description"
				required 
				id="content"
				placeholder="Enter your content here"				 
				class="form-control" 
				style="height: 300px;"		
					>
	</textarea>
  </div>
  
  
 <br>
 <br>
 <div class="container text-center">
  <button type="submit" class="btn btn-success">Add new Blog</button>
  </div>
</form>



</div>


</body>
</html>