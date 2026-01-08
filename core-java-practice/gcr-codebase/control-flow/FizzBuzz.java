package control_flow;
import java.util.*;

public class FizzBuzz {
	 public static void main(String[] args) {

	        Scanner kb = new Scanner(System.in);
             // Take the number from the user
	        
	        System.out.print("Enter a positive integer:-");
	        
	        int  number = kb.nextInt();

	        // Check for positive integer
	        if (number <= 0) {
	        	
	            System.out.println("Please enter a valid positive integer");
	            
	        }
	        else {

	            for (int value = 1; value <= number; value++) {

	                if (value % 3 == 0 && value % 5 == 0)
	                {
	                    System.out.println("FizzBuzz");
	                    
	                } 
	                else if (value % 3 == 0) {
	                	
	                    System.out.println("Fizz");
	                } 
	                else if (value % 5 == 0) {
	                	
	                    System.out.println("Buzz");
	                    
	                } 
	                else {
	                	
	                    System.out.println(value);
	                }
	            }
	        }

	        kb.close();
	    }

}
