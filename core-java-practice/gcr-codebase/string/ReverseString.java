package string;
import java.util.*;

public class ReverseString
{
	public static void main(String[] args)
    {
        //Open Scanner
        Scanner kb = new Scanner(System.in);

        //User Input
        System.out.print("Enter a string :--");
        String str = kb.nextLine();

        //Calling method
        String result = reverseString(str);

        //Display
        System.out.println("Reversed String :--" + result);

        //Scanner closed
        kb.close();
    }

    // Method to reverse a string
    public static String reverseString(String s)
    {
    	
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--)
        {
            rev = rev + s.charAt(i);
        }

        return rev;
    }

}
