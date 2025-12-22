package string;
import java.util.*;

public class ShortestAnsLongestWord {

	public static String[] splitText(String text) {
        int count = 0;

        // Count words
        boolean inWord = false;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ' && !inWord) {
                count++;
                inWord = true;
            } else if (ch == ' ') {
                inWord = false;
            }
        }

        String[] words = new String[count];
        int index = 0;
        String temp = "";

        for (int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);

            if (ch != ' ')
            {
                temp = temp + ch;
            } 
            else if (!temp.equals(""))
            {
                words[index++] = temp;
                temp = "";
            }
        }

        if (!temp.equals(""))
        {
            words[index] = temp;
        }

        return words;
    }

    // Find length of string without using length()
    public static int findLength(String str) {
        int len = 0;
        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (Exception e) {
            return len;
        }
    }

    // MCreate 2D array of word and its length
    public static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len);
        }

        return result;
    }

    // Find shortest and longest word indices
    public static int[] findShortestLongest(String[][] arr) {
        int minIndex = 0;
        int maxIndex = 0;

        int min = Integer.parseInt(arr[0][1]);
        int max = Integer.parseInt(arr[0][1]);

        for (int i = 1; i < arr.length; i++) {
            int len = Integer.parseInt(arr[i][1]);

            if (len < min) {
                min = len;
                minIndex = i;
            }

            if (len > max) {
                max = len;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    // Main Method
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter the text:");
        String text = kb.nextLine();

        String[] words = splitText(text);
        
        String[][] wordLengthArray = wordWithLength(words);
        
        int[] result = findShortestLongest(wordLengthArray);

        System.out.println("Shortest Word:-" + wordLengthArray[result[0]][0] +
                " Length: " + wordLengthArray[result[0]][1] );

        System.out.println("Longest Word: " + wordLengthArray[result[1]][0] +
                " Length: " + wordLengthArray[result[1]][1] );
        kb.close();
    }
   
    
   
}
