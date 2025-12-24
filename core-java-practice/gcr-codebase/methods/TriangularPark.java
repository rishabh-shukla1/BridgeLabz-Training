package methods;
import java.util.*;

public class TriangularPark 
{
	public static void main(String[] args)
	{

        // Open Scanner
        Scanner kb = new Scanner(System.in);

        // User Input first side
        System.out.print("Enter first side :-");
        double a = kb.nextDouble();

        // User Input second side
        System.out.print("Enter second side :-");
        double b = kb.nextDouble();

        // User Input third side
        System.out.print("Enter third side -");
        double c = kb.nextDouble();

        // calling method
        double rounds = findRounds(a, b, c);

        // Display
        System.out.println("Number of rounds required to complete 5 km = " + rounds);

        // Scanner closed
        kb.close();
    }

    // Method to calculate rounds
    public static double findRounds(double x, double y, double z)
    {
        double perimeter = x + y + z;
        return 5000 / perimeter;
    }

}
