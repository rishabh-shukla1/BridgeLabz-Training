package scenario_based.flight_system;
import java.util.*;

public class FlightServices {
	
	private Flight[] flights = new Flight[5];
    private List<Booking> bookings = new ArrayList<>();

    public FlightServices()
    {
        flights[0] = new Flight(101, "Delhi", "Mumbai", 5, 4500);
        flights[1] = new Flight(102, "Delhi", "Chennai", 4, 6000);
        flights[2] = new Flight(103, "Mumbai", "Delhi", 6, 4700);
        flights[3] = new Flight(104, "Pune", "Delhi", 3, 5000);
        flights[4] = new Flight(105, "Delhi", "Pune", 2, 4200);
    }

    // Search Flights
    public void searchFlights(String from, String to)
    {
        boolean found = false;

        for(Flight f : flights)
        {
            if(f.getSource().equalsIgnoreCase(from) &&
               f.getDestination().equalsIgnoreCase(to))
            {
                f.display();
                return;
            }
        }

        
            System.out.println("No flights found.");
        
    }

    // Book Flight
    public synchronized void bookFlight(int flightId)
    {
        for(Flight f : flights)
        {
            if(f.getFlightId() == flightId)
            {
                if(f.getSeats() > 0)
                {
                    bookings.add(new Booking(f));
                    f.reduceSeat();
                    System.out.println("Flight booked successfully!");
                    return;
                }
                else
                {
                    System.out.println("No seats available.");
                    return;
                }
            }
        }
        System.out.println("Invalid Flight ID");
    }

    // Show Bookings
    public void showBookings()
    {
        if(bookings.isEmpty())
        {
            System.out.println("No bookings yet.");
            return;
        }

        for(Booking b : bookings)
        {
            b.displayBooking();
        }
    }

}
