package string;
import java.util.*;

public class AnagramCheck {
	
	public static boolean isAnagram(String a, String b) 
	{
        if (a.length() != b.length()) 
        	return false;

        int[] freq = new int[256];
        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i)]++;
            freq[b.charAt(i)]--;
        }

        for (int i : freq)
            if (i != 0) return false;

        return true;
    }

    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        //User Input
        System.out.print("Enter first text: ");
        String a = kb.nextLine();
        System.out.print("Enter second text: ");
        String b = kb.nextLine();

        System.out.println("Are Anagrams-: " + isAnagram(a, b));
        kb.close();
    }

}
