package scenario_based;

import java.util.*;

public class ParagraphAnalyser 
{
	
	    //Method to count words
	    public static int countWords(String text)
	    {
	        if (text == null || text.trim().isEmpty())
	            return 0;

	        String[] words = text.trim().split("\\s+");
	        return words.length;
	    }

	    //Method to find longest word
	    public static String findLongestWord(String text)
	    {
	        if (text == null || text.trim().isEmpty())
	            return "No words found";

	        String[] words = text.trim().split("\\s+");

	        String longest = words[0];

	        for (int i = 1; i < words.length; i++)
	        {
	            if (words[i].length() > longest.length())
	                longest = words[i];
	        }

	        return longest;
	    }

	    // Method to replace a word
	    public static String replaceWord(String text, String oldWord, String newWord)
	    {
	        if (text == null || text.trim().isEmpty())
	            return text;

	        return text.replaceAll("(?i)\\b" + oldWord + "\\b", newWord);
	    }

	    // Main method
	    public static void main(String[] args)
	    {
	        Scanner kb = new Scanner(System.in);

	        //Input paragraph
	        System.out.println("Enter a paragraph:");
	        String paragraph = kb.nextLine();

	        //Word count
	        int count = countWords(paragraph);
	        System.out.println("Total Words = " + count);

	        //Longest word
	        String longest = findLongestWord(paragraph);
	        System.out.println("Longest Word = " + longest);

	        //Replace word
	        if (count > 0)
	        {
	            System.out.print("Enter word to replace:-");
	            String oldWord = kb.next();

	            System.out.print("Enter new word:-");
	            String newWord = kb.next();

	            String updatedText = replaceWord(paragraph, oldWord, newWord);

	            System.out.println("Updated Paragraph:-");
	            System.out.println(updatedText);
	        }
	        else
	        {
	            System.out.println("No replacement possible (empty paragraph)");
	        }

	        kb.close();
	    }

}

