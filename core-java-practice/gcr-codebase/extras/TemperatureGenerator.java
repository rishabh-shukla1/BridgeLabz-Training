package extras;

import java.util.*;

public class TemperatureGenerator 
{
	 //method to convert Fahrenheit to Celsius
    public static double fToC(double f)
    {
        return (f - 32) * 5 / 9;
    }

    //method to convert Celsius to Fahrenheit
    public static double cToF(double c)
    {
    	
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args)
    {
        //Open Scanner
        Scanner kb = new Scanner(System.in);

        //User Input
        System.out.print("Enter temperature :-");
        double t = kb.nextDouble();

        System.out.print("Convert to C/F :-");
        char ch = kb.next().charAt(0);

        //Display
        if (ch == 'C' || ch=='c') {
            System.out.println("Celsius = " + fToC(t));
        }
        else
        {
            System.out.println("Fahrenheit = " + cToF(t));
        }

        //Scanner closed
        kb.close();
    }

}
