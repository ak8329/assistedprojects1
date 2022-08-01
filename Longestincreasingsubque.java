
 import java.util.*; 
	 
	public class Longestincreasingsubque
	{ 
	 	static int longestincreasesubsequence(int a[], int b) 
	 	{ 
	 	      int c[] = new int[b]; 
	 	      int i;  	      int j;  	      int k = 0;  	    
	 	      for (i = 0; i < b; i++)  	        
	 	    	  c[i] = 1;  	      
	 	      for (i = 1; i < b; i++)  	        
	 	    	  for (j = 0; j < i; j++)  	         
	 	    		  if (a[i]<a[j] && c[i] < c[j] + 1)  	          
	 	    			  c[i] = c[j] + 1;  	     
	 	      for (i = 0; i < b; i++)  	        
	 	    	  if (k < c[i])  	         
	 	    		  k= c[i]; 
	 	      return k; 
	 	   } 
	 
	 	public static void main(String[] args) { 
	 	 	 
	 	 	Scanner sc = new Scanner(System.in); 
	 	 	System.out.println("Enter number of elements in an array"); 
	 	 	int b = sc.nextInt();  	 	int[] a = new int[b]; 
	 	 	System.out.println("Enter the Array"); 
	 	 	for(int i=0;i<b;++i)  	 	 a[i] = sc.nextInt(); 
	 	    System.out.println("The length of the longest increasing subsequence is " +longestincreasesubsequence(a,b)); 
	 	 	 
	 	} 
	} 



