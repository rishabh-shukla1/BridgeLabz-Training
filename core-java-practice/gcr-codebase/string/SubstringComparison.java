package string;
import java.util.*;

public class SubstringComparison
{    // Substring Calculated manually 
	

	public static String createSubstring(String text, int start, int end)
	{
        String result = "";

        for (int i = start; i < end; i++)
        {
        	
            result = result + text.charAt(i);
        }

        return result;

}
	
public static boolean compareString(String s1, String s2)
 {

    if (s1.length() != s2.length())
    {
        return false;
    }

    for (int i = 0; i < s1.length(); i++)
    {
        if (s1.charAt(i) != s2.charAt(i))
        {
            return false;
        }
    }

    return true;
}

public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);

    // User input
    System.out.println("Enter the text:- ");
    String text = kb.next();

    System.out.println("Enter start index:- ");
    int start = kb.nextInt();

    System.out.println("Enter end index:- ");
    int end = kb.nextInt();

    // Creating substring using for loop
    String charAtSubstring = createSubstring(text, start, end);

    // Creating substring using substring()
    String builtInSubstring = text.substring(start, end);

    // Comparing both substrings
    boolean result = compareString(charAtSubstring, builtInSubstring);

    // Display result
    
    System.out.println("Substring using charAt-: " + charAtSubstring);
    
    System.out.println("Substring using substring-: " + builtInSubstring);
    System.out.println("Are both substrings equal-: " + result);
    // Scanner closed

    kb.close();
}
}
