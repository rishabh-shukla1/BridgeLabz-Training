package string;
import java.util.*;

public class AnagramChecker
{
	  public static void main(String[] args)
	    {
	        //Open Scanner
	        Scanner kb = new Scanner(System.in);

	        //User Input
	        System.out.print("Enter first string :-");
	        String s1 = kb.nextLine();

	        System.out.print("Enter second string :-");
	        String s2 = kb.nextLine();

	        //Calling method
	        boolean ans = isAnagram(s1, s2);

	        //Display
	        if (ans)
	        {
	            System.out.println("Strings are Anagrams");
	        }
	        else
	        {
	            System.out.println("Strings are not Anagrams");
	        }

	        //Scanner closed
	        kb.close();
	    }

	    // Method to check anagram
	    public static boolean isAnagram(String s1, String s2)
	    {
	        int[] c = new int[256];

	        for (int i = 0; i < s1.length(); i++)
	        {
	            c[s1.charAt(i)]++;
	        }

	        for (int i = 0; i < s2.length(); i++)
	        {
	            c[s2.charAt(i)]--;
	        }

	        for (int i = 0; i < 256; i++)
	        {
	            if (c[i] != 0)
	            {
	                return false;
	            }
	        }

	        return true;
	    }

}
