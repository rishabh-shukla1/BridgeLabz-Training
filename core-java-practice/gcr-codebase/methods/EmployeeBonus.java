package methods;

public class EmployeeBonus 
{
	// method to generate salary and years
	
    public static double[][] generateData()
    {
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++)
        {
            data[i][0] = (int)(Math.random() * 90000) + 10000;
            
            data[i][1] = (int)(Math.random() * 10) + 1;
        }
        return data;
    }

    // method to calculate new salary and bonus
    
    public static double[][] calculateBonus(double[][] data)
    {
    	//to store the result
    	
        double[][] result = new double[10][2];

        for (int i = 0; i < 10; i++)
        {
            double salary = data[i][0];
            double years = data[i][1];
            double bonus;
            

            if (years > 5)
            {
                bonus = salary * 0.05;
            }
            else
            {
                bonus = salary * 0.02;
            }

            result[i][0] = salary + bonus;
            result[i][1] = bonus;
        }
        return result;
    }

    public static void main(String[] args)
    {
        double[][] data = generateData();
        double[][] newData = calculateBonus(data);

        // Display
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Old Salary = " + data[i][0] +" Years = " + data[i][1] +" New Salary = " + newData[i][0] +
                               " Bonus = " + newData[i][1]);
        }
    }

}
