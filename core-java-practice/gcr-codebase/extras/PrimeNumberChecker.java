package extras;

import java.util.*;

public class PrimeNumberChecker
{
	
	 public static boolean isPrime(int n)
	    {
	        if (n <= 1)
	        {
	            return false;
	        }

	        for (int i = 2; i <= n / 2; i++)
	        {
	            if (n % i == 0)
	            {
	                return false;
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args)
	    {
	        //Open Scanner
	        Scanner kb = new Scanner(System.in);

	        //User Input
	        System.out.print("Enter a number :-");
	        int n = kb.nextInt();

	        //calling method
	        boolean result = isPrime(n);

	        //Display
	        if (result) 
	        {
	            System.out.println("Prime Number");
	        }
	        
	        else {
	            System.out.println("Not a Prime Number");
	        }

	        //Scanner closed
	        kb.close();
	        
	    }

}
