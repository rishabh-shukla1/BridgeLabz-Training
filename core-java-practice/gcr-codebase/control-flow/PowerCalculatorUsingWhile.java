package control_flow;
import java.util.Scanner;
public class PowerCalculatorUsingWhile {
	
	    public static void main(String[] args) {

	        Scanner kb = new Scanner(System.in);
	        
            //input number
	        
	        System.out.print("Enter the base number:-");
	        
	        int number = kb.nextInt();
            //enter power
	        
	        System.out.print("Enter the power:-");
	        int power = kb.nextInt();

	        // Check  input
	        
	        if (number <= 0 || power < 0) {
	            System.out.println("Please enter valid positive integers.");
	        }
	        else 
	        {

	            int result = 1;
	            
	            int i = 0;

	            while (i != power) {
	            	
	                result = result * number;
	                i++;
	                
	            }

	            System.out.println("Result: " + result);
	        }

	        kb.close();
	    }
	}


