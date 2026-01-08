package methods;

import java.util.*;

public class TemperatureWindSpeed 
{
	 public static void main(String[] args) {

	        // Open Scanner
	        Scanner kb = new Scanner(System.in);

	        // User Input temperature
	        System.out.println("Enter Temperature");
	        
	        double temp = kb.nextDouble();

	        // User Input wind speed
	        System.out.println("Enter speed-:");
	        double speed = kb.nextDouble();

	        // calling method
	        
	        double windChill = calculateWindChill(temp, speed);

	        // Display
	        
	        System.out.println("Wind Chill Temperature -:" + windChill);

	        // Scanner closed
	        kb.close();
	    }

	    // method to calculate wind chill
	 
	    public static double calculateWindChill(double temperature, double windSpeed)
	    {
	    	
	        return 35.74 + (0.6215 * temperature)+(0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
	    }

}
