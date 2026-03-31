package encapsulation_polymorphism;

interface GPS{
	void updateLocation(String location);
	String getCurrentLocation();
	
}

abstract class Vehicles{
	
	private int vehicleId;
	private String driverName;
	private double rate;
	private String currentLocation;
	
	Vehicles(int vehicleId, String driverName, double rate){
		
		this.vehicleId=vehicleId;
		this.driverName=driverName;
		setRate(rate);
	}
	
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		
		if(rate>0)
		{
			this.rate=rate;
		}
		else {
			System.out.println("Invalid");
		}
	}
	public abstract double calculateFare(double distance);
	
	void display() {
		System.out.println("VehicleId -:"+vehicleId);
		System.out.println("driverName -:"+driverName);
		System.out.println("Rate -:"+rate);
		
		
	}
	
	protected String getLocation()
	{
		return currentLocation;
	}
	protected void setLocation(String currentLocation) {
		
		this.currentLocation=currentLocation;
		
		
	}
	
}

class Cars extends Vehicles implements GPS
{

	Cars(int vehicleId, String driverName, double rate) {
		super(vehicleId, driverName, rate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void updateLocation(String location) {
		
		setLocation(location);
		
	}

	@Override
	public String getCurrentLocation() {
		// TODO Auto-generated method stub
		return getLocation();
	}

	@Override
	public double calculateFare(double distance) {
		// TODO Auto-generated method stub
		return distance * getRate();
	}
	
}
class Bikes extends Vehicles implements GPS
{

	Bikes(int vehicleId, String driverName, double rate) {
		super(vehicleId, driverName, rate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void updateLocation(String location)
	{
			
			setLocation(location);
			
	}

	@Override
	public String getCurrentLocation() {
		// TODO Auto-generated method stub
		return getLocation();
	}

	@Override
	public double calculateFare(double distance) {
		// TODO Auto-generated method stub
		return distance* getRate();
	}
	
}
class Auto extends Vehicles implements GPS
{

	Auto(int vehicleId, String driverName, double rate) {
		super(vehicleId, driverName, rate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void updateLocation(String location) {
		// TODO Auto-generated method stub
		setLocation(location);
		
	}

	@Override
	public String getCurrentLocation() {
		// TODO Auto-generated method stub
		return getLocation();
	}

	@Override
	public double calculateFare(double distance) {
		// TODO Auto-generated method stub
		return distance * getRate();
	}
	
}
public class RailHailingApplication
{
    public static void main(String[] args)
    {
        Vehicles v1 = new Cars(101, "Amit", 15);
        Vehicles v2 = new Bikes(102, "Ravi", 10);
        Vehicles v3 = new Auto(103, "Neha", 12);

        Vehicles[] veh = { v1, v2, v3 };

        double distance = 10;

        for (Vehicles v : veh)
        {
            calculateRideFare(v, distance);
            System.out.println("---------------------------");
        }
    }

    public static void calculateRideFare(Vehicles v, double distance)
    {
        double fare = v.calculateFare(distance);

        v.display();
        System.out.println("Distance   :- " + distance + " km");
        System.out.println("Fare       :- " + fare);
    }
}
