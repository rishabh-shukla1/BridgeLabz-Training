package string;

import java.util.*;

public class CharactreFreqCharAt {
	
	 public static String[][] findFrequency(String text) {

	        int[] freq = new int[256];

	        // Count frequency using charAt()
	        for (int i = 0; i < text.length(); i++)
	        {
	            char ch = text.charAt(i);
	            freq[ch]++;
	        }

	        //  Count unique characters
	        int uniqueCount = 0;
	        for (int i = 0; i < text.length(); i++)
	        {
	            if (freq[text.charAt(i)] > 0)
	            {
	                uniqueCount++;
	                freq[text.charAt(i)] = -freq[text.charAt(i)];
	            }
	        }

	        // Store characters and frequencies
	        String[][] result = new String[uniqueCount][2];
	        int index = 0;

	        for (int i = 0; i < 256; i++)
	        {
	            if (freq[i] < 0) {
	                result[index][0] = Character.toString((char) i);
	                result[index][1] = String.valueOf(-freq[i]);
	                index++;
	            }
	        }

	        return result;
	    }

	    // Display result
	    public static void display(String[][] data) {
	        System.out.println("Character\tFrequency");
	     

	        for (String[] row : data) 
	        {
	            System.out.println(row[0] + "\t\t" + row[1]);
	        }
	    }

	  
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String text = sc.nextLine();

	        String[][] frequencyData = findFrequency(text);
	        display(frequencyData);

	        sc.close();
	    }

}
