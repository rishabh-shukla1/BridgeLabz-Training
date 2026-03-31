package inheritance;

class Device
{
    String deviceId;
    String status;

    Device(String deviceId, String status)
    {
        this.deviceId = deviceId;
        this.status = status;
    }
}

//Subclass
class Thermostat extends Device
{
    int temperatureSetting;

    Thermostat(String deviceId, String status, int temperatureSetting)
    {
        super(deviceId,status);
        this.temperatureSetting = temperatureSetting;
    }

    //Method to display status
    void displayStatus()
    {
        System.out.println("Device ID   :-" + deviceId);
        System.out.println("Status      :-" + status);
        System.out.println("Temperature :-" + temperatureSetting);
    }
}

public class SmartPhone {
	
	 public static void main(String[] args)
	    {
	        Thermostat t = new Thermostat("T101", "ON", 24);
	        t.displayStatus();
	    }

}
