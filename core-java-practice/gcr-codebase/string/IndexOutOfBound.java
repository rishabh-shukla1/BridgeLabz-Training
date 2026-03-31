package string;
import java.util.*;

public class IndexOutOfBound
{
	
    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String str)
    {
        System.out.println("Handling Exception");
        try {
            char ch = str.charAt(str.length()); 
            System.out.println(ch);
        } 
        catch (StringIndexOutOfBoundsException e) 
        {
            System.out.println("Exception Caught: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        // user input string 
        System.out.print("Enter a String-: ");
        String s = kb.nextLine();

     
        // Calling method that handles exception
        handleException(s);

        kb.close();
    }
}