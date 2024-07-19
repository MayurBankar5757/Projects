package com.RequestDispacher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/success")
public class SuccessServlet extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String u = request.getParameter("uname");
		String p = request.getParameter("password");
		String e = request.getParameter("email");
		String c = request.getParameter("courses");
		String g = request.getParameter("gender");
		
		out.println("<h2 style='color:green'>Thanks for Registration</h2>");
		out.println("<h2>User Name : " +u +"</h2>");
		out.println("<h2>Password : " +p +"</h2>");
		out.println("<h2>Email id  : " +e +"</h2>");
		out.println("<h2>gender : " +g +"</h2>");
		out.println("<h2> course : " +c +"</h2>");


		
		
	
	}

}
