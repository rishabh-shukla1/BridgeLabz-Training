package constructor;

public class Vehicle 
{
	//Instance variables
    private String ownerName;
    private String vehicleType;

    //Class variable (static)
    private static double registrationFee = 5000;   

    //Constructor
    Vehicle(String ownerName, String vehicleType) 
    {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    public void displayVehicleDetails() 
    {
        System.out.println("Owner Name        :-" + ownerName);
        System.out.println("Vehicle Type      :-" + vehicleType);
        System.out.println("Registration Fee  :-" + registrationFee);
    }

    // Class method
    public static void updateRegistrationFee(double newFee) 
    {
        registrationFee = newFee;
    }

    public static void main(String[] args)
    {
        Vehicle v1 = new Vehicle("Rishabh", "Car");
        Vehicle v2 = new Vehicle("Amit", "Bike");

        System.out.println("Before Fee Update:-");
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();

        //Update registration fee for all vehicles
        
        Vehicle.updateRegistrationFee(6500);

        System.out.println("After Fee Update:-");
        
        v1.displayVehicleDetails();
        
        System.out.println();
        
        v2.displayVehicleDetails();
    }

}
