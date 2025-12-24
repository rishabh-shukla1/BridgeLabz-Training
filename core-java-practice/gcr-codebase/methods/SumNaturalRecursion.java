package methods;
import java.util.*;

public class SumNaturalRecursion
{
	public static void main(String[] args) 
	{

        //Open Scanner
        Scanner kb = new Scanner(System.in);

        //User Input
        System.out.print("Enter a natural number : ");
        int n = kb.nextInt();

        //calling methods
        int sumRecusrion = findSumRecursion(n);
        
        int sumFormula = findSumFormula(n);

        //Display
        System.out.println("Sum using recursion = " + sumRecusrion);
        System.out.println("Sum using formula = " + sumFormula);

        if (sumRecusrion == sumFormula)
            System.out.println("Both results are equal");

        // Scanner closed
        kb.close();
    }

    //method using recursion
    public static int findSumRecursion(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        return n + findSumRecursion(n - 1);
    }
    

    //method using formula
    public static int findSumFormula(int n)
    {
    	
        return n * (n + 1) / 2;
    }

}
