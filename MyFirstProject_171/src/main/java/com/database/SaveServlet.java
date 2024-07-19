package com.database;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

@WebServlet("/Saveservlet")
public class SaveServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uName = request.getParameter("uname");
		String pass = request.getParameter("password");
		String email = request.getParameter("email");
		
		try {
			Connection con = DBcollection.getConnection();
			String query = "insert into student values(?,?,?)";
			PreparedStatement st = con.prepareStatement(query);
			st.setString (1,uName);
			st.setString(2,pass);
			st.setString(3,email);
			int rowcount = st.executeUpdate();
			if(rowcount>0) {
				RequestDispatcher rd = request.getRequestDispatcher("Newuser.html");
				rd.include(request,response);
				out.println("<h3 style='text-align:center'>User Registered Succesfully</h3>");
			}
			
		}
		catch( Exception e) {
			e.printStackTrace();
			
		}
	}

}
