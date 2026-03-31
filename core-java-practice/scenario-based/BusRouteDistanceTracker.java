package scenario_based;

import java.util.*;

public class BusRouteDistanceTracker
{
	public static void main(String[] args) {

        //Open Scanner
        Scanner kb = new Scanner(System.in);

        //total distance 
        double totalDist = 0;

       
        String status = "no";

        //while loop to keep adding distance
        while (status.equalsIgnoreCase("no"))
        {
            // User Input distance for next stop
            System.out.print("Enter distance to next stop in km :- ");
            
            double dist = kb.nextDouble();

            
            totalDist = totalDist + dist;
            //Display total distance
            
            System.out.println("Total distance travelled -:" + totalDist + " km");

            //asking if passenger wants to get off
            
            System.out.print("Do you want to get off the bus enter (yes/no) :- ");
            
            status= kb.next();
        }

        //Display 
        System.out.println("Total distance travelled = " + totalDist + " km");

        //Scanner closed
        kb.close();
    }


}
