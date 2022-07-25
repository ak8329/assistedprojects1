package ak;

public class trycatchthrowfinal {
		   public static void validate_Age(int a ,int b) {
		     //try block 
		     try{  
		    	 int age=a/b;
		     
		    	  if(age<18)  
		    	      throw new ArithmeticException("Not eligible to vote and drive!!");  
		    	     else   //print the message
		    	      System.out.println("Eligible to vote and drive!!"); 
		     }
		      catch(ArithmeticException e){
		          System.out.println("::Catch block::");
		         System.out.println("ArithmeticException::Number divided by zero");
		      }  
		      //finally block
		      finally{
		          System.out.println("::Finally block::");
		      }  
		      System.out.println("Rest of the code continues...");  
		   }   
		

	   public static void main(String args[]){  
	      //call validate_Age method
	      validate_Age(125,5);  
	      System.out.println("rest of the code...");  
	  }  
	}