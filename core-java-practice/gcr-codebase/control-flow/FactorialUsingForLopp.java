package control_flow;

import java.util.Scanner;

public class FactorialUsingForLopp {
	
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
	            

	            // Calculate factorial using while loop
	            for (int i = 1; i <= number; i++)
	            {
	                ans = ans * i;
	            }

	           
	            System.out.println("Factorial of " + number + " is -:" + ans);
	        }

	        kb.close();
	    }

}
