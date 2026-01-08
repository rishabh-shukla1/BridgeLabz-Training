package control_flow;

import java.util.*;
public class LeapYear {
	 public static void main(String[] args) {

	        Scanner kb = new Scanner(System.in);

	        // Take year input
	        
	        System.out.println("Enter The Year");
	        int year = kb.nextInt();

	        // Check for Gregorian calendar
	        
	        if (year < 1582)
	        {
	            System.out.println("Year must be 1582 or later");
	        }
	        else {

	           
	            if (year % 400 == 0) {
	                System.out.println("Year is a Leap Year");
	            } 
	            else if (year % 100 == 0) {
	            	
	                System.out.println("Year is not a Leap Year");
	            }
	            else if (year % 4 == 0) {
	            	
	                System.out.println("Year is a Leap Year");
	            }
	            else {
	                System.out.println("Year is not a Leap Year");
	            }

	    
	        }

	        kb.close();
	    }

}
