package scenario_based;

import java.util.*;

public class ElectionBoothManager {

	 public static void main(String[] args)
	 {

	        Scanner kb= new Scanner(System.in);
            //vote
	        int v;
	        int candidate1 = 0;
	        int candidate2 = 0; 
	        int candidate3 = 0;

	        while (true)
	        {

	            System.out.println("Enter age or -1 to exit -: ");
	            int age = kb.nextInt();

	            // Exit condition
	            
	            if (age == -1)
	            {
	                break;
	            }

	            // Check Eligibility
	            
	            if (age >= 18)
	            {
	                System.out.println("You are eligible to vote-:");
	                
	                System.out.println("Enter your vote:--");
	                System.out.println("1. Candidate 1");
	                System.out.println("2. Candidate 2");
	                System.out.println("3. Candidate 3");

	                v = kb.nextInt();

	                // Record vote
	                if (v == 1) 
	                {
	                    candidate1++;
	                } 
	                else if (v== 2)
	                {
	                    candidate2++;
	                } 
	                else if (v== 3)
	                {
	                    candidate3++;
	                } 
	                else
	                {
	                    System.out.println("Invalid vote");
	                }

	            } 
	            else {
	                System.out.println("You are not eligible to vote.");
	            }
	        }

	        // Display result
	        System.out.println("Voting Results:--");
	        
	        System.out.println("Candidate 1 Votes:-" + candidate1);
	        
	        System.out.println("Candidate 2 Votes:-" + candidate2);
	        
	        System.out.println("Candidate 3 Votes:-" + candidate3);
            
	        // Close Scanner 
	        
	        kb.close();
	    }
}
