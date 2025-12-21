package array;

import java.util.*;

public class FindLargestSecondLargest {
	public static void main(String[] args) {

        Scanner kb= new Scanner(System.in);

        // User input
        System.out.print("Enter a number:-");
        
        int number = kb.nextInt();
        // handle negative numbers
        if (number < 0)
        {
            number = Math.abs(number); 
        }

        
        int maxDigit = 10;
        // Define array to Store Digits
        
        int[] digit = new int[maxDigit];

        int index = 0;

        // Store digits in array
        while (number != 0 && index<maxDigit)
        {
            digit[index] = number % 10;
            
            number = number / 10;     
            
            index++;
        }

        
        int largest = 0;
        int secondLargest = 0;
        

        //Check
        for (int i = 0; i < index; i++)
        {

            if (digit[i] > largest) 
            {
                secondLargest = largest;
                
                largest = digit[i];
            } 
            else if (digit[i] > secondLargest && digit[i] != largest)
            {
                secondLargest = digit[i];
            }
        }

        // Display
        
        System.out.println("Largest digit -:" + largest);
        
        System.out.println("Second largest digit-:" + secondLargest);

        kb.close();
    }

}
