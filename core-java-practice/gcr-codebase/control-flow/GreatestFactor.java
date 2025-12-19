package control_flow;
import java.util.*;
public class GreatestFactor {
	 public static void main(String[] args) {

	        Scanner kb = new Scanner(System.in);
             //Take input from the user a positive number
	        
	        System.out.print("Enter a positive integer: ");
	        int number = kb.nextInt();

	        // Check positive integer
	        
	        if (number <= 1)
	        {
	            System.out.println("Please enter an number greater than 1");
	        } 
	        else {

	            int greatestFact = 1;

	            for (int i=number - 1;i >= 1; i--) {

	                if (number % i == 0) {
	                	
	                    greatestFact = i;
	                    
	                    break;
	                }
	            }

	            System.out.println("Greatest factor is-: " + greatestFact);
	        }

	        kb.close();
	    }

}
