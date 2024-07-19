package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uName = request.getParameter("uname");
		String pass = request.getParameter("password");
		String email = request.getParameter("email");
		
		out.println("<h1 Style='color : green'>Thanks for Registration</h1>");
		out.println("<h2>User Name :" + uName +"</h2>");
		out.println("<h2>Password :" + pass +"</h2>");
		out.println("<h2>Email :" + email +"</h2>");

		
		
	}

}
