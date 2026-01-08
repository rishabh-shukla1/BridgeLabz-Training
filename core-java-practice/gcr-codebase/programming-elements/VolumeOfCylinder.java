package programming_elements;

import java.util.*;

public class VolumeOfCylinder {

	 public static void main(String[] args) {
	        Scanner kb = new Scanner(System.in);

	        // Input radius
	        System.out.print("Enter the radius of the cylinder:- ");
	        
	        double radius = kb.nextDouble();

	        // Input height
	        System.out.print("Enter the height of the cylinder:- ");
	        
	        double height = kb.nextDouble();

	        // Calculate volume
	        
	        double volume = Math.PI * radius * radius * height;

	        
	        System.out.println("Volume of the cylinder is: " + volume);

	        kb.close();
	    }
}
