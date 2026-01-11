package scenario_based.flight_system;

public class Booking {
	
	private Flight flight;

    Booking(Flight flight)
    {
        this.flight = flight;
    }

    public void displayBooking()
    {
        System.out.println("Booked Flight Details:");
        flight.display();
    }

}
