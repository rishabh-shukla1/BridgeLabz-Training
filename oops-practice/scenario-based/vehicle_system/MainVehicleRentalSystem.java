package scenario_based.vehicle_system;

public class MainVehicleRentalSystem {
	
	public static void main(String[] args) 
	{
		    VehicleRentalSystem service = new VehicleRentalSystem();

	        // Creating Vehicles
	        Vehicle v1 = new Bike(1, "Honda Bike", 300);
	        Vehicle v2 = new Car(2, "Hyundai Car", 1000);
	        Vehicle v3 = new Truck(3, "Tata Truck", 2000);

	        // CREATE
	        service.addVehicle(v1);
	        service.addVehicle(v2);
	        service.addVehicle(v3);

	        System.out.println("----- Vehicle List -----");
	        service.displayVehicles();

	        // RENT calculation using interface
	        System.out.println("Rent of Car for 3 days : " + v2.calculateRent(3));

	        // UPDATE
	        service.updateRate(1, 350);

	        // DELETE
	        service.deleteVehicle(3);

	        System.out.println("----- After Update -----");
	        service.displayVehicles();
	    }
	}


