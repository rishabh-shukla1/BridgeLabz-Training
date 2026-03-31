package extras;

import java.util.*;

public class PlaindromeCheck 
{
	//method to check palindrome
    public static boolean Palindrome(String str)
    {
        String w1 ="";

        for (int i = str.length() - 1; i >= 0; i--)
        {
            w1= w1 + str.charAt(i);
            
        }

        return str.equalsIgnoreCase(w1);
    }

    public static void main(String[] args)
    {
        //Open Scanner
        Scanner kb = new Scanner(System.in);

        //User Input
        System.out.print("Enter a string :-");
        String s = kb.next();

        //calling method
        boolean result = Palindrome(s);

        //Display
        if (result) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }

        //Scanner closed
        kb.close();
    }

}
