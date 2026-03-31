package methods;

import java.util.*;

public class FactorProgramLevelThree
{
	 // method to find factors
    public static int[] findFactors(int n)
    {
        int count = 0;

        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
                count++;
        }

        int[] fact = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                fact[index] = i;
                index++;
            }
        }
        return fact;
    }

    //method to find greatest factor
    public static int findGreatest(int[] fact)
    {
        return fact[fact.length - 1];
    }

    //method to find sum
    public static int findSum(int[] f)
    {
        int sum = 0;
        for (int i = 0; i < f.length; i++)
        {
            sum = sum + f[i];
        }
        return sum;
    }

    //method to find product
    public static int findProduct(int[] fact)
    {
        int p = 1;
        for (int i = 0; i < fact.length; i++)
        {
            p = p * fact[i];
        }
        return p;
    }

    //method to find product of cubes
    public static double findCubeProduct(int[] factors)
    {
        double p = 1;
        for (int i = 0; i < factors.length; i++)
        {
            p = p * Math.pow(factors[i], 3);
        }
        return p;
    }

    public static void main(String[] args)
    {
    	Scanner kb=new Scanner(System.in);
    	//User Input
        System.out.println("Enter number-:");
        int num=kb.nextInt();

        // calling method
        int[] factors = findFactors(num);

        // Display
        System.out.println("Factors : ");
        for (int i = 0; i < factors.length; i++)
        {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        System.out.println("Greatest Factor -: " + findGreatest(factors));
        System.out.println("Sum -:" + findSum(factors));
        System.out.println("Product -: " + findProduct(factors));
        System.out.println("Product of Cubes -: " + findCubeProduct(factors));
        //Close scanner
        kb.close();
    }

}
