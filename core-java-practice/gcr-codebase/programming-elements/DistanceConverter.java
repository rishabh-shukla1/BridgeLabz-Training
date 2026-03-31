package programming_elements;
import java.util.*;
public class DistanceConverter {
	
	 public static void main(String[] args) {

	        
	        Scanner kb = new Scanner(System.in);

	        // Taking distance in feet
	        
	        System.out.print("Enter distance in feet:- ");
	        
	        double distanceInFeet = kb.nextDouble();

	        // Convert feet to yard
	      
	        double dinYard = distanceInFeet / 3;

	        // Convert yards to miles
	      
	        double dinMile = dinYard / 1760;

	      
	        System.out.println("The distance in feet is " + distanceInFeet + " while in yards is " + dinYard +
	                           " and miles is " + dinMile);

	        
	        kb.close();
	    }
	}

	

