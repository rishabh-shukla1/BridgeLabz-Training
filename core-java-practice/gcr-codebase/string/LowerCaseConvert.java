package string;
import java.util.*;

public class LowerCaseConvert
{
	 static String convertToLower(String text)
	 {
	        String result = "";

	        for (int i = 0; i < text.length(); i++) {
	            char ch = text.charAt(i);

	           
	            if (ch >= 'A' && ch <= 'Z') 
	            {
	                ch = (char) (ch + 32); 
	            }
	            result = result + ch;
	        }
	        return result;
	    }

	    
	    static boolean compareString(String s1, String s2) 
	    {

	        if (s1.length() != s2.length()) {
	            return false;
	        }

	        for (int i = 0; i < s1.length(); i++) {
	            if (s1.charAt(i) != s2.charAt(i)) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {

	        Scanner kb = new Scanner(System.in);

	        // Taking input
	        System.out.print("Enter complete text: ");
	        String input = kb.nextLine();

	        // Using built-in method
	        String builtLower = input.toLowerCase();

	       
	        String manualLower = convertToLower(input);

	        // Comparing both string
	        boolean result = compareString(builtLower, manualLower);

	        // Displaying results
	        System.out.println("Lowercase using toLowerCase:- " + builtLower);
	        System.out.println("Lowercase using custom method:- " + manualLower);
	        System.out.println("Are both strings equal-: " + result);

	        kb.close();
	    }

}
