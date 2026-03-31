package control_flow;
import java.util.*;
public class LeapYearUsingLogicalOperator {
	
	 public static void main(String[] args) {

	        Scanner kb = new Scanner(System.in);

	        // Take year input
	        System.out.println("Enter The Year-:");
	        
	        int year = kb.nextInt();
	        
	        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) 
	        {
	            System.out.println("Year is a Leap Year");
	        } 
	        else {
	            System.out.println("Year is not a Leap Year");
	        }

	       

	        kb.close();
	    }

}
