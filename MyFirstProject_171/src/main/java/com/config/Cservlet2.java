package com.config;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Cservlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		ServletConfig config = getServletConfig();
		String info = config.getInitParameter("Kiran sir");
		
		ServletContext context = getServletContext();
		 String info1= context.getInitParameter("Driver");
		out.println("<h1>Config object info : "+info +"</h1>");
		out.println("<h1>Context object info : "+info1 +"</h1>");

		
	}

	

}
