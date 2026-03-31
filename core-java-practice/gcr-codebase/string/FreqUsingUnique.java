package string;
import java.util.*;

public class FreqUsingUnique 
{
	 public static char[] uniqueCharacters(String text) 
	 {
	        char[] temp = new char[text.length()];
	        int index = 0;

	        for (int i = 0; i < text.length(); i++)
	        {
	            char ch = text.charAt(i);
	            boolean isUnique = true;

	            for (int j = 0; j < i; j++)
	            {
	                if (ch == text.charAt(j))
	                {
	                    isUnique = false;
	                    break;
	                }
	            }

	            if (isUnique) 
	            {
	                temp[index++] = ch;
	            }
	        }

	        char[] unique = new char[index];
	        for (int i = 0; i < index; i++)
	        {
	            unique[i] = temp[i];
	        }
	        return unique;
	    }

	    // Method to find frequency
	    public static String[][] frequency(String text)
	    {
	        int[] freq = new int[256];

	        for (int i = 0; i < text.length(); i++) 
	        {
	            freq[text.charAt(i)]++;
	        }

	        char[] unique = uniqueCharacters(text);
	        String[][] result = new String[unique.length][2];

	        for (int i = 0; i < unique.length; i++) {
	            result[i][0] = String.valueOf(unique[i]);
	            result[i][1] = String.valueOf(freq[unique[i]]);
	        }
	        return result;
	    }

	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	        // User Input
	        
	        System.out.print("Enter text: ");
	        String text = sc.nextLine();

	        String[][] res = frequency(text);
             //Display
	        System.out.println("Character\tFrequency");
	        for (String[] row : res)
	        {
	            System.out.println(row[0] + "\t\t" + row[1]);
	        }
	        
	    }

}
