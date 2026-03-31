package string;
import java.util.*;

public class Calendar {
	
	public static boolean isLeapYear(int year) 
	{
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        //User input
        System.out.println("Enter month");
        int month = sc.nextInt();
        System.out.println("Enter year");
        int year = sc.nextInt();

        String[] months = {"", "January","February","March","April","May","June",
                           "July","August","September","October","November","December"};
        
        int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        if (month == 2 && isLeapYear(year)) days[2] = 29;
        

        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;

        System.out.println(months[month] + " " + year)
        ;
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < d0; i++) 
        	System.out.print("    ");
        for (int i = 1; i <= days[month]; i++) 
        {
            System.out.printf("%3d ", i);
            
            if ((i + d0) % 7 == 0)
            	System.out.println();
            
        }
        
        sc.close();
    }

}
