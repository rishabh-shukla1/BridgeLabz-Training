package string;
import java.util.*;

public class RemoveDuplicate 
{
	public static void main(String[] args)
    {
        //Open Scanner
        Scanner kb = new Scanner(System.in);

        //User Input
        System.out.print("Enter a string :- ");
        
        String s = kb.nextLine();

        //Calling method
        String result = removeDuplicates(s);

        //Display
        System.out.println("After removing duplicates :- " + result);

        //Scanner closed
        kb.close();
    }

    // Method to remove duplicate characters
    public static String removeDuplicates(String str)
    {
        String r= "";

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if (r.indexOf(ch) == -1)
            {
                r = r + ch;
            }
        }

        return r;
    }

}
