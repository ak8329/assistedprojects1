package sort;

	import java.util.Arrays;
	public class Exponentialsearch {
		public static  void main(String[] args){

		    int[] arr = {6,12,18,24,32};
		    int len= arr.length;
		    int value = 18;
		    int r = exponentialSearch(arr,len,value);

		    if(r<0){

		       System.out.println( "Element is not present in the array");

		    }else {

		        System.out.println( "Element is  present in the array at index :"+r);
		    }

		        }

		        public static int exponentialSearch(int[] arr ,int len, int value ){

		        if(arr[0]==value){
		            return 0;
		            }
		        int i=1;
		        while(i<len && arr[i]<=value){

		            i=i*2;
		        }
		        return Arrays.binarySearch(arr,i/2,Math.min(i,len),value);
		        }


	}


