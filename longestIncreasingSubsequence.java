     import java.util.*;
	public class longestIncreasingSubsequence {
	static int CeilIndex(int A[], int l, int r, int key)
	{
	int m;
	while( r - l > 1 ) {
	m = l + (r - l)/2;
	if(A[m] >= key )
	r = m;
	else
	l = m;
	}
	return r;
	}
	static int LongestIncreasingSubsequenceLength(int A[], int size) {
	int[] tailTable = new int[size];
	int len;
	for(int i=0;i<size;++i)
	tailTable[i] = 0;
	tailTable[0] = A[0];
	len = 1;
	for( int i = 1; i < size; i++ ) {
	if( A[i] < tailTable[0] )
	tailTable[0] = A[i];
	else if( A[i] > tailTable[len-1] )
	tailTable[len++] = A[i];
	else
	tailTable[CeilIndex(tailTable, -1, len-1, A[i])] = A[i];
	}
	return len;
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Input num");
	int N = sc.nextInt();
	int[] arr = new int[N];
	System.out.println("Enter the Input Array");
	for(int i=0;i<N;++i)
	arr[i] = sc.nextInt();
	System.out.println("The Longest Increasing Subsequence is " +
	LongestIncreasingSubsequenceLength(arr, N));
	}
}