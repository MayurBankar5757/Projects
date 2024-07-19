package com.RequestDispacher;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/register1")
public class RegisterServlet extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String condition = request.getParameter("condition");
		
		if (condition == null) {
			RequestDispatcher rd = request.getRequestDispatcher("Form.html");
			rd.include(request,response);
			out.println("<h2 style='text-align:center; color:red'>You are not select terms and conditions</h2>");
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("success");
			rd.forward(request, response);
		}
	}

}
