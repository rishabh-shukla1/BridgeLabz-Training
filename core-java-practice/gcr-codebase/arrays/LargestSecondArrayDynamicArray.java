package array;

import java.util.*;


public class LargestSecondArrayDynamicArray
{
	 public static void main(String[] args) 
	 {

	        Scanner kb = new Scanner(System.in);

	        // user input
	        System.out.print("Enter a number: ");
	        int number = kb.nextInt();
			// handle negative number
	        if (number < 0)
	        {
	            number = Math.abs(number); 
	        }

	        // Define array and size
	        int maxDigit = 10;
	        
	        int[] digits = new int[maxDigit];
	        
	        int ind = 0;

	       
	        while (number != 0) {

	            // If array is full, increase size by 10
	            if (ind == maxDigit) {
	            	
	                maxDigit = maxDigit + 10;
	                //New array initilase
	                
	                int[] t = new int[maxDigit];

	              
	                for (int i = 0; i < ind; i++)
	                {
	                    t[i] = digits[i];
	                }
					// reassign
	                digits = t; 
	            }
	           // last digit taken
	            digits[ind] = number % 10; 
	            number = number / 10; // remove last digit
	            ind++;
	        }

	        
	        int largest = 0;
	        
	        int secondLargest = 0;

	        // Find 
	        for (int i = 0; i < ind; i++) 
	        {

	            if (digits[i] > largest)
	            {
	                secondLargest = largest;
	                largest = digits[i];
	            } 
	            else if (digits[i] > secondLargest && digits[i] != largest)
	            {
	                secondLargest = digits[i];
	            }
	        }

	        // Display 
	        
	        System.out.println("Largest digit-: " + largest);
	        System.out.println("Second largest-: " + secondLargest);
            
	        
	        //Scanner close
	        
	        kb.close();
	    }
	}
	