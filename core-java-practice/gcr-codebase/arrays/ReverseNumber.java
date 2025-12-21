package array;

import java.util.*;

public class ReverseNumber {
	public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        //User input
        System.out.print("Enter a number: ");
        
        int number = kb.nextInt();
		// handle negative numbers
        if (number < 0)
        {
            number = Math.abs(number); 
        }
        //Store original number
        int t = number;
        int count = 0;

        //Find count of digits
        while (t != 0) 
        {
            count++;
            
            t = t / 10;
        }

        // Define Array to store digit
        int[] digit = new int[count];
        int ind = 0;

        
        while (number != 0)
        {
            digit[ind] = number % 10;
            number = number / 10;
            ind++;
        }

       
        System.out.println("Reversed Digit-:");
        for (int i = 0; i < count; i++)
        {
            System.out.print( digit[i]);
        }

        //Close Scanner 
        
        kb.close();
    }

}
