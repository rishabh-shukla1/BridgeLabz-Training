package scenario_based;
import java.util.*;

public class FitnessChallengeTracker
{
	public static void main(String[] args) {
        //Open Scanner
		
        Scanner sc = new Scanner(System.in);
         //Define array
        int[] pushUp = new int[7];
        int total = 0;
        int activeDay = 0;

        System.out.println("Enter push-ups for 7 days and enter 0 for rest day:");

        //Input from user
        for (int i = 0; i < pushUp.length; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            pushUp[i] = sc.nextInt();
        }

      
        for (int i : pushUp) {

            // Skip rest days
            if (i == 0) {
                continue;
            }

            total += i;
            
            activeDay++;
        }

        double average = (double) total / activeDay;

        System.out.println("\nTotal push-ups in the week = " + total);
        System.out.println("Average push-ups per active day = " + average);

        sc.close();
    }

}
