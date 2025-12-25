package string;
import java.util.*;

public class ReplaceWord 
{
	 public static void main(String[] args)
	    {
	        //Open Scanner
	        Scanner kb = new Scanner(System.in);

	        //User Input
	        System.out.print("Enter sentence :-");
	        String s = kb.nextLine();

	        System.out.print("Enter word to replace :-");
	        String word= kb.nextLine();

	        System.out.print("Enter new word :-");
	        String newWord = kb.nextLine();

	        //Calling method
	        String result = replaceWord(s, word, newWord);

	        //Display
	        System.out.println("Modified s :-" + result);

	        //Scanner closed
	        kb.close();
	    }

	    //Method to replace a word
	    public static String replaceWord(String s, String word, String newWord)
	    {
	        String result = "";
	        String w = "";

	        for (int i = 0; i <= s.length(); i++)
	        {
	            if (i < s.length() && s.charAt(i) != ' ')
	            {
	            	
	                w =w  + s.charAt(i);
	            }
	            else
	            {
	                if (w.equals(word))
	                {
	                    result = result + newWord;
	                }
	                else
	                {
	                    result = result + w;
	                }

	                if (i < s.length())
	                {
	                  result = result + " ";
	                }

	                w= "";
	            }
	        }

	        return result;
	    }

}
