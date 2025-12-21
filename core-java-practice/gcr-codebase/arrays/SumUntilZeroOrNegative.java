package array;

import java.util.*;

public class SumUntilZeroOrNegative {
	
	 public static void main(String[] args) {

	        Scanner kb = new Scanner(System.in);

	        // Define array 
	        double[] number = new double[10];
	        //ToStore sum to zero 
	        
	        double total = 0.0;

	      
	        int ind = 0;

	        // While loop Infinite
	        while (true) 
	        {

	            System.out.print("Enter a number:-");
	            
	            double num = kb.nextDouble();

	            // Break if num 0 or negative
	            if (num <= 0) 
	            {
	                break;
	            }

	            //Break if the index is 10
	            if (ind == 10) {
	                break;
	            }

	           
	            number[ind] = num;
	            
	            ind++;
	        }

	        // Display stored number and calculate total sum
	        
	        System.out.println("Stored Numbers:-");
	        
	        for (int i = 0; i < ind; i++)
	        {
	            System.out.println(number[i]);
	            
	            total = total + number[i];
	        }

	        // Display total
	        
	        System.out.println("Total Sum = " + total);

	        kb.close();
	    }

}
