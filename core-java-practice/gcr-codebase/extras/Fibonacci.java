package extras;

import java.util.*;

public class Fibonacci
{
	 public static void FibonacciNum(int n)
	    {
	        int a = 0;
	        int b = 1;

	        for (int i = 1; i <= n; i++)
	        {
	            System.out.print(a + " ");
	            int c = a + b;
	            a = b;
	            b = c;
	        }
	    }

	    public static void main(String[] args)
	    {
	    	
	        //Open Scanner
	        Scanner kb = new Scanner(System.in);

	        //User Input
	        System.out.print("Enter number of terms:-");
	        int n = kb.nextInt();

	        //calling method
	        FibonacciNum(n);

	        //Scanner closed
	        kb.close();
	        
	    }

}
