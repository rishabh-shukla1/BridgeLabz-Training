package methods;
import java.util.*;

public class Trignometry
{
	 public static void main(String[] args)
	 {

	        // Open Scanner
	        Scanner kb = new Scanner(System.in);

	        //User Input angle
	        System.out.println("Enter the angle-:");
	        double angle = kb.nextDouble();

	        //calling method
	        double[] result = calculateTrigonometry(angle);

	        // Display
	        
	        System.out.println("Sin = " + result[0]);
	        System.out.println("Cos = " + result[1]);
	        System.out.println("Tan = " + result[2]);

	       //Scanner closed
	        kb.close();
	    }

	    //method to calculate trigonometric values
	    public static double[] calculateTrigonometry(double angle)
	    {
	        double rad = Math.toRadians(angle);

	        return new double[]{Math.sin(rad),Math.cos(rad), Math.tan(rad)
	        };
	    }

}
