package extras;

import java.util.*;

public class FactorialRecursion 
{
	//method to calculate factorial
	
    public static int factorial(int n)
    {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }

    public static void main(String[] args)
    {
        //Open Scanner
        Scanner kb = new Scanner(System.in);

        //User Input
        System.out.print("Enter a number :-");
        int n = kb.nextInt();

        //calling method
        int fact = factorial(n);

        //Display
        System.out.println("Factorial -:" + fact);

        // Scanner closed
        kb.close();
    }

}
