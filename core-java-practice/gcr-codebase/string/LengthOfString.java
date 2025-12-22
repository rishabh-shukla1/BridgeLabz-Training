package string;
import java.util.*;

public class LengthOfString {
	
    public static int findLength(String str) {
        int count = 0;

        try {
           
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e)
        {
           
            return count;
        }
    }

    public static void main(String[] args) {

        Scanner kb= new Scanner(System.in);

        //  Input
        System.out.print("Enter a string:-");
        
        String input = kb.next();

        int manualLength = findLength(input);

        int builtLength = input.length();

        // Display
        System.out.println("Length using user-defined method: " + manualLength);
        System.out.println("Length using built-in length:- " + builtLength);

        kb.close();
    }

}
