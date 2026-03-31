package string;

import java.util.*;

public class SubstringOccur
{
	public static void main(String[] args)
    {
        //Open Scanner
        Scanner kb = new Scanner(System.in);

        //User Input
        System.out.print("Enter main string :- ");
        String s = kb.nextLine();

        System.out.print("Enter substring :- ");
        String substring = kb.nextLine();

        //Calling method
        int result = countOccurrences(s, substring);

        //Display
        System.out.println("Substring occurs-:" + result + " times");

        //Scanner closed
        kb.close();
    }

    //Method to count occurrences of substring
    public static int countOccurrences(String str, String sub)
    {
        int c = 0;

        for (int i = 0; i <= str.length() - sub.length(); i++)
        {
            boolean temp = true;

            for (int j = 0; j < sub.length(); j++)
            {
                if (str.charAt(i + j) != sub.charAt(j))
                {
                    temp = false;
                    break;
                }
            }

            if (temp)
                c++;
        }

        return c;
    }

}
