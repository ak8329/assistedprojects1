import java.util.Scanner;
public class cls {
	    /* lis() returns the length of the longest
	       increasing subsequence in arr[] of size n */
	    static int lis(int arr[], int n)
	    {
	        int lis[] = new int[n];
	        int i, j, max = 0;
	 
	        /* Initialize LIS values for all indexes */
	        for (i = 0; i < n; i++)
	            lis[i] = 1;
	 
	        /* Compute optimized LIS values in
	           bottom up manner */
	        for (i = 1; i < n; i++)
	            for (j = 0; j < i; j++)
	                if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
	                    lis[i] = lis[j] + 1;
	 
	        /* Pick maximum of all LIS values */
	        for (i = 0; i < n; i++)
	            if (max < lis[i])
	                max = lis[i];
	 
	        return max;
	    }
	 
	    public static void main(String args[])
	    {
	    	int n;
	    	int[] a = new int[10];
	    	Scanner sc = new Scanner(System.in);
	    	n=sc.nextInt();
	    	for(int i=0;i<n;i++)
	    	{
	    		a[i]=sc.nextInt();
	    	}
	       System.out.println("Length of lis is " + lis(a, n) + "\n");
	       sc.close();
	    }
	}


