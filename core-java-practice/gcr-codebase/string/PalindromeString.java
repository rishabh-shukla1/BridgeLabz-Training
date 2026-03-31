package string;
import java.util.*;

public class PalindromeString 
{
	 public static void main(String[] args)
	    {
	        //Open Scanner
	        Scanner kb = new Scanner(System.in);

	        // User Input
	        System.out.print("Enter a string :- ");
	        String s = kb.nextLine();

	        // Calling method
	        boolean result = isPalindrome(s);

	        // Display
	        if (result) {
	            System.out.println("String is Palindrome");
	        }
	        else
	        {
	            System.out.println("String is not Palindrome");
	        }

	        // Scanner closed
	        kb.close();
	    }

	    // Method to check palindrome
	    public static boolean isPalindrome(String s)
	    {
	        int start = 0;
	        int end = s.length() - 1;

	        while (start < end)
	        {
	            if (s.charAt(start) != s.charAt(end))
	                return false;

	            start++;
	            end--;
	        }

	        return true;
	    }

}
