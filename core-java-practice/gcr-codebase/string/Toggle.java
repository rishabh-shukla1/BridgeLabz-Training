package string;

import java.util.*;

public class Toggle 
{
	 public static void main(String[] args)
	    {
	        //Open Scanner
	        Scanner kb = new Scanner(System.in);

	        //User Input
	        System.out.print("Enter a string :- ");
	        String s = kb.nextLine();

	        // Calling method
	        
	        String result = toggleCase(s);

	        // Display
	        
	        System.out.println("Toggled String :- " + result);

	        //Scanner closed
	        kb.close();
	    }

	    //Method to toggle case
	 
	    public static String toggleCase(String s)
	    {
	    	
	        String result = "";

	        for (int i = 0; i < s.length(); i++)
	        {
	        	
	            char ch = s.charAt(i);

	            if (ch >= 'A' && ch <= 'Z')
	            {
	                result = result + (char)(ch + 32);
	            }
	            else if (ch >= 'a' && ch <= 'z')
	            {
	                result = result + (char)(ch - 32);
	            }
	            else
	            {
	                result = result + ch;
	            }
	        }

	        return result;
	    }

}
