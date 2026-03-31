package functional_interfaces;

import java.util.function.Predicate;

public class TemperatureAlert {
	
	   public static void main(String[] args) {

	        double threshold = 40.0;
	        
	        Predicate<Double> s=t->t >threshold;
	        
	        
	        double currentTemp = 45.5;
	        
	       if( s.test(currentTemp)) {
	    	    System.out.println("ALERT! High Temperature");
	        } else {
	            System.out.println("Temperature Normal");
	        }
	   }
	   


}
