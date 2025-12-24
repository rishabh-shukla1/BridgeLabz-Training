package methods;
import java.util.*;

public class LeapYear 
{
	 public static void main(String[] args)
	 {

	        //Open Scanner
	        Scanner kb = new Scanner(System.in);

	        //User Input
	        System.out.print("Enter year :- ");
	        int year = kb.nextInt();

	        //calling method
	        boolean result = checkLeapYear(year);

	        //Display
	        if (result) {
	            System.out.println("Year is a Leap Year");
	        }
	        else {
	            System.out.println("Year is not a Leap Year");
	        }

	        //Scanner closed
	        kb.close();
	    }

	    // method to check leap year
	    public static boolean checkLeapYear(int year)
	    {
	        if (year>= 1582)
	        {
	            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
	                return true;
	        }
	        return false;
	    }

}
