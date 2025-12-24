package methods;

import java.util.*;

public class QuadraticEquation {
	
	public static void main(String[] args) {

        //Open Scanner
        Scanner kb= new Scanner(System.in);

        // User Input
        System.out.print("Enter a :-");
        
        double a = kb.nextDouble();

        System.out.print("Enter b :-");
        double b = kb.nextDouble();

        System.out.print("Enter c :-");
        double c = kb.nextDouble();

        //calling method
        double[] roots = findRoots(a, b, c);

        // Display
        if (roots.length == 0) {
            System.out.println("No real roots");
        }
        else if (roots.length == 1) {
            System.out.println("Root = " + roots[0]);
        }
        else
        {
            System.out.println("Root 1 = " + roots[0]);
            System.out.println("Root 2 = " + roots[1]);
        }

        //Scanner closed
        kb.close();
    }

    //method to find roots
    public static double[] findRoots(double a, double b, double c)
    {
        double d = Math.pow(b, 2) - 4 * a * c;

        if (d > 0)
        {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            
            return new double[]{r1, r2};
        }
        else if (d == 0)
        {
            double r = -b / (2 * a);
            
            return new double[]{r};
        }
        else
        {
            return new double[]{};
        }
    }

}
