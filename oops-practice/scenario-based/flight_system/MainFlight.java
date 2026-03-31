package scenario_based.flight_system;
import java.util.*;

public class MainFlight {
	
	public static void main(String args[])
    {
        FlightServices service = new FlightServices();
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("1. Search Flight");
            System.out.println("2. Book Flight");
            System.out.println("3. View Bookings");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter Source: ");
                    String from = sc.next();
                    System.out.print("Enter Destination: ");
                    String to = sc.next();
                    service.searchFlights(from, to);
                    break;

                case 2:
                    System.out.print("Enter Flight ID: ");
                    int id = sc.nextInt();
                    service.bookFlight(id);
                    break;

                case 3:
                    service.showBookings();
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }

}
