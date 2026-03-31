package scenario_based.vehicle_system;
import java.util.*;

public class VehicleRentalSystem {
	
	 private List<Vehicle> vehicles = new ArrayList<>();

	    // CREATE
	    public void addVehicle(Vehicle v)
	    {
	        vehicles.add(v);
	        System.out.println("Vehicle Added");
	    }

	    // READ
	    public void displayVehicles()
	    {
	        for(Vehicle v : vehicles)
	        {
	            v.display();  
	        }
	    }

	    // UPDATE
	    public void updateRate(int id, int newRate)
	    {
	        for(Vehicle v : vehicles)
	        {
	            if(v.getVehicleId() == id)
	            {
	                v.rentPerDay = newRate;
	                System.out.println("Rate Updated");
	                return;
	            }
	        }
	        System.out.println("Vehicle Not Found");
	    }

	    // DELETE
	    public void deleteVehicle(int id)
	    {
	        Iterator<Vehicle> itr = vehicles.iterator();
	        while(itr.hasNext())
	        {
	            Vehicle v = itr.next();
	            if(v.getVehicleId() == id)
	            {
	                itr.remove();
	                System.out.println("Vehicle Deleted");
	                return;
	            }
	        }
	        System.out.println("Vehicle Not Found");
	    }
}


