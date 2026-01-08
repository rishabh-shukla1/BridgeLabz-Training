package string;
import java.util.*;

public class TrimSpace {
	
	 public static int[] findTrimPositions(String text)
	 {
	        int left = 0;
	        int right = text.length() - 1;

	        // Skip leading spaces
	        while (left <= right && text.charAt(left) == ' ') 
	        {
	            left++;
	        }

	        // Skip trailing spaces
	        while (right >= left && text.charAt(right) == ' ')
	        {
	            right--;
	        }

	        return new int[]{left, right};
	        
	    }

	    // Build substring using charAt
	    public static String buildSubstring(String text, int start, int end) 
	    {
	        String output = "";

	        for (int i = start; i <= end; i++) {
	            output += text.charAt(i);
	        }

	        return output;
	    }

	    //Compare two strings using charAt()
	    public static boolean isSameString(String first, String second)
	    {

	        if (first.length() != second.length())
	        {
	            return false;
	        }

	        for (int i = 0; i < first.length(); i++)
	        {
	            if (first.charAt(i) != second.charAt(i))
	            {
	                return false;
	            }
	        }

	        return true;
	    }

	    //
	    public static void main(String[] args) {

	        Scanner kb = new Scanner(System.in);

	        System.out.print("Enter a string with leading and trailing spaces:-");
	        
	        String userInput = kb.nextLine();

	        // Get trim positions
	        int[] positions = findTrimPositions(userInput);

	        // Trim using charAt
	        String trimmedByCharAt = buildSubstring(
	                userInput, positions[0], positions[1]
	        );

	        // Trim using built-in method
	        String trimmedByBuiltIn = userInput.trim();

	        // Compare both results
	        boolean match = isSameString(trimmedByCharAt, trimmedByBuiltIn);

	        //Output
	        System.out.println("Original String:" + userInput);
	        System.out.println("Trimmed using charAt():" + trimmedByCharAt );
	        System.out.println("Trimmed using built-in trim():" + trimmedByBuiltIn );
	        System.out.println("Do both results match-: " + match);

	        kb.close();
	    }

}
