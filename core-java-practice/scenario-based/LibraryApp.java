package scenario_based;

import java.util.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;


public class LibraryApp 
{
 
    public static void main(String[] args) {
    	
        //Open Scanner
        Scanner kb= new Scanner(System.in);
        int finePerDay = 5;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Rohan’s Library Fine Calculator");

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nBook " + i);
            //User Input
            System.out.print("Enter Due Date (dd-mm-yyyy): ");
            String dueInput = kb.nextLine();

            System.out.print("Enter Return Date (dd-mm-yyyy): ");
            String returnInput = kb.nextLine();
            // Tp convert string to localdate
            
            LocalDate dueDate = LocalDate.parse(dueInput, formatter);
            LocalDate returnDate =LocalDate.parse(returnInput, formatter);

            displayDates(dueDate, returnDate);

            long late =ChronoUnit.DAYS.between(dueDate, returnDate);
            

            if (late > 0)
            {
                long fine = late * finePerDay;
                System.out.println("Late by " + late + " days");
                System.out.println("Fine -:" + fine);
            } 
            else
            {
                System.out.println("Returned on time. No fine.");
            }
        }

        kb.close();
    }

   

    //Display formatted dates
    public static void displayDates(LocalDate dueDate, LocalDate returnDate) {
        System.out.println("Due Date    :- " + dueDate);
        System.out.println("Return Date :- " + returnDate);
    }

}
