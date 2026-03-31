package string;
import java.util.*;

public class UpperCaseConvert 
{
	
    static String convertToUpper(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

           
            if (ch >= 'a' && ch <= 'z')
            {
                ch = (char) (ch - 32); 
            }
            result = result + ch;
        }
        return result;
    }

   
    static boolean compareString(String s1, String s2)
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

        // Taking  input
        System.out.print("Enter complete text: ");
        String input = kb.nextLine();

       // built-In Method
        
        String builtUpper = input.toUpperCase();

       
        String ManualUpper = convertToUpper(input);

        // Comparing both strings
        
        boolean result = compareString(builtUpper, ManualUpper);

        // Display result
        
        System.out.println("Uppercase using toUpperCase-: " + builtUpper);
        System.out.println("Uppercase using custom method-: " + ManualUpper);
        System.out.println("Are both strings equal-:" + result);

        kb.close();
    }
    
}