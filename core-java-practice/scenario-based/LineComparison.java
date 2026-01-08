package scenario_based;
import java.util.*;

public class LineComparison 
{
	public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");
        //Open Scanner
        
        Scanner kb= new Scanner(System.in);

        //User Input
        System.out.println("Enter x1, y1, x2, y2 for Line 1:-");
        double x1 = kb.nextDouble();
        double y1 = kb.nextDouble();
        double x2 = kb.nextDouble();
        double y2 = kb.nextDouble();

        // User Input
        System.out.println("Enter x3, y3, x4, y4 for Line 2:-");
        double x3 = kb.nextDouble();
        double y3 = kb.nextDouble();
        double x4 = kb.nextDouble();
        double y4 = kb.nextDouble();

        //Length Calculation
        double length1 = calLength(x1, y1, x2, y2);
        double length2 = calLength(x3, y3, x4, y4);

        System.out.println("Length of Line 1 -:" + length1);
        
        System.out.println("Length of Line 2 -:" + length2);

        //Equality Check using equals
        Double l1 = length1;
        Double l2 = length2;

        if (l1.equals(l2))
        {
            System.out.println("Both lines are Equal");
        } 
        else 
        {
            System.out.println("Both lines are Not Equal");
        }

        //Compare using compareTo
        int comp= l1.compareTo(l2);

        if (comp== 0) 
        {
            System.out.println("Both lines are Equal");
        }
        else if (comp > 0) {
            System.out.println("Line 1 is Greater than Line 2");
        } 
        else {
            System.out.println("Line 1 is Less than Line 2");
        }
        
        kb.close();
        
    }

    //Method to calculate length
    public static double calLength(double x1, double y1, double x2, double y2) 
    {

        double len = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return len;
    }

}
