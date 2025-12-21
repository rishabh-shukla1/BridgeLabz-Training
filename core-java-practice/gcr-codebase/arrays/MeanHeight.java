package array;
import java.util.*;

public class MeanHeight {
	
	public static void main(String[] args) {

        Scanner kb= new Scanner(System.in);

        // Define Array size 11
        
        double[] height = new double[11];
        // Store total sum
        double sum = 0.0;

        // User input of heights
        
        System.out.println("Enter the heights of 11 football players:-");
        
        for (int i = 0; i < height.length; i++) 
        {
            height[i] = kb.nextDouble();
        }

        // Calculate Sum
        for (int i = 0; i < height.length; i++)
        {
            sum = sum + height[i];
        }

        //  Mean Calculation 
        
        double mean = sum / height.length;

        
        System.out.println("Mean Height of the Football Team -: " + mean);

        kb.close();
    }
	
	

}
