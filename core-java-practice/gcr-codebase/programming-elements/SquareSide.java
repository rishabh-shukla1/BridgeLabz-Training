package programming_elements;
import java.util.Scanner;

public class SquareSide {
	

	
	    public static void main(String[] args) {

	        
	        Scanner kb= new Scanner(System.in);

	        // Perimeter input from user
	        System.out.print("Enter the perimeter of the square: ");
	        
	        double p = kb.nextDouble();

	        // Calculating side length 
	        
	        double side = p / 4;

	      
	        System.out.println("The length of the side is " + side +" whose perimeter is " + p);

	       
	        kb.close();
	    }
	

}
