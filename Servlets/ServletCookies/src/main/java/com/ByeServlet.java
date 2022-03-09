package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ByeServlet
 */
@WebServlet("/ByeServlet")
public class ByeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ByeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//getting cookies
		
		String name = null;
		
		Cookie[] cookies=request.getCookies();
		
		PrintWriter out = response.getWriter();
		
		boolean f=false;
		
		if(cookies == null) {
			
			out.println("You are a new user..register your name!");
			return;
			
		}
		
		else {
			
			for(Cookie c: cookies) {
				String cname=c.getName();
				if(cname.equals("user_name")){
					f=true;
					name=c.getValue();
					}
			}
			
		}
		if(f) {
			out.println("<h1>Bye .. !! "+name+"</h1>");
			
		}
		else {
			out.println("Not existed user..");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
