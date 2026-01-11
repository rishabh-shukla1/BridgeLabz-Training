package scenario_based.flight_system;

public class Flight {
	
	private int flightId;
    private String source;
    private String destination;
    private int seats;
    private double price;

    public Flight(int flightId, String source, String destination, int seats, double price)
    {
        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.seats = seats;
        this.price = price;
    }

    public int getFlightId()
    {
        return flightId;
    }

    public String getSource()
    {
        return source;
    }

    public String getDestination()
    {
        return destination;
    }

    public int getSeats()
    {
        return seats;
    }

    public void reduceSeat()
    {
        seats--;
    }

    public void display()
    {
        System.out.println("Flight ID : " + flightId);
        System.out.println("From      : " + source);
        System.out.println("To        : " + destination);
        System.out.println("Seats     : " + seats);
        System.out.println("Price     : " + price);
        System.out.println("------------------------");
    }

}
