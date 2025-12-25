package string;

import java.util.*;

public class RemoveCharacter 
{
	public static void main(String[] args)
    {
        //Open Scanner
        Scanner kb = new Scanner(System.in);

        //User Input
        System.out.print("Enter a string :--");
        String s = kb.nextLine();
        

        System.out.print("Enter character to remove :-");
        
        char ch = kb.next().charAt(0);

        //Calling method
        String result = removeChar(s, ch);

        // Display
        System.out.println("Modified String :-" + result);

        //Scanner closed
        kb.close();
    }

    //Method to remove a character
	
    public static String removeChar(String s, char ch)
    {
        String r = "";

        for (int i = 0; i < s.length(); i++)
        {
        	
            if (s.charAt(i) != ch)
            {
                r= r + s.charAt(i);
            }
        }

        return r;
    }

}
