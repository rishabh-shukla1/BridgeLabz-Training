package scenario_based;
import java.util.*;

public class SentenceFormatter 
{
	 public static void main(String[] args)
	    {
	        Scanner kb = new Scanner(System.in);

	        System.out.println("Enter a paragraph:");
	        String input = kb.nextLine();

	        String result = formatSentence(input);

	        System.out.println("Formatted Paragraph:");
	        System.out.println(result);

	        kb.close();
	    }

	    // Method to format the paragraph
	    public static String formatSentence(String text)
	    {
	        //Trim and remove extra spaces
	        text = text.trim().replaceAll("\\s+", " ");

	        // Add space after punctuation if missing
	        text = text.replaceAll("([.!?])([a-zA-Z])", "$1 $2");

	        // Capitalize first letter of each sentence
	        StringBuilder sb = new StringBuilder(text);

	        // Capitalize first character
	        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));

	        for (int i = 0; i < sb.length() - 1; i++)
	        {
	            if (sb.charAt(i) == '.' || sb.charAt(i) == '!' || sb.charAt(i) == '?')
	            {
	                if (sb.charAt(i + 1) == ' ')
	                {
	                    sb.setCharAt(i + 2, Character.toUpperCase(sb.charAt(i + 2)));
	                }
	            }
	        }

	        return sb.toString();
	    }

}
