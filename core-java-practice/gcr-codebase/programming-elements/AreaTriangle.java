package programming_elements;
import java.util.*;

public class AreaTriangle {


		public static void main(String[] args) {

	      
	        Scanner kb = new Scanner(System.in);

	        // Taking base of triangle
	        
	        System.out.print("Enter base of the triangle (in inches):- ");
	        double base = kb.nextDouble();

	        // Taking height 
	        System.out.print("Enter height of the triangle (in inches):- ");
	        
	        double height = kb.nextDouble();

	        // Calculating area 
	        
	        double area = 0.5 * base * height;

	        
	        double areaInSqCm = area * 6.4516;

	   
	        System.out.println("The area of the triangle in square inches is " + area +
	            " and in square centimeters is " + areaInSqCm
	        );

	      
	        kb.close();
	    

	}

}
