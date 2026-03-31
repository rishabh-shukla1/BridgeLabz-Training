package methods;
import java.util.*;

public class NumberCheckLevelTwo
{
	public static void main(String[] args)
	{

        //Open Scanner
        Scanner kb = new Scanner(System.in);

        // define array of 5 numbers
        int[] arr = new int[5];

        //taking input
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter number " + (i + 1) + " :-- ");
            arr[i] = kb.nextInt();
        }

        //checking each number
        for (int i = 0; i < arr.length; i++)
        {
            if (isPositive(arr[i]))
            {
                if (isEven(arr[i]))
                {
                    System.out.println(arr[i] + "-: is Positive and Even");
                }
                else 
                {
                    System.out.println(arr[i] + "-: is Positive and Odd");
                }
            }
            else
            {
                System.out.println(arr[i] + "-: is Negative");
            }
        }

        //comparing first and last
        
        int result = compare(arr[0], arr[arr.length - 1]);

        if (result == 1)
        {
            System.out.println("First number is greater than last");
        }
        else if (result == 0)
        {
            System.out.println("First number is equal to last");
        }
        else 
        {
            System.out.println("First number is less than last");
        }

        //Scanner closed
        kb.close();
    }

    // check positive
    public static boolean isPositive(int n)
    {
        return n >= 0;
    }

    // check even
    public static boolean isEven(int n)
    {
        return n % 2 == 0;
    }

    //compare two numbers
    public static int compare(int a, int b)
    {
        if (a > b)
        {
            return 1;
        }
        else if (a == b)
        {
            return 0;
        }
        else {
            return -1;
        }
    }

}
