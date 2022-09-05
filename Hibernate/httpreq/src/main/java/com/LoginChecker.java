package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginChecker
 */
@WebServlet("/LoginChecker")
public class LoginChecker extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginChecker() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
				// TODO Auto-generated method stub
				String uname = request.getParameter("txtUname");
				String pd = request.getParameter("txtPassword");
				PrintWriter out = response.getWriter();
				if (uname.equalsIgnoreCase("8329@gmail.com") && pd.equals("abc123")) {
				out.println("You are Welcome to this page");
				} else
				out.println("Invalid Username or Password");
				}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		String uname = request.getParameter("txtUname");
		String pword = request.getParameter("txtPassword");
		PrintWriter out = response.getWriter();
		RequestDispatcher rd;
		if (uname.equalsIgnoreCase("8329@gmail.com") && pword.equals("abc123")) {
		HttpSession session = request.getSession(true);
		session.setAttribute("username", uname);
		rd = request.getRequestDispatcher("Welcome");
		rd.forward(request, response);
		} else {
		out.println("Invalid UserID or Password");
		rd = request.getRequestDispatcher("index.html");
		rd.include(request, response);
		}
		
		
	}

}
