package methods;
import java.util.*;

public class QuotientAndReminder
{
	
	 public static void main(String[] args) 
	 {

	        // Open Scanner
	        Scanner kb = new Scanner(System.in);

	        // User Input number
	        System.out.println("Enter the Number:-");
	        int number = kb.nextInt();
             
	        // User Input divisor
	        System.out.println("Enter the divisor");
	        int divisor = kb.nextInt();

	        //calling method
	        
	        int[]result = findRemainderAndQuotient(number, divisor);

	        // Display
	        
	        System.out.println("Quotient -: " + result[0]);
	        System.out.println("Remainder -: " + result[1]);

	        //Scanner closed
	        kb.close();
	    }

	    // method to find quotient and remainder
	    public static int[] findRemainderAndQuotient(int number, int divisor)
	    {
	        return new int[]{number / divisor, number % divisor};
	    }

}
