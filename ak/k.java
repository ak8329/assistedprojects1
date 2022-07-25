package ak;

	import java.io.File;
	import java.io.IOException;
	import java.util.Scanner;
	public class k {
	   public static void main(String[] args) throws IOException 
	   {
	   Scanner sc = new Scanner(new File("C:\Users\Atla Venkat\eclipse-workspace\practiceproject\'s"
	   		+ "rc\\k.txt"));
	      String input;
	      StringBuffer sb = new StringBuffer();
	      while (sc.hasNextLine()) {
	         input = sc.nextLine();
	         sb.append(" "+input);
	      }
	      System.out.println("Contents of the file are: "+sb.toString());
	   }
	}

