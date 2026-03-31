package methods;
import java.util.*;

public class Chocolates {
	
	 public static void main(String[] args)
	 {

	        // Open Scanner
	        Scanner kb = new Scanner(System.in);

	        //User Input chocolates
	        System.out.println("Enter the number of Choclates:-");
	        
	        int chocolates = kb.nextInt();
                
	        //User Input children
	        System.out.println("Enter Number of Children");
	        
	        int children = kb.nextInt();

	        // calling method
	        
	        int[] result = findRemainderAndQuotient(chocolates, children);

	        // Display
	        
	        System.out.println("Each child gets = " + result[0]);
	        System.out.println("Remaining chocolates = " + result[1]);

	        // Scanner closed
	        kb.close();
	    }

	    // method to calculate chocolates distribution
	 
	    public static int[] findRemainderAndQuotient(int num, int div)
	    {
	    	
	        return new int[]{num / div, num % div};
	    }

}
