package scenario_based;
import java.util.*;

public class EmployeeWage
{
	 //Constants
     static final int WagerPerHour = 20;
     static final int FullDayHour = 8;
     static final int PartTimeHour = 4;
     static final int WorkingDays = 20;
     static final int MaxWorkingHours = 100;

    //Method to check employee attendance
    public static int checkAttendance()
    {
        Random random = new Random();
        // 0 = Absent, 1 = Present
        return random.nextInt(2); 
        
    }

    //Method to calculate daily wage
    
    public static int calculateDailyWage(int hrs)
    {
        return hrs *WagerPerHour;
    }

    //Main
    public static void main(String[] args)
    {

        System.out.println("Welcome to Employee Wage Computation Program");

        int totalWorkingDay = 0;
        int totalWorkingHour = 0;
        int totalSalary = 0;

        while (totalWorkingDay < WorkingDays && totalWorkingHour < MaxWorkingHours)
        {

            totalWorkingDay++;

            int attendance = checkAttendance();
            int workHours = 0;

            if (attendance == 1) {
            	
                Random random = new Random();
                
                int empType = random.nextInt(3);

                // Switch case for employee type
                switch (empType) 
                {
                    case 1:
                        workHours = FullDayHour;
                        System.out.println("Day " + totalWorkingDay + ":-Full Time Employee");
                        break;

                    case 2:
                        workHours = PartTimeHour;
                        System.out.println("Day " + totalWorkingDay + ":-Part Time Employee");
                        break;

                    default:
                        workHours = 0;
                        System.out.println("Day " + totalWorkingDay + ":-Employee Absent");
                }
            } 
            else 
            {
                System.out.println("Day " + totalWorkingDay + ":-Employee Absent");
            }

            //Prevent exceeding
            if (totalWorkingHour + workHours > MaxWorkingHours) 
            {
                workHours = MaxWorkingHours - totalWorkingHour;
            }

            totalWorkingHour += workHours;
            int dailyWage = calculateDailyWage(workHours);
            totalSalary += dailyWage;
        }

       
        System.out.println("Total Working Days :-" + totalWorkingDay);
        System.out.println("Total Working Hours:-" + totalWorkingHour);
        System.out.println("Total Salary       :-" + totalSalary);
        System.out.println("Thank You");
    }
}
