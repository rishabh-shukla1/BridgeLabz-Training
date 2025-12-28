package extras;

import java.time.*;

public class DateArithmetic 
{
	 public static LocalDate calculateDate(LocalDate date)
	    {
	        date = date.plusDays(7);
	        date = date.plusMonths(1);
	        date = date.plusYears(2);
	        date = date.minusWeeks(3);

	        return date;
	    }

	    public static void main(String[] args)
	    {
	        //User Input
	        LocalDate date = LocalDate.now();

	        //calling method
	        LocalDate result = calculateDate(date);

	        //Display
	        System.out.println("Original Date -:" + date);
	        System.out.println("Final Date -:" + result);
	    }

}
