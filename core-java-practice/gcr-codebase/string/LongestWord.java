package string;

import java.util.*;

public class LongestWord
{
	public static void main(String[] args)
    {
        // Open Scanner
        Scanner kb = new Scanner(System.in);

        //User Input
        System.out.print("Enter a sentence :- ");
        String s = kb.nextLine();
        

        //Calling method
        String result = findLongestWord(s);

        // Display
        
        System.out.println("Longest Word :- " + result);

        //Scanner closed
        kb.close();
    }

    // Method to find longest word
    public static String findLongestWord(String s)
    {
        String word = "";
        String longest = "";

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if (ch != ' ')
            {
                word = word + ch;
            }
            else
            {
                if (word.length() > longest.length())
                {
                    longest = word;
                }
                
                word = "";
            }
        }
 
        if (word.length() > longest.length())
        {
            longest = word;
        }

        return longest;
    }

}
