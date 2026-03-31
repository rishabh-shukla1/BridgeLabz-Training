package string;
import java.util.*;

public class SplitTextTowordTwoDArray
{
	  static int findLength(String str)
	  {
	        int count = 0;
	        try {
	            while (true) 
	            {
	                str.charAt(count);
	                count++;
	            }
	        } catch (StringIndexOutOfBoundsException e)
	        {
	            return count;
	        }
	    }

	    
	    static String[] splitWords(String text) {

	        int len = findLength(text);
	        int wordCount = 1;

	        // Count number of words
	        
	        for (int i = 0; i < len; i++)
	        {
	            if (text.charAt(i) == ' ')
	            {
	                wordCount++;
	            }
	        }

	        String[] words = new String[wordCount];
	        int start = 0, ind = 0;

	        for (int i = 0; i < len; i++)
	        {
	            if (text.charAt(i) == ' ')
	            {
	                words[ind++] = text.substring(start, i);
	                start = i + 1;
	            }
	        }

	        // Last word
	        words[ind] = text.substring(start, len);

	        return words;
	    }

	    // Method to create 2D array of word and its length
	    static String[][] wordLengthTable(String[] words) {

	        String[][] result = new String[words.length][2];

	        for (int i = 0; i < words.length; i++) {
	            result[i][0] = words[i];
	            result[i][1] = String.valueOf(findLength(words[i]));
	        }

	        return result;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Taking complete text input
	        System.out.print("Enter text: ");
	        String input = sc.nextLine();

	        // Splitting words
	        String[] words = splitWords(input);

	        // Creating 2D array
	        String[][] table = wordLengthTable(words);

	        // Displaying result in tabular format
	        System.out.println("Word  Length");
	       

	        for (int i = 0; i < table.length; i++) {
	            int length = Integer.parseInt(table[i][1]); 
	            System.out.println(table[i][0] + "\t" + length);
	        }

	        sc.close();
	    }

}
