package array;
import java.util.*;

public class FizzBuzzArray {
	
	public static void  main(String args[])
	{
	
	   Scanner kb= new Scanner(System.in);

       // Input form user
       System.out.print("Enter a number: ");
    
       int number = kb.nextInt();

       // Check  positive integer or not
       if (number <= 0) 
       {
        System.out.println("Please enter a positive integer");
        System.exit(0);
       }
 
		    // Define Array to store answer
       
		    String[] ans = new String[number];
		
		   // Calculations according to the question
		    
		    for (int i = 1; i <= number; i++) {
		
		        if (i % 3 == 0 && i % 5 == 0)
		        {
		            ans[i - 1] ="FizzBuzz";
		        } 
		        else if (i % 3 == 0)
		        {
		            ans[i - 1] ="Fizz";
		        } 
		        else if (i % 5 == 0)
		        {
		            ans[i - 1] ="Buzz";
		        } 
		        else
		        {
		            ans[i - 1] =String.valueOf(i);
		        }
		    }
		
		    // Display
		    System.out.println("FizzBuzz Result:-");
		    
		    for (int i = 0; i < ans.length; i++)
		    {
		    	
		        System.out.println("Position" + (i + 1) + " =>" + ans[i]);
		        
		    }
		     // close Scanner
		    kb.close();
		}

}
