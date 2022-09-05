package com;

import java.io.IOException;
import java.io.PrintWriter;

import hpexam.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class productcontroller
 */
public class productcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 	PrintWriter pw = response.getWriter();
	response.setContentType("text/html");
	int pno = Integer.parseInt(request.getParameter("pno"));
	String pname = request.getParameter("pname");
	int price= Integer.parseInt(request.getParameter("price"));
	Product  p = new Product();
	p.setPno(pno);
	p.setPname(pname);
	p.setPrice(price);
	
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		public int storeProduct( Product p) {
			try {
				Configuration con = new Configuration();
				con.configure("hibernate.cfg.xml");
				SessionFactory sf = con.buildSessionFactory();
				Session session = sf.openSession();
				Transaction tran = session.getTransaction();
				PrintWriter pw = response.getWriter();
				response.setContentType("text/html");
				int pno = Integer.parseInt(request.getParameter("pno"));
				String pname = request.getParameter("pname");
				int price= Integer.parseInt(request.getParameter("price"));
				Product  p = new Product();
				p.setPno(pno);
				p.setPname(pname);
				p.setPrice(price);
				
				tran.begin();
						session.save(p);
				tran.commit();
				return 1;
			} catch (Exception e) {
				System.out.println(e);
				return 0;
		RequestDispatcher rd = request.getRequestDispatcher("productjsp.jsp");
		rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
