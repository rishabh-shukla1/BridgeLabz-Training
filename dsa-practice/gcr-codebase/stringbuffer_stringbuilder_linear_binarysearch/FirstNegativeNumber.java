package stringbuffer_stringbuilder_linear_binarysearch;

public class FirstNegativeNumber {
	
	 public static void main(String[] args) {

	        int[] arr = {5, 3, 2, -7, 8, -1};
	        int ind = -1;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] < 0) {
	                ind = i;
	                break;
	            }
	        }

	        System.out.println(ind);
	    }

}
