package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connection.FactoryProvider;
import com.model.Blog;
public class AddBlog extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();

	    String name = request.getParameter("title");
	    String author = request.getParameter("author");
	    String content = request.getParameter("description");
	    
	    // Create a new blog object and set its attributes
	    Blog b1 = new Blog();
	    b1.setTitle(name);
	    b1.setAuthor(author);
	    b1.setDescription(content);
	    out.println("THe Blog is "+b1.getAuthor() + " " + b1.getDescription()+ " " + b1.getTitle());
	    
	    // Get a Hibernate session
	    Session session = FactoryProvider.getFactory().openSession();
	    Transaction tx =   session.beginTransaction();
	    session.save(b1);
	      tx.commit();
	        response.sendRedirect("showallblog.jsp");

	      
	  
	 	   

	}

}
