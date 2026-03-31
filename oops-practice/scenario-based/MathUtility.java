package scenario_based;

import java.util.Scanner;

public class MathUtility
{
	
	 //Method to calculate factorial
    public static long factorial(int num)
    {
        if (num < 0)
        {
            System.out.println("Factorial not defined for negative numbers");
            return -1;
        }

        long fact = 1;

        for (int i = 1; i <= num; i++)
        {
            fact = fact * i;
        }

        return fact;
    }
    
     //Method to check if number is prime
    public static boolean isPrime(int num)
    {
        if (num <= 1)
            return false;

        for (int i = 2; i <= num / 2; i++)
        {
            if (num % i == 0)
                return false;
        }

        return true;
    }
    //Method to find GCD of two numbers
    public static int gcd(int a, int b)
    {

        while (b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
    //Method to find nth Fibonacci number
    
    public static int fibonacci(int n)
    {

        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        int a = 0, b = 1, c;

        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
    public static void main(String args[])
    {
    	Scanner kb=new Scanner(System.in);
    	
    	
    	
    	System.out.println("1:-Check Prime");
    	System.out.println("2:-Factorial");
    	System.out.println("3:-fibanacci");
    	System.out.println("4:-Gcd");
    	System.out.println("Enter the choice -:");
    	int c=kb.nextInt();
    	
    	
    	
    	if(c==1)
    	{
    		System.out.println("Enter Numbers-:");
    		int p = kb.nextInt();
            if (isPrime(p))
                System.out.println("Number is Prime");
            else
                System.out.println("Number is Not Prime");
    		
    	}
    	else if(c==2)
    	{
    		System.out.print("Enter number for factorial: ");
            int f = kb.nextInt();
            System.out.println("Factorial = " + factorial(f));
    		
    	}
    	else if(c==3)
    	{
    		 System.out.print("\nEnter n for Fibonacci: ");
    	     int n = kb.nextInt();
    	     System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
    		
    		
    	}
    	else if(c==4)
    	{
    		System.out.print("Enter two numbers for GCD:- ");
    		int x = kb.nextInt();
            int y = kb.nextInt();
            System.out.println("GCD = " + gcd(x, y));
    		
    	}
    	else {
    		System.out.println("Invalid Choice");
    	}
    	
    	
    	 
    	 
    	kb.close(); 
    	
    }
    

}
