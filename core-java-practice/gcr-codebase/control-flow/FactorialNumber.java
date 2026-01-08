package control_flow;
import java.util.*;
public class FactorialNumber {
	
	 public static void main(String[] args) {

	        Scanner kb = new Scanner(System.in);

	        // Take input from user
	        System.out.println("Enter the Number-:");
	        
	        int number = kb.nextInt();

	        // Check if the number is positive
	        if (number < 0)
	        {
	            System.out.println("Please enter a positive integer");
	            
	        }
	        else {
                //answer
	            int ans = 1;
	            int i = 1;

	            // Calculate factorial using while loop
	            while (i <= number) 
	            {
	                ans = ans * i;
	                i++;
	            }

	           
	            System.out.println("Factorial of " + number + " is " + ans);
	        }

	        kb.close();
	    }

}
