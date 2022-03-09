package Com.Sai;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServlet
 */
//@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		ServletConfig config = getServletConfig();
		String s1=config.getServletName();
		String s =config.getInitParameter("servletName");
		out.println("<h1>"+s+"</h1>");
		out.println("<h1>"+s1+"</h1><hr>");
		
		ServletContext sc=getServletContext();
		String driver=sc.getInitParameter("driver");
		out.println("<b>Servlet context :"+driver+"</b>");
		
		
		if(username.equals(password)) {
			out.println("<h3><i><b>Welcome</b></i><h3>");
			response.sendRedirect("welcomeServlet");
		}
		else {
			out.println("Invalid credentials");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
