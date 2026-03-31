package methods;

public class NumCheckSix
{
	// divisor sum
	
	 public static int findDivisorSum(int n)
	    {
	        int sum = 0;

	        for (int i = 1; i < n; i++)
	        {
	            if (n % i == 0)
	                sum = sum + i;
	        }
	        return sum;
	    }

	    // method to check perfect number
	 
	    public static boolean isPerfect(int n)
	    {
	        return findDivisorSum(n) == n;
	    }

	    // method to check abundant number
	    
	    public static boolean isAbundant(int n)
	    {
	        return findDivisorSum(n) > n;
	    }

	    //method to check deficient number
	    public static boolean isDeficient(int n)
	    {
	        return findDivisorSum(n) < n;
	    }

	    //method to find factorial
	    
	    public static int factorial(int n)
	    {
	        int f = 1;
	        for (int i = 1; i <= n; i++)
	        {
	            f = f * i;
	        }
	        return f;
	    }

	    // method to check strong number
	    
	    public static boolean isStrong(int n)
	    {
	        int temp = n;
	        int sum = 0;

	        while (temp > 0)
	        {
	            int d = temp % 10;
	            sum = sum + factorial(d);
	            temp = temp / 10;
	        }
	        return sum == n;
	    }

	    public static void main(String[] args)
	    {
	        int number = 145;

	        // Display
	        System.out.println("Perfect = " + isPerfect(number));
	        
	        System.out.println("Abundant = " + isAbundant(number));
	        
	        System.out.println("Deficient = " + isDeficient(number));
	        
	        System.out.println("Strong = " + isStrong(number));
	    }

}
