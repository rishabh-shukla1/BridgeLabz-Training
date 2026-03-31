package programming_elements;

import java.util.*;
public class DoubleOperations {
	
	 public static void main(String[] args) {

	       
	        Scanner kb = new Scanner(System.in);

	       // first input
	        
	        System.out.print("Enter value of a: ");
	        
	        double a = kb.nextDouble();
            // second input
	        
	        System.out.print("Enter value of b: ");
	        
	        double b = kb.nextDouble();
            // third input
	        
	        System.out.print("Enter value of c: ");
	        
	        double c = kb.nextDouble();

	        //calcultaion
	        double r1 = a + b * c;
	        double r2 = a * b + c;
	        double r3 = c + a / b;
	        double r4 = a % b + c;

	   
	        System.out.println("The results of Double Operations are " +r1 + ", " + r2 + ", " + r3 + ", and " + r4);
	        kb.close();
	    }

	

}
