package control_flow;
import java.util.*;
public class HarshadNumber {
	
	 public static void main(String[] args) {

	        Scanner kb = new Scanner(System.in);

	        //  User integer input
	        System.out.println("Enter the number-:");
	        
	        int number = kb.nextInt();

	        
	        int sum = 0;
	        int originalNumb = number;

	       
	        while (originalNumb != 0) {

	            // Get last digit
	            int digit = originalNumb % 10;

	            // Add digit to sum
	            sum = sum + digit;

	            // Remove last digit
	            originalNumb = originalNumb / 10;
	        }

	        // Check  condition
	        
	        if (sum != 0 && number % sum == 0)
	        {
	            System.out.println(number + "->is Harshad Number");
	            
	        }
	        else 
	        {
	            System.out.println(number + "->is not Harshad Number");
	        }

	        kb.close();
	    }

}
