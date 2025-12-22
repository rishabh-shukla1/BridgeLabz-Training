package string;
import java.util.*;

public class SplitTextToWords
{
	 public static int findLength(String str)
	 {
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

	   
	    static String[] customSplit(String text) {

	        int len = findLength(text);
	        int wordCount = 1;

	        // Count number of words 
	        for (int i = 0; i < len; i++) {
	            if (text.charAt(i) == ' ') {
	                wordCount++;
	            }
	        }

	        //store index of spaces
	        int[] spaceIndex = new int[wordCount - 1];
	        int idx = 0;

	        for (int i = 0; i < len; i++)
	        {
	            if (text.charAt(i) == ' ')
	            {
	                spaceIndex[idx++] = i;
	            }
	        }

	       // Extract Word Using index
	        
	        String[] words = new String[wordCount];
	        int start = 0;

	        for (int i = 0; i < spaceIndex.length; i++)
	        {
	            words[i] = text.substring(start, spaceIndex[i]);
	            start = spaceIndex[i] + 1;
	            
	        }
	        words[wordCount - 1] = text.substring(start, len);

	        return words;
	    }

	    //compare two string arrays
	    static boolean compareArrays(String[] a1, String[] a2) {

	        if (a1.length != a2.length) {
	            return false;
	        }

	        for (int i = 0; i < a1.length; i++)
	        {
	            if (!a1[i].equals(a2[i]))
	            {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {

	        Scanner kb=new Scanner(System.in);

	        //  input
	        System.out.print("Enter text:-");
	        String s = kb.nextLine();

	        // Using user-defined split
	        String[] customWord = customSplit(s);

	        // Using built-in split()
	        String[] builtInWord = s.split(" ");

	        // Comparing 
	        boolean result = compareArrays(customWord, builtInWord);

	        // Displaying words
	        System.out.println("Words using custom method:-");
	        for (String word : customWord) {
	            System.out.println(word);
	        }

	        System.out.println("Words using split method:-");
	        for (String word : builtInWord)
	        {
	            System.out.println(word);
	        }

	        System.out.println("Are both results same-:" + result);

	        kb.close();
	    }
}
