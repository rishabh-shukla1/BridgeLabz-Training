package extras;
import java.util.*;

import java.time.*;

public class DateComparison 
{
	 public static void compare(LocalDate d1, LocalDate d2)
	    {
	        if (d1.isBefore(d2))
	        {
	            System.out.println("First date is before second date");
	        }
	        else if (d1.isAfter(d2))
	        {
	            System.out.println("First date is after second date");
	        }
	        else
	        {
	            System.out.println("Both dates are same");
	        }
	    }

	    public static void main(String[] args)
	    {
	    	 //Open Scanner
	        Scanner kb = new Scanner(System.in);

	        //User Input for first date
	        System.out.print("Enter first date (yyyy-mm-dd) :-");
	        String s1 = kb.next();

	        //User Input for second date
	        System.out.print("Enter second date (yyyy-mm-dd) :-");
	        String s2 = kb.next();

	        //converting string to LocalDate
	        
	        LocalDate d1 = LocalDate.parse(s1);
	        LocalDate d2 = LocalDate.parse(s2);

	        //calling method
	        compare(d1, d2);

	        //Scanner closed
	        kb.close();
	    }

}
