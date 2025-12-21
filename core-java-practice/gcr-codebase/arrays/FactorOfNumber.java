package array;
import java.util.*;

public class FactorOfNumber {
	 public static void main(String[] args) {

	        Scanner kb = new Scanner(System.in);

	        //User Input
	        System.out.print("Enter a number:-");
	        
	        int number = kb.nextInt();

	        if (number <= 0) {
	        	
	            System.out.println("Please enter a positive integer.");
	            System.exit(0);
	        }

	       
	        int maxFactor = 10;
	        //Define Array
	        
	        int[] factors = new int[maxFactor];
	        
	        int ind = 0;

	        // Find factor
	        for (int i = 1; i <= number; i++) {

	            if (number % i == 0) {

	                
	                if (ind == maxFactor) {
	                	
	                    maxFactor = maxFactor * 2;
	                    
	                    int[] temp = new int[maxFactor];
                       for (int j = 0; j < ind; j++)
                       {
	                        temp[j] = factors[j];
	                        
	                    }

	                    factors = temp;
	                }

	                factors[ind] = i;
	                ind++;
	            }
	        }

	        // Display 
	        System.out.println("Factors -:");
	        
	        for (int i = 0; i < ind; i++) 
	        {
	            System.out.print(factors[i] + " ");
	        }

	        kb.close();
	    }

}
