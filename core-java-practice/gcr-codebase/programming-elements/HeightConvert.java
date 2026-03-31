package programming_elements;
import java.util.*;

public class HeightConvert {
	
	 public static void main(String[] args) {

		 Scanner kb = new Scanner(System.in);

	       // enter height from user
		 
	        System.out.print("Enter your height in centimeters: ");
	        double heightinCm = kb.nextDouble();

	        // Converting centimeters to total inches
	        
	        double tInche = heightinCm / 2.54;

	        // Calculating feet from total inches
	        
	        int feet = (int) (tInche / 12);

	        // Calculating remaining inches
	        double inche = tInche % 12;

	       
	        System.out.println("Your Height in cm is " + heightinCm +
	                           " while in feet is " + feet +
	                           " and inches is " + inche);

	       
	        kb.close();
	    }

}
