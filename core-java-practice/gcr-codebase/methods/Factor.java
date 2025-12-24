package methods;
import java.util.*;

public class Factor 
{
	 public static void main(String[] args) 
	 {

	        // Open Scanner
	        Scanner kb = new Scanner(System.in);

	        //User Input number
	        System.out.print("Enter a number : ");
	        int number = kb.nextInt();

	        // calling method
	        int[] factors = findFactors(number);

	        // Display factors
	        System.out.println("Factors are :-");
	        
	        for (int i = 0; i < factors.length; i++)
	        {
	            System.out.print(factors[i] + " ");
	        }
	        
	        System.out.println();

	        // calling methods
	        int sum = findSum(factors);
	        int product = findProduct(factors);
	        double squareSum = findSumOfSquares(factors);

	        // Display
	        System.out.println("Sum of factors -: " + sum);
	        System.out.println("Product of factors -: " + product);
	        System.out.println("Sum of squares of factors-:" + squareSum);

	        // Scanner closed
	        kb.close();
	    }

	    //method to find factors and store in array
	 
	    public static int[] findFactors(int n)
	    {
	        int count = 0;

	        for (int i = 1; i <= n; i++)
	        {
	            if (n % i == 0)
	                count++;
	        }

	        int[] a = new int[count];
	        int index = 0;

	        for (int i = 1; i <= n; i++)
	        {
	            if (n % i == 0)
	            {
	                a[index] = i;
	                index++;
	            }
	        }

	        return a;
	    }

	    //method to find sum
	    public static int findSum(int[] arr)
	    {
	        int sum = 0;

	        for (int i = 0; i < arr.length; i++)
	            sum = sum + arr[i];

	        return sum;
	    }

	    //method to find product
	    public static int findProduct(int[] arr)
	    {    //To Store Porduct
	        int p= 1;

	        for (int i = 0; i < arr.length; i++)
	            p = p * arr[i];

	        return p;
	    }

	    // method to find sum of squares
	    public static double findSumOfSquares(int[] arr)
	    {
	        double sum = 0;

	        for (int i = 0; i < arr.length; i++)
	            sum = sum + Math.pow(arr[i], 2);

	        return sum;
	    }

}
