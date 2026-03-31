package string;
import java.util.*;
public class BmiCalculator {
	
	public static String[][] calculateBMI(int[][] data) 
	{
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++)
        {
            double weight = data[i][0];
            double heightMeters = data[i][1] / 100.0;

            double bmi = weight / (heightMeters * heightMeters);
            
            bmi = Math.round(bmi * 100.0) / 100.0;

            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";

            result[i][0] = String.valueOf(data[i][1]);
            
            result[i][1] = String.valueOf(data[i][0]);
            
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }
        return result;
    }

    // Display method
    public static void display(String[][] result) 
    {
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\tStatus");
     

        for (String[] row : result)
        {
            System.out.println(row[0] + "\t\t" + row[1] + "\t\t" + row[2] + "\t" + row[3]);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] data = new int[10][2];

        for (int i = 0; i < 10; i++)
        {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextInt();
            System.out.print("Enter height (cm): ");
            data[i][1] = sc.nextInt();
        }

        String[][] result = calculateBMI(data);
        display(result);
        //Close Scanner 
        
        sc.close();
    }

}
