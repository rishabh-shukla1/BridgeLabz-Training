package array;
import java.util.*;

public class VoteEligibility {
	 public static void main(String[] args) {

	        Scanner kb= new Scanner(System.in);

	       // Define array of size 10
	        int[] age = new int[10];

	        // Take input of array
	        System.out.println("Enter age of 10 students:-");
	        
	        for (int i = 0; i<age.length; i++) {
	        	
	            age[i] = kb.nextInt();
	        }

	        //Checking eligibility
	        System.out.println("Voting Eligibility Result:-");
	        
	        for (int i = 0; i < age.length; i++) 
	        {
                // age below zero is invalid
	            if (age[i] < 0)
	            {
	                System.out.println("Invalid age");
	            } 
	            // Greater than 18 can vote
	            else if (age[i] >= 18) {
	            	
	                System.out.println("The student with the age " + age[i] + " can vote");
	            } 
	            // Age below 18 cannot vote
	            else {
	                System.out.println("The student with the age " + age[i] + " cannot vote");
	            }
	        }

	        kb.close();
	    }

}
