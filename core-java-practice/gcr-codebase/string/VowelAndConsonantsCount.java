package string;

import java.util.*;
public class VowelAndConsonantsCount {
	
	
    public static String[] findFrequency(String text) 
    {

        char[] chars = text.toCharArray();
        
        int[] freq = new int[chars.length];
        

        
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == '0')
                continue;

            freq[i] = 1;

            for (int j = i + 1; j < chars.length; j++) 
            {
                if (chars[i] == chars[j]) 
                {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicate
                }
            }
        }

        //  Count unique characters
        int count = 0;
        for (int i = 0; i < chars.length; i++)
        {
            if (chars[i] != '0') {
                count++;
            }
        }

        // Store result in 1D String array
        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " : " + freq[i];
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a string:");
        
        String text = kb.nextLine();

        String[] output = findFrequency(text);

        System.out.println("Character Frequencies:");
        
        for (int i = 0; i < output.length; i++) 
        {
            System.out.println(output[i]);
        }

        kb.close();
    }

}
