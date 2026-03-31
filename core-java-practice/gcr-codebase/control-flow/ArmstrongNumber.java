package control_flow;
import java.util.*;
public class ArmstrongNumber {
	 public static void main(String[] args) {

	        Scanner kb = new Scanner(System.in);
	        
	       // User Input

	        System.out.println("Enter the number-:");
	        int number =kb.nextInt();

	        
	        int sum = 0;
	        // original number
	        int originalNum =number;
	        while (originalNum != 0) {

	            // Get last digit
	            int digit = originalNum% 10;

	            // Find cube 
	            sum = sum + (digit * digit * digit);

	            //Remove last digit
	            originalNum = originalNum / 10;
	        }

	        //Compare sum with original
	        
	        if (sum == number) 
	        {
	            System.out.println(number+ "is an Armstrong Number");
	            
	        } 
	        else
	        {
	            System.out.println(number+ "is not an Armstrong Number");
	        }

	        kb.close();
	    }

}
