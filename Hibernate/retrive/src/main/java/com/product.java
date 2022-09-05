package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class product
 */
public class product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public product() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	    Scanner sc=new Scanner(System.in);
		//PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "Vishnumahi123@");
		PreparedStatement pmst = con.prepareStatement("select * from st");
		System.out.println("Enter the id");
		int id= sc.nextInt();
		pmst.setFloat(1,id);
		ResultSet rs = pmst.executeQuery();
		while(rs.next()) {
		System.out.println("id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
	    System.out.println("id is "+rs.getInt("id")+" Name is "+rs.getString("name")+" Salary is "+rs.getFloat("salary"));
		System.out.println("name is "+rs.getString(2));
		}
		sc.close();
		pmst.close();		
		con.close();
		}
				 
	catch (Exception e) 
	{
					System.out.println(e);
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
