package extras;

import java.util.*;

public class LcmGcd 
{
	 //method to find gcd
    public static int gcd(int a, int b)
    {
        if (b == 0)
        {
            return a;
        }

        return gcd(b, a % b);
    }

    //method to find lcm
    public static int lcm(int a, int b)
    {
    	
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args)
    {
        //Open Scanner
        Scanner kb = new Scanner(System.in);

        //User Input
        System.out.print("Enter two numbers :-");
        int a = kb.nextInt();
        int b = kb.nextInt();

        //calling method
        int g=gcd(a, b);
        int l=lcm(a, b);

        //Display
        
        System.out.println("GCD -: " + g);
        
        System.out.println("LCM -:" + l);

        //Scanner closed
        kb.close();
    }

}
