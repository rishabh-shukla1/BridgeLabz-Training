package arrays;

import java.util.*;
public class TwoDToOneDArray {
	 public static void main(String[] args) {

	        Scanner kb= new Scanner(System.in);

	        // User input for rows 
	        
	        System.out.print("Enter number of rows:-");
	        int rows = kb.nextInt();
	        
	        // User input for Column
	        System.out.print("Enter number of columns:-");
	        
	        int columns = kb.nextInt();

	        // Define 2D array 
	        int[][] mat = new int[rows][columns];

	        // User Input 2D array
	        System.out.println("Enter elements of the matrix:-");
	        
	        for (int i = 0; i <rows; i++) 
	        {
	            for (int j = 0; j <columns; j++) 
	            {
	            	// User Input
	                mat[i][j] = kb.nextInt();
	                
	            }
	        }

	        // Define 1-d Array of Same Size
	        int[] array = new int[rows * columns];
	        
	        int ind = 0;

	       // Copy Elements from one-d to 2-d array
	        for (int i = 0; i <rows; i++) 
	        {
	            for (int j = 0; j <columns; j++)
	            	
	            {
	                array[ind] = mat[i][j];
	                ind++;
	            }
	        }

	        // Display
	        System.out.println("1D Array Elements:");
	        
	        for (int i = 0; i < array.length; i++) 
	        {
	        	
	            System.out.print(array[i] + " ");
	        }

	        kb.close();
	    }
	


}
