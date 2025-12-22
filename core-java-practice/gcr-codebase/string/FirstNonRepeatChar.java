package string;
import java.util.*;

public class FirstNonRepeatChar 
{
	public static char findFirstNonRepeating(String text) 
	{
		
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++)
        {
            if (freq[text.charAt(i)] == 1)
                return text.charAt(i);
        }

        return '\0';
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        //User Input
        System.out.print("Enter text: ");
        
        String text = kb.nextLine();

        char result = findFirstNonRepeating(text);
        
        //Display Result
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);}
        else {
            System.out.println("No non-repeating character found");}
        
        kb.close();
    }
	

}
