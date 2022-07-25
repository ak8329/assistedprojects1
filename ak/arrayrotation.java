package ak;

 public class arrayrotation {

		public void rotate(int[] nums, int k) {
		    		if(k > nums.length) 
		       			k=k%nums.length;
		 		int[] result = new int[nums.length];
		 		for(int i=0; i < k; i++){
		        			result[i] = nums[nums.length-k+i];
		 		}
		 		
		 	
		 		System.arraycopy( result, 0, nums, 0, nums.length );
		}
			public static void main(String[] args) {
				arrayrotation r = new arrayrotation();
		        		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
		        		r.rotate(arr, 5); 
		        		for(int i=0;i<arr.length;i++){
		            			System.out.print(arr[i]+" ");
		        		}
			}
		}



