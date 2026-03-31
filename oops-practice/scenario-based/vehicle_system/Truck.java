package scenario_based.vehicle_system;

public class Truck extends Vehicle {

	public Truck(int vehicleId, String vehicleName, int rentPerDay) {
		super(vehicleId, vehicleName, rentPerDay);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateRent(int days) {
		// TODO Auto-generated method stub
		return days*getRentPerDay();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("TruckID     : " + vehicleId);
        System.out.println("Brand      : " + vehicleName);
        System.out.println("Rate / Day : " + rentPerDay);
        System.out.println("------------------------");
		
	}
	

}
