package programming_elements;

import java.util.Scanner;

public class KmToMiles {
	
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        // Variable to store distance in kilometers
	        double kilom;

	        // value from the user
	        System.out.print("Enter distance in kilometers: ");
	        kilom = input.nextDouble();

	        
	        // calculation
	        double miles = kilom / 1.6;

	        // Displaying the final result
	        System.out.println("The total miles is " + miles + 
	                           " mile for the given " + kilom + " km");
	        
	        input.close();

	      
	    }
	
	

}
