package scenario_based.cab_booking;
import java.util.*;

public class RideManagement
{
	
	

	private List<Driver> d=new ArrayList<>();
	private List<Ride> r=new ArrayList<>();
	
	public void addDriver(Driver drivers) 
	{
		d.add(drivers);
	}
	public  Driver checkAvailabilty() throws NoDriverAvailableException{
		
		for(Driver driver:d) {
			
			if(driver.getAvailability()) {
				return driver;
			}
		}
		
		 throw new NoDriverAvailableException("Driver Not avaivalabe");
	}
	
	 public Ride bookRide(int rideId, int distance ,User u,fareCalculator f, String status) throws NoDriverAvailableException {
		 
		 Driver driver=checkAvailabilty();
		 driver.setAvailabilty(false);
		 int fare=f.FareCalculator(distance);
		 
		 Ride ride = new Ride(rideId, driver, u,  distance,  fare, status);
		 
		 
		 r.add(ride);
		 
		 return ride;
		 
		 
		
	}
	 public void showRides()
	    {
	        for (Ride ride : r)
	        {
	            System.out.println("Ride Id  : " + ride.getRideId());
	            System.out.println("Distance : " + ride.getDistance());
	            System.out.println("Fare     : " + ride.getFare());
	            System.out.println("--------------------------");
	        }
	    }
	
	

}
