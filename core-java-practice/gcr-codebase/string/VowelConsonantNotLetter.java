package string;

import java.util.*;
public class VowelConsonantNotLetter {
	 public static String checkChar(char ch) {

	        // Convert uppercase to lowercase
	        if (ch >= 'A' && ch <= 'Z')
	        {
	            ch = (char)(ch + 32);
	        }

	        // Check if letter
	        if (ch >= 'a' && ch <= 'z')
	        {

	            // Check vowel
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
	            {
	                return "Vowel";
	            } 
	            else {
	                return "Consonant";
	            }
	        }

	        return "Not a Letter";
	    }

	    // Create 2D array using charAt()
	    public static String[][] findType(String text)
	    {

	        int n = text.length();
	        
	        String[][] result = new String[n][2];

	        for (int i = 0; i < n; i++)
	        {
	            char ch = text.charAt(i);
	            result[i][0] = String.valueOf(ch);
	            result[i][1] = checkChar(ch);
	        }

	        return result;
	    }

	    //Display
	    public static void display(String[][] arr) {

	        System.out.println("Character\tType");
	        

	        for (int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i][0] + "\t\t" + arr[i][1]);
	        }
	    }

	    // Main Method
	    public static void main(String[] args)
	    {

	        Scanner kb = new Scanner(System.in);

	        System.out.println("Enter a string:");
	        String text = kb.nextLine();

	        String[][] output = findType(text);
	        display(output);

	        kb.close();
	    }

}
