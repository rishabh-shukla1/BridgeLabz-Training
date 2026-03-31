package extras;

import java.time.*;
import java.time.format.*;

public class DateFormatting
{

	 public static void main(String[] args)
	    {
	        // current date
	        LocalDate date = LocalDate.now();

	        // formatters
	        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

	        // Display
	        System.out.println(date.format(f1));
	        System.out.println(date.format(f2));
	        System.out.println(date.format(f3));
	    }
	}
