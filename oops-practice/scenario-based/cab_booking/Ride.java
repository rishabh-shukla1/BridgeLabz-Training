package scenario_based.cab_booking;

public class Ride 
{
	private int rideId;
	private Driver d;
	private User u;
	private int distance;
	private int fare;
	private String status;
	
	public Ride(int rideId, Driver d, User u, int distance, int fare, String status) {
		
		this.rideId = rideId;
		this.d = d;
		this.u = u;
		this.distance = distance;
		this.fare = fare;
		this.status =status;
	}

	

	public int getRideId() {
		return rideId;
	}

	public int getDistance() {
		return distance;
	}

	
	public int getFare() {
		return fare;
	}
	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
