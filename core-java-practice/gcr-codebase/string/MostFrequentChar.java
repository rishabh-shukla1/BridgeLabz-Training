package string;
import java.util.*;

public class MostFrequentChar 
{
	 public static void main(String[] args)
	    {
	        //Open Scanner
	        Scanner kb = new Scanner(System.in);

	        //User Input
	        System.out.print("Enter a string :- ");
	        String s = kb.nextLine();

	        //Calling method
	        char result = mostFrequentChar(s);

	        // Display
	        System.out.println("Most Frequent Character :-->" + result);

	        //Scanner closed
	        kb.close();
	    }

	    //Method to find most frequent character
	 
	    public static char mostFrequentChar(String s)
	    {
	        int[] freq = new int[256];

	        for (int i = 0; i < s.length(); i++)
	        {
	            freq[s.charAt(i)]++;
	        }

	        char maxC = s.charAt(0);
	        
	        int max = freq[maxC];

	        //finding max
	        for (int i = 1; i < s.length(); i++)
	        {
	            if (freq[s.charAt(i)] > max)
	            {
	                max = freq[s.charAt(i)];
	                maxC = s.charAt(i);
	            }
	        }

	        return maxC;
	    }

}
