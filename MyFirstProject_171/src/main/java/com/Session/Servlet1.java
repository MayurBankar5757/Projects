package com.Session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uName = request.getParameter("uName");
		String pass = request.getParameter("password");
		HttpSession session = request.getSession();
		session.setAttribute("name", uName);
		
		out.println("<h1>Welcome</h1>");
		out.println("<a href='Servlet2'>Go to servlet 2</a>");
		
	}

}
