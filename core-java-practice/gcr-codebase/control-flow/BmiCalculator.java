package control_flow;
import java.util.*;
public class BmiCalculator {
	public static void main(String[] args) {

        Scanner kb= new Scanner(System.in);

        // weight user input
        
        System.out.print("Enter weight in kg:-");
        
        double weight = kb.nextDouble();
        
        // height user input
        
        System.out.print("Enter height in cm: ");
        
        double heightCm = kb.nextDouble();

        // Convert height  cm to meters
        
        double heightMeter = heightCm / 100;

        // Calculate BMI
        
        double bmi = weight / (heightMeter * heightMeter);

       
        String stat;

        if (bmi <= 18.4) 
        {
            stat = "Underweight";
        } 
        else if (bmi >= 18.5 && bmi <= 24.9) 
        {
            stat = "Normal";
        } 
        else if (bmi >= 25.0 && bmi <= 39.9) 
        {
            stat = "Overweight";
        }
        else
        {
            stat = "Obese";
        }

        // result
        
        System.out.println("\nBMI Value: " + bmi);
        
        System.out.println("Weight Status: " + stat);

        kb.close();
    }

}
