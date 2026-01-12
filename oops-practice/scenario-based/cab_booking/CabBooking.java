package scenario_based.cab_booking;

public class CabBooking
{
	public static void main(String args[])
	{
		
		RideManagement r=new RideManagement();
		r.addDriver(new Driver(101,"rajkumar"));
		r.addDriver(new Driver(102,"raju"));
		
		User u=new User(1,"Ram");
		
		try {
			
			fareCalculator fc=new Peak();
			
			Ride r1=r.bookRide(1, 10, u, fc, "Booked");
			
			System.out.println("Ride booked");
			
			
		}
		catch(Exception e) {
			System .out.print(e.getMessage());
		}
		
		r.showRides();
	}

}
