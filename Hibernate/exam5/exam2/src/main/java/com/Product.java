package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Product
 */
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

        Connection con=null;
        response.setContentType("text/html");
		try {
			//Call Connection Method
				PrintWriter out=response.getWriter();
				String id = request.getParameter("id");
			Class.forName("com.mysql.cj.jdbc.Driver");  

	            con= DriverManager.getConnection("jdbc:mysql://localhost/sample","root","Vishnumahi123@"); 
					

				String str="select * from st where id="+id;
				java.sql.Statement stmt = con.createStatement();
				ResultSet ans = stmt.executeQuery(str);
				if(ans.next()) {
					out.println("<table border=2>");
					out.println("<tr><th>ID</th><th>Name</th><th>income</th></tr>");
					out.println("<tr>");
					out.print("<td>"+ans.getInt("ID")+"</td>");
					out.print("<td>"+ans.getString("name")+"</td>");
					out.print("<td>"+ans.getInt("income")+"</td>");
					out.println("</tr>");
					out.println("</table>");
				}
				else {
				out.println("No records found!");
				con.close();
			
			}catch(Exception e) {
				e.printStackTrace();
			}		
	}

				//get ResultSet

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
