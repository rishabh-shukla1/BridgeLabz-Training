package array;

import java.util.*;

public class BmiUsingTwoDArray {
	
	public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        // User Input
        
        System.out.print("Enter number of persons:-");
        int number = kb.nextInt();

        // 2D ->array to store height, weight, BMI
       
        double[][] data = new double[number][3];

        //Store weight status
        String[] status = new String[number];

       
        for (int i = 0; i < number; i++) {

            System.out.println("Enter details for Person-:" + (i + 1));
            //Input Height
            System.out.print("Height in meters:-");
            data[i][0] = kb.nextDouble();
            //Input Weight
            
            System.out.print("Weight in kg:- ");
            data[i][1] = kb.nextDouble();

            // Validation
            
            if (data[i][0] <= 0 ||data[i][1] <= 0) 
            {
                System.out.println("Invalid input! Enter positive values.");
                i--;
            }
        }

        //Calculate BMI and  status
        
        for (int i = 0; i < number; i++) 
        {

            double height = data[i][0];
            
            double weight = data[i][1];

            // Bmi calculation
            data[i][2] = weight / (height * height);

            // Weight status
            if (data[i][2] < 18.5) 
            {
                  status[i] = "Underweight";
            } 
            else if (data[i][2] < 25) 
            {
                   status[i] = "Normal weight";
            } 
            else if (data[i][2] < 30)
            {
                  status[i] = "Overweight";
            } 
            else 
            {
                  status[i] = "Obese";
            }
        }

        // Display
        System.out.println("BMI Report ==>");
        
        for (int i = 0; i < number; i++)
        {
            System.out.println("Person-:" + (i + 1)+".");
            System.out.println("Height :- " + data[i][0] + " m");
            System.out.println("Weight :- " + data[i][1] + " kg");
            System.out.println("BMI    :- " + data[i][2]);
            System.out.println("Status :- " + status[i]);
            System.out.println();
        }
        //Close Scanner 
        kb.close();
    }

}
