package string;

import java.util.*;

public class StringCompare {
	  public static boolean compareUsingCharAt(String s1, String s2) {

	        // Check String Length
	        if (s1.length() != s2.length()) {
	            return false;
	        }

	        // Compare the character
	        
	        for (int i = 0; i < s1.length(); i++) 
	        {
	            if (s1.charAt(i) != s2.charAt(i))
	            {
	                return false;
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args)
	    {

	        Scanner  kb= new Scanner(System.in);

	        // User input
	        System.out.print("Enter first string: ");
	        String str1 = kb.next();
            
	        // User Input
	        System.out.print("Enter second string: ");
	        String str2 = kb.next();

	        
	        boolean charAtResult = compareUsingCharAt(str1, str2);

	        // Comparing using built in method
	        
	        boolean equalsResult = str1.equals(str2);

	        // Displaying results
	        System.out.println("Result using  method:-" + charAtResult);
	        System.out.println("Result using method:-" + equalsResult);

	        // Checking
	        if (charAtResult == equalsResult) 
	        {
	            System.out.println("Both methods give the SAME result.");
	        } 
	        else
	        {
	            System.out.println("Both methods give DIFFERENT results.");
	        }
            // Scanner closed
	        
	        kb.close();
	    }

}
