package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connection.FactoryProvider;
import com.model.Blog;
public class DeleteServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();

	    int id = Integer.parseInt(request.getParameter("id"));
	   
	    
	    // Create a new blog object and set its attributes
	   
	    
	    // Get a Hibernate session
	    Session session = FactoryProvider.getFactory().openSession();
	    Blog b1 = session.get(Blog.class, id);
	    session.delete(b1);
           
	    Transaction tx = session.beginTransaction();
	    tx.commit();
	    response.sendRedirect("showallblog.jsp");
	}

}
