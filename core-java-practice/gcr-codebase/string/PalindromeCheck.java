package string;
import java.util.*;

public class PalindromeCheck 
{
	// normal method
	public static boolean isPalindrome(String s)
	{
        int start = 0, end = s.length() - 1;
        while (start < end)
        {
            if (s.charAt(start++) != s.charAt(end--))
                return false;
       
        }
        return true;
    }
   // Recusive method
    static boolean isPalindromeRecursive(String s, int start, int end) 
    {
        if (start >= end) return true;
        
        if (s.charAt(start) != s.charAt(end)) return false;
        
        return isPalindromeRecursive(s, start + 1, end - 1);
    }
    // Display answer
    
    public static void main(String[] args) 
    {
    	//User Input
    	System.out.println("Enter the String:-");
    	Scanner kb=new Scanner(System.in);
        String s = kb.next();
        //Display answer
        
        System.out.println("Palindrome (Loop): " + isPalindrome(s));
        
        System.out.println("Palindrome (Recursive): " +
                isPalindromeRecursive(s, 0, s.length() - 1));
        kb.close();
    }

}
