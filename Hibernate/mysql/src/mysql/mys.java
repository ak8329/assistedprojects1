package df;
import java.sql.*;

public class mys {
	 public static void main(String[] args) 
	 {
		try
		{
			Class.forName("com.mysql.cj.jdbc.driver");
		    {
			      System.out.println("working");
			    }
			
		} catch(Exception e)
	    {
			System.out.println("w");
	    }
		
		
	 }

}
