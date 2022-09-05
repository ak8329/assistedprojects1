package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginapp
 */
public class loginapp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginapp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("servelt added");
	     String str = request.getParameter("uname");
	     String pd = request.getParameter("passcode");
		PrintWriter pw = response.getWriter();
		if(str.equalsIgnoreCase("krishna@gmail.com") && pd.equals("root@13"))
		{
		   pw.println("welocome servelt login");
		   System.out.println("a href=logout>logout</a>");
		}
		else
			pw.println("failed login");
		    System.out.println("a href=logout>logout</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("servelt added");
	     String str = request.getParameter("uname");
	     String pd = request.getParameter("passcode");
		PrintWriter pw = response.getWriter();
		if(str.equalsIgnoreCase("krishna") && pd.equals("root@13"))
		pw.println("welocome servelt post login");
		else
			pw.println("failed post login");
	}

	}


