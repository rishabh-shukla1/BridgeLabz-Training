package string;

import java.util.*;

public class ILegalArgumentsString {
	
	 static void generateException(String str)
	 {
	        System.out.println("Generating Exception");
	       
	        String result = str.substring(5, 2);
	        
	        System.out.println(result);
	    }

	  
	    static void handleException(String str)
	    {
	        System.out.println("Handling Exception-:");
	        try {
	            
	            String result = str.substring(5, 2);
	            System.out.println(result);
	        }
	        catch (IllegalArgumentException e) 
	        {
	            System.out.println("IllegalArgumentException Caught: " + e);
	        } 
	        catch (RuntimeException e) 
	        {
	            System.out.println("RuntimeException Caught: " + e);
	        }
	    }

	    public static void main(String[] args) {

	        Scanner kb = new Scanner(System.in);

	        //  user input
	        System.out.print("Enter a String: ");
	        String s = kb.nextLine();

	        // First call: generates exception
	        generateException(s);

	        // Second call: handles exception
	        handleException(s);

	        kb.close();
	    }
}

