package scenario_based.vehicle_system;

public abstract class Vehicle implements IRentable{
	
	protected int vehicleId;
	protected String vehicleName;
	protected int rentPerDay;
	
	public Vehicle(int vehicleId, String vehicleName, int rentPerDay) {
		
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.rentPerDay = rentPerDay;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public int getRentPerDay() {
		return rentPerDay;
	}

	public void setRentPerDay(int rentPerDay) {
		this.rentPerDay = rentPerDay;
	}
	
	public abstract void display();

}
