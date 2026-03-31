package programming_elements;

import java.util.*;
public class PowerCalculation {
	 public static void main(String[] args) {
		 
	        Scanner kb = new Scanner(System.in);

	        //Input base value
	        
	        System.out.print("Enter the base number:-");
	        
	        double base = kb.nextDouble();

	        //Input exponent value
	        
	        System.out.print("Enter the exponent:-");
	        double exponent = kb.nextDouble();

	       
	        double result = Math.pow(base, exponent);

	     
	        System.out.println("Result:-" + result);

	        kb.close();
	    }

}
