package string;

import java.util.*;

public class UniqueCharacter {
	
	 public static int getLength(String text)
	 {
	        int count = 0;
	        try {
	            while (true) {
	                text.charAt(count);
	                count++;
	            }
	        } catch (Exception e) {
	            return count;
	        }
	    }

	    public static char[] uniqueCharacters(String text)
	    {
	        int len = getLength(text);
	        char[] temp = new char[len];
	        int index = 0;

	        for (int i = 0; i < len; i++) {
	            char ch = text.charAt(i);
	            boolean isUnique = true;

	            for (int j = 0; j < i; j++) {
	                if (ch == text.charAt(j)) {
	                    isUnique = false;
	                    break;
	                }
	            }
	            if (isUnique) temp[index++] = ch;
	        }

	        char[] result = new char[index];
	        for (int i = 0; i < index; i++) result[i] = temp[i];
	        return result;
	    }

	    public static void main(String[] args) 
	    {
	        Scanner kb= new Scanner(System.in);
	        System.out.print("Enter text: ");
	        String text = kb.nextLine();

	        char[] unique = uniqueCharacters(text);
	        System.out.print("Unique characters:");
	        for (char c : unique) System.out.print(c + " ");
	        
	        kb.close();
	    }

}
