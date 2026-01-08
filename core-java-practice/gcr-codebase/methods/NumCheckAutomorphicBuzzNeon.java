package methods;

import java.util.*;

public class NumCheckAutomorphicBuzzNeon
{
	//check prime
	 public static boolean isPrime(int n)
	    {
	        if (n <= 1) return false;

	        for (int i = 2; i <= n / 2; i++)
	        {
	            if (n % i == 0)
	                return false;
	        }
	        return true;
	    }

	    //method to check neon
	    public static boolean isNeon(int n)
	    {
	        int sq = n * n;
	        int sum = 0;

	        while (sq > 0)
	        {
	            sum = sum + (sq % 10);
	            
	            sq = sq / 10;
	        }
	        return sum == n;
	    }

	    //method to check spy
	    public static boolean isSpy(int n)
	    {
	        int sum = 0;
	        int prod = 1;

	        while (n > 0)
	        {
	            int d = n % 10;
	            sum = sum + d;
	            prod = prod * d;
	            n = n / 10;
	        }
	        return sum == prod;
	    }

	    //method to check automorphic
	    public static boolean isAutomorphic(int n)
	    {
	        int sq = n * n;
	        
	        return String.valueOf(sq).endsWith(String.valueOf(n));
	    }

	    // method to check buzz
	    public static boolean isBuzz(int n)
	    {
	    	
	        return (n % 7 == 0 || n % 10 == 7);
	    }

	    public static void main(String[] args)
	    {
	    	//user input
	    	Scanner kb=new Scanner(System.in);
	        System.out.println("Enter number-:");
	        int number=kb.nextInt();

	        // Display
	        System.out.println("Prime -:" + isPrime(number));
	        
	        System.out.println("Neon -:" + isNeon(number));
	        
	        System.out.println("Spy -:" + isSpy(number));
	        
	        System.out.println("Automorphic -: " + isAutomorphic(number));
	        
	        System.out.println("Buzz -:" + isBuzz(number));
	        
	        kb.close();
	        
	    }

}
