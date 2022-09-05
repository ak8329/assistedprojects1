package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class demo
 */
public class demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw=response.getWriter();
		HttpSession hs=request.getSession();
		pw.println("<br/> Session id"+hs.getId());
		int count=0;
		if(hs.isNew())
		{
			pw.println("<br/> New Client");
		}
		else
		{
			pw.println("<br/>old Client");
		}
		pw.println("<br/> Session Creation time "+hs.getCreationTime());
		pw.println("<br/> Session Creation time "+ new Date(hs.getCreationTime()));
		pw.println("<br/> Session last aces time "+new Date(hs.getLastAccessedTime()));
		pw.println("<br/> Session default time "+hs.getMaxInactiveInterval());
		hs.setMaxInactiveInterval(600);
		pw.println("<br/> Session default time "+hs.getMaxInactiveInterval());
		count++;
		if(count%5==0)
		{
			hs.invalidate();
		}
       pw.println("<br/> count "+count);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
