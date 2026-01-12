package scenario_based.cab_booking;

public class Driver
{
	private int driverId;
	private String driverName;
	private boolean available;
	public Driver(int driverId, String driverName) {
		
		this.driverId = driverId;
		this.driverName = driverName;
		this.available = true;
	}
	
	public boolean getAvailability() {
		
		return available;
	}
	
	public void setAvailabilty(boolean a)
	{
		this.available=a;
	}
	
	public  String name() {
		
		return driverName;
	}	

}
