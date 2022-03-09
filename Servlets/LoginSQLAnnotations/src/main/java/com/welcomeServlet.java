package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class welcomeServlet
 */
@WebServlet("/details")
public class welcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public welcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int lid=Integer.parseInt(request.getParameter("id"));
		String lname = request.getParameter("name");
		String ldate = request.getParameter("date");
		String lcity = request.getParameter("city");
		
		ServletContext context = getServletContext();
		String driver = context.getInitParameter("driver");
		String url = context.getInitParameter("url");
		String sqlname=context.getInitParameter("sqlname");
		String pwd=context.getInitParameter("sqlpwd");
		
		Connection con=null;
		PreparedStatement pst = null;
		Statement st ;
		ResultSet rs ;
		
		try {
		Class.forName(driver);
		con = DriverManager.getConnection(url,sqlname,pwd);
		pst = con.prepareStatement("INSERT INTO LoginUsers VALUES(?,?,?,?)");
		
		pst.setInt(1, lid);
		pst.setString(2, lname);
		pst.setString(3, ldate);
		pst.setString(4, lcity);
		pst.executeUpdate();
		
		st =con.createStatement();
		
		rs =  st.executeQuery("SELECT * FROM LoginUsers");
		
		while(rs.next()) {
			out.println("<table style='border: 2px solid black' ><tr><td>"
		+rs.getInt(1)+"</td><td>"
					+rs.getString(2)+"</td><td>"
		+rs.getString(3)+"</td><td>"
					+rs.getString(4)+"</td></tr></table>");
			}
		
		}
		catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	private void setString(int i, String lname) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
