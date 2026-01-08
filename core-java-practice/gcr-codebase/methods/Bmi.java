package methods;

import java.util.*;

public class Bmi
{
	public static void main(String[] args) {

        // Open Scanner
        Scanner kb = new Scanner(System.in);

        // 2D array to store weight, height and bmi
        double[][] data = new double[10][3];

        //array to store BMI status
        String[] stat = new String[10];

        // User Input
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Enter weight of person " + (i + 1) + " in kg :- ");
            
            data[i][0] = kb.nextDouble();

            System.out.print("Enter height of person " + (i + 1) + " in cm :- ");
            
            data[i][1] = kb.nextDouble();
        }

        // calling method to calculate BMI
        calculateBMI(data);

        // calling method to find BMI stat
        
        stat = findBMIstat(data);

        // Display
        
        System.out.println("\nWeight\tHeight\tBMI\t\tstat");

        for (int i = 0; i < 10; i++)
        {
        	
            System.out.println(data[i][0] + "\t" + data[i][1] + "\t" + data[i][2] + "\t\t" + stat[i]);
        }

        //Scanner closed
        kb.close();
    }

    // method to calculate BMI
    public static void calculateBMI(double[][] data)
    {
        for (int i = 0; i < data.length; i++)
        {
        	
            double heightInMeter = data[i][1] / 100;
            
            data[i][2] = data[i][0] / (heightInMeter * heightInMeter);
        }
    }

    // method to find BMI stat
    public static String[] findBMIstat(double[][] data)
    {
        String[] r = new String[data.length];

        for (int i = 0; i < data.length; i++)
        {
            double bmi = data[i][2];

            if (bmi <= 18.4)
            {
                r[i] = "Underweight";
            }
            else if (bmi >= 18.5 && bmi <= 24.9)
            {
                r[i] = "Normal";
            }
            else if (bmi >= 25.0 && bmi <= 39.9)
            {
                r[i] = "Overweight";
            }
            else
            {
                r[i] = "Obese";
            }
        }

        return r;
    }

}
