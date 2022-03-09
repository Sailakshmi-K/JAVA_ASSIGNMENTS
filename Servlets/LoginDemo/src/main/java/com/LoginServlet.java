package com;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if(username.equals(password)) {
			res.sendRedirect("home.html");
			
		} else {
			res.getWriter().println("Invalid Login Credentials");
		}
		
	}

}
