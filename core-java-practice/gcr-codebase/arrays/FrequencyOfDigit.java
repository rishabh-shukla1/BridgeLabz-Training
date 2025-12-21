package array;

import java.util.*;

public class FrequencyOfDigit {
	public static void main(String[] args) {
        //open scanner
        Scanner kb = new Scanner(System.in);

        // user input
        System.out.print("Enter a number: ");
        int number = kb.nextInt();
        
		 // handle negative numbers
        if (number < 0)
        {
            number = Math.abs(number);
        }

        int t = number;
        int count = 0;

        // Find number of digits
        if (t == 0)
        {
            count = 1;
        } 
        else {
            while (t != 0) {
                count++;
                t = t / 10;
            }
        }

        // Store digits
        int[] digit = new int[count];
        
        int ind= 0;

       
        if (number == 0)
        {
            digit[0] = 0;
        } 
        else
        {
            while (number != 0)
            {
                digit[ind] = number % 10;
                number = number / 10;
                ind++;
            }
        }

        //Frequency array 
        int[] freq = new int[10];

        
        for (int i = 0; i < digit.length; i++) 
        {
            freq[digit[i]]++;
        }

        // Display frequency of the digits
        
        System.out.println("Digit Frequency:-");
        
        for (int i = 0; i < freq.length; i++) 
        {
            if (freq[i] > 0) {
                System.out.println( "Number "+ i + " frequency is-:" + freq[i] );
            }
        }
        //Scanner close
        
        kb.close();
    }

}
