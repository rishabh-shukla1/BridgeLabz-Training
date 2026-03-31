package key_words;

public class Vehicle 
{
	
	 //Static variable
    private static double registrationFee = 150;

    //Final variable
    private final String registrationNumber;

    private String ownerName;
    private String vehicleType;

    //Constructor using this
    Vehicle(String ownerName, String vehicleType, String registrationNumber)
    {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    //Display using instanceof
    public void display()
    {
        if (this instanceof Vehicle)
        {
            System.out.println("Owner Name:-" + ownerName);
            System.out.println("Vehicle Type:-" + vehicleType);
            System.out.println("Registration Number:-" + registrationNumber);
            System.out.println("Registration Fee:-" + registrationFee);
        }
    }
    //main
    public static void main(String[] args)
    {
        Vehicle v1 = new Vehicle("Honest raj", "Sedan", "ABC123");
        Vehicle v2 = new Vehicle("Price danish", "SUV", "XYZ789");

        v1.display();
        v2.display();
    }

}
