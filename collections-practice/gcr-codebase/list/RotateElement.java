package list;

import java.util.*;

public class RotateElement {
	
	public static void reverse(List<Integer> list,int left , int right) 
	{
	       
	        while (left < right) 
	        {
	            int temp = list.get(left);
	            list.set(left, list.get(right));
	            list.set(right, temp);

	            left++;
	            right--;
	        }
	    }
	
	 public static void rotateLeft(List<Integer> list, int k) {
	        int n = list.size();
	        k = k % n;   

	        reverse(list, 0, k - 1);
	        reverse(list, k, n - 1);
	        reverse(list, 0, n - 1);
	    }

	
	public static void main(String args[]) {
		
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        int k = 2;

        rotateLeft(list, k);
        
        System.out.println("Rotated List: " + list);
		
	}
	

}


