package arrays;
import java.util.*;

public class BmiUsingArray {
	public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        // User Input
        
        System.out.print("Enter number of persons:-");
        int n = kb.nextInt();
        

        //Define Array heigh,weight, bmi , status
        
        double[] height = new double[n];   // in meters
        double[] weight = new double[n];   // in kilograms
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Take input for height and weight
        for (int i = 0; i < n; i++) {
        	
            System.out.println("Enter details for Person "+(i+1));
            
            //User Height Input
            System.out.print("Height in meters:-");
            height[i] = kb.nextDouble();
            
            //User Weight Input
            System.out.print("Weight in kg:-");
            weight[i] = kb.nextDouble();

            // Valid or not
            if (height[i] <= 0 || weight[i] <= 0) 
            {
                System.out.println("Invalid input! Enter again");
                i--; 
            }
        }

        // Calculate BMI ans status
        
        for (int i = 0; i < n; i++)
        {

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5)
            {
                status[i] = "Underweight";
            } 
            else if (bmi[i] < 25)
            {
                status[i] = "Normal weight";
            } 
            else if (bmi[i] < 30)
            {
                status[i] = "Overweight";
            } 
            else
            {
                status[i] = "Obese";
            }
        }

        // Display  the report
        
        
        System.out.println("BMI Report---:");
        
        for (int i = 0; i < n; i++)
        {
            System.out.println("Person " + (i + 1));
            
            System.out.println("Height : " + height[i] + " m");
            
            System.out.println("Weight : " + weight[i] + " kg");
            
            System.out.println("BMI    : " + bmi[i]);
            
            System.out.println("Status : " + status[i]);
           
        }
        // CLose scanner
        
        kb.close();
    }

}
