package string;
import java.util.*;

public class CharArrayCompare
{
	public static char[] getCharacter(String text) {

        char[] chars = new char[text.length()];

        for (int i = 0; i < text.length(); i++)
        {
            chars[i] = text.charAt(i);
        }

        return chars;
    }

   
    public static boolean compareCharArray(char[] arr1, char[] arr2) 
    {

        if (arr1.length != arr2.length) 
        {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) 
        {
            if (arr1[i] != arr2[i]) 
            {
               
            	return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        // User input
        System.out.print("Enter the string: ");
        
        String text = kb.next();

        // User-defined method result
        char[] userArray = getCharacter(text);

       
        char[] builtInArray = text.toCharArray();

        // Compare both arrays
        
        boolean result = compareCharArray(userArray, builtInArray);

        // Display characters
        
        System.out.println("Characters using user-defined method:-");
        
        for (char c : userArray)
        {
            System.out.print(c + " ");
        }

        System.out.println("Characters using toCharArray ");
        
        for (char c : builtInArray) 
        {
            System.out.print(c + " ");
            
        }

        // Display
        System.out.println("Are both character arrays equal-:" + result);

        kb.close();
    }

}
