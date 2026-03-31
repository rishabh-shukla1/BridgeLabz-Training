package scenario_based;

import java.util.*;
public class BMIFitnessTracker {

	public static void main(String[] args) {
		
		 
        Scanner kb = new Scanner(System.in);

        // User Input height
        System.out.print("Enter height in meter:- ");
        double height = kb.nextDouble();

        // User Input weight in kilograms
        System.out.print("Enter weight in kilogram:- ");
        double weight = kb.nextDouble();

        // Calculate BMI using formula
        double bmiCalculation= weight / (height * height);

        // Printing the bmi value
        System.out.println("Your BMI is :- " + bmiCalculation);

        // Display the Category according to given parameters
        
        if ( bmiCalculation < 18.5) {
        	
            System.out.println("Category:- Underweight");
        } 
        else if (bmiCalculation < 25) {
            System.out.println("Category:- Normal");
        }
        else {
            System.out.println("Category:- Overweight");
        }

       
        kb.close();
		

	}

}
