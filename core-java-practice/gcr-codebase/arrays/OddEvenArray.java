package arrays;
import java.util.*;

public class OddEvenArray 
{
	public static void main(String[] args) 
	{ 
        //Open Scanner
        Scanner kb= new Scanner(System.in);

        // Get integer input
        System.out.print("Enter a number: ");
        int number = kb.nextInt();

        // Check for natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number.");
            System.exit(0);
        }

        //Calculate size
        int size = number / 2 + 1;
        //Define Array
        int[] odd = new int[size];
        int[] even = new int[size];

        // Index variables for odd and even
        
        int oddInd = 0;// odd index
        int evenInd = 0;// even index

      
        for (int i = 1; i <= number; i++)
        {
            if (i % 2 == 0) 
            {
                even[evenInd] = i;
                
                evenInd++;
            } 
            else
            {
                odd[oddInd] = i;
                
                oddInd++;
            }
        }

        //Print odd number
        
        System.out.println("Odd Numbers-:");
        
        for (int i = 0; i < oddInd; i++) 
        {
            System.out.print(odd[i] + " ");
        }

        // Print even number
        
        System.out.println("\nEven Numbers:");
        
        for (int i = 0; i < evenInd; i++) 
        {
        	
            System.out.print(even[i] + " ");
        }
        
        //Close Scanner
        kb.close();
    }

}
