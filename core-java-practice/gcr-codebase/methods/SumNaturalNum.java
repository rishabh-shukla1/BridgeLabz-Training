package methods;

import java.util.*;

public class SumNaturalNum
{
	 public static void main(String[] args) 
	 {

	        // Open Scanner
	        Scanner kb = new Scanner(System.in);

	        // User Input n
	        System.out.print("Enter n :-");
	        int n = kb.nextInt();

	        // calling method
	        int sum = findSum(n);

	        // Display
	        System.out.println("Sum of natural numbers = " + sum);

	        // Scanner closed
	        kb.close();
	    }

	    // method to find sum
	    public static int findSum(int n)
	    {
	        int sum = 0;

	        for (int i = 1; i <= n; i++)
	        {
	            sum = sum + i;
	        }

	        return sum;
	    }

}
