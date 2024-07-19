package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class FirstServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Welcome to my FirstServlet</h1>");
		out.println("<a href ='/'>Go to home page</a>");
		out.println("<a href ='SecondServlet'>Go to second servlet</a>");
		out.println("<a href ='ThirdServlet'>Go to third servlet</a>");

	}

}
