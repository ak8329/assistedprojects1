
	import java.util.Scanner;
	public class Array {
	    public static void main(String args[]) {
	        Scanner scanner = new Scanner(System.in);
	        int[] array = new int[50];
	        int sum = 0, n;
	        System.out.println("Enter the limit of the array:");
	        n = scanner.nextInt();
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }
	        scanner.close();
	        for (int num: array) {
	            sum = sum + num;
	        }
	        System.out.println("Sum of the elements in the array:" + sum);
	    }
	}

