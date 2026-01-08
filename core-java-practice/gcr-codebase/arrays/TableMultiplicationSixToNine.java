package arrays;

import java.util.*;
public class TableMultiplicationSixToNine {
	
	 public static void main(String[] args) {

	        Scanner kb = new Scanner(System.in);

	        // User integer input
	        System.out.print("Enter a number: ");
	        
	        int number =kb.nextInt();

	        // Define  array 
	        int[] result = new int[4];

	        // Index for iterating in arary
	        int ind = 0;
	        //calculation
	        for (int i = 6; i <= 9; i++) {
	        	
	            result[ind] = number * i;
	            ind++;
	        }

	        //Display result
	        System.out.println("Multiplication Table of ");
	        
	        ind = 0;
	        for (int i = 6; i <= 9; i++)
	        {
	            System.out.println(number + " * " + i + " = " + result[ind]);
	            
	            ind++;
	        }

	        kb.close();
	    }


}
