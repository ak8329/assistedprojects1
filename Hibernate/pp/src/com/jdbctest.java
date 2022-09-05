package com;
import java.sql.*;

public class jdbctest {
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.driver");
			System.out.println("loaded");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
