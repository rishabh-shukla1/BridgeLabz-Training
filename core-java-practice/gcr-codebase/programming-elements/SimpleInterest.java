package programming_elements;

import java.util.*;
public class SimpleInterest {
	
	 public static void main(String[] args) {
		 
	        Scanner kb= new Scanner(System.in);

	        // Input principal 
	        System.out.print("Enter the principal amount: ");
	        double principalAmount = kb.nextDouble();

	        // Input rate of interest
	        System.out.print("Enter the rate of interest: ");
	        double rateInterest = kb.nextDouble();

	        // Input time 
	        System.out.print("Enter the time (in years): ");
	        
	        double timePeriod = kb.nextDouble();

	        // Calculate 
	        
	        double simpleInterest =(principalAmount * rateInterest * timePeriod) / 100;

	    
	        System.out.println("Simple Interest is:-" + simpleInterest);

	        kb.close();
	    }
	

}
